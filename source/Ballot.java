
import java.util.ArrayList;

/**
* To have a ballot which has an arraylsit of candidates which are running for office: officeName
*@author Mason Boyce
*@version 1.0

*/
public class Ballot{
	/**
	*Name of office which the ballot is for
	*/
private String officeName;
/**
*the array list of candidates
*/
private ArrayList<Candidate> arrayOfCandidates;
/**
*Constructs the Ballot Method with officeName and arrayOfCandidates
*@param officeName the office name the candidate is running for

*/

	public Ballot(String officeName){
		this.officeName =  officeName;
		this.arrayOfCandidates = new ArrayList<Candidate>();
	}

	/*public Ballot(String issue, String description){
		this.issue =  issue;
		this.description = description;
	}*/

	/**
	*Getter Method for officeName
	*@return office: the office name the candidate is running for

	*/
	public String getOfficeName(){
    return officeName;
	}
	/**
	*takes Candidates in and adds them to an arraylist of candidtes
	*@param c Introduction of new Candidates on the ballot

	*/
	public void addCandidate(Candidate c){
		arrayOfCandidates.add(c);
	}
	/**
	*Getter Method for Array of Canidates
	*@return ArrayList of candidates

	*/
	public ArrayList<Candidate> getCandidates(){
    return arrayOfCandidates;
	}
	/**
	*Method to find the winner of the election
	*@return Candidate who won

	*/
	public Candidate findWinner(){
		Candidate winner = arrayOfCandidates.get(0);
		for (int i =1; i<arrayOfCandidates.size();i++){
			winner = winner.compareCandidate( arrayOfCandidates.get(i));
		}
		return winner;
	}
	/**
	*Method to print the winner of the election
	*@return String of who won and formated to match desired output file

	*/
	public String printWinningCandidate(Candidate winner){
		return ("WINNER: " + winner.getName() +" - " + winner.getAffiliation());
	}
	/**
	*Method to check if there was a tie
	*@return If there  was a tie or not

	*/
	public boolean checkTie(){
		Candidate other;
		Candidate winner = findWinner();

		//Delete the winner so you can compare winner to all other Candidates
		ArrayList withoutWinner = arrayOfCandidates;
		withoutWinner.remove(winner);

		//Loop to see if anyone has the same amount of votes as winner
		for (int i=0; i<arrayOfCandidates.size();i++){
			System.out.println("winner" +winner);
			 other = arrayOfCandidates.get(i);
			if (winner.getVoteCount() == other.getVoteCount()){
				//if tied return true
				return true;
		}
	}
	//else return false
		return false;

	}

}
