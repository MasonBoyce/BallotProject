import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
/*
* ResultWritter will write the results as it takes in a ballot and a filename and will write the results to the user.
*/

public class ResultWriter{

	/**
	*Method to write the results in a new file
	*@param filename takes in the filename which the method will write the results to
	*@param ballot  takes in a ballot to display the results of he election
	*/

	public static void writeResults(String filename, Ballot ballot)
	throws IOException {
				ArrayList<Candidate> candidates = new ArrayList<Candidate>();
				candidates = ballot.getCandidates();
				Candidate winner = ballot.findWinner();

				//Openning Up File Output Stream
				FileOutputStream output = new FileOutputStream(filename);
				PrintWriter writer = new PrintWriter(output);
				writer.println(ballot.getOfficeName());
				// Dashes as much as characters
				for (int i=0; i<ballot.getOfficeName().length();i++){
				writer.print ("-");
				}
				writer.println();
				//
				String concatToStringVoteAmount;
				int longestPrintLength = 0;

				for (Candidate i: candidates){
					concatToStringVoteAmount = i.toString() + String.valueOf(i.getVoteCount());
					if (longestPrintLength< concatToStringVoteAmount.length()){
					longestPrintLength = concatToStringVoteAmount.length();
				}
			}

				int lengthVoteCount; //int length of vote to know
				int standardSpace  = 12; // Standard spaciang apart from biggest
				int numSpacesNeeded; // spaces need for each indivual Candidate
				int numShorterThanLongests; //Diff btwn longest and current

				for (Candidate i: candidates){
					writer.print(i);  //write the left justified Candidate to file

					//Find the amount of spaces needed
					lengthVoteCount = String.valueOf(i.getVoteCount()).length();
					numShorterThanLongests = longestPrintLength - i.toString().length();
					numSpacesNeeded = standardSpace +  numShorterThanLongests;
					for (int j =0;j<numSpacesNeeded;j++){ //Add amount of spaces needed by looping
							writer.print(" ");
						}
					//finally add the vote count
					writer.println(i.getVoteCount());
				}
				//Check if tie before displaying a winner
				if (!ballot.checkTie()){
				writer.println("\n  " +ballot.printWinningCandidate(winner));
				}
				else{
					writer.println("\n  There is a tie. Please vote again!");
				}
				writer.close();
	}
}
