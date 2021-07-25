
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
/**
* BallotReader takes in an input file and assigns the ballot and adds the candidates
*@author Mason Boyce
*@version 1.0

*/
public class BallotReader{
	/**
	*Method to input a file and return a ballot to be voted on
	*@param filename the name of the input file
	*@return the ballot created by reading the input file

	*/
	public static Ballot readBallot(String filename)
	throws IOException {
		String candidateName;
		String partyAffliation;

		// Open the file and start  scanning it
		FileInputStream fin = new FileInputStream(filename);
		Scanner scnr = new Scanner(fin); //Scans into filename
		//Scans first line and initilizes the ballot
		String officeName = scnr.nextLine();
		Ballot ballot = new Ballot(officeName); //decarling the Ballot

		if (scnr.hasNextInt()) {  // Checking if Ballot's format is correct by having number be next
			int numCandidates = scnr.nextInt();

			for (int i = 0; i<=numCandidates; i++ ){
					String candidateAndParty = scnr.nextLine();

					for (int j=0; j<candidateAndParty.length(); j++){
						//Getting rid of the colon seperating candidate name and Party Afflitation
							if (candidateAndParty.charAt(j) == (';')){
								 candidateName  = candidateAndParty.substring(0,j);

								partyAffliation  = candidateAndParty.substring(j+1);

								ballot.addCandidate(new Candidate(candidateName, partyAffliation));
							}
					}



			}
		}
		else{
			System.out.println("Input Error on the Second Line need Number.\n See User Manual for Example");
		}
		return ballot;
	}
}
