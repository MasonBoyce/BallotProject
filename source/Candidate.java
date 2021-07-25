/**
* To have a Candidate with a name party affliation and a measure and way to increase voteCount
*@author Mason Boyce
*@version 1.0

*/
public class Candidate{
	/**
	*Name  of Candidate
	*/
private String name;
/**
*Name  of affliation
*/
private String affiliation;
/**
*Name  of voteCount
*/
private int voteCount;

/**
*Constructs the Candidate Method with name, affiliation, and voteCount
*@param name the name of the Canidate running for office
*@param affiliation the party affiliation of the Candidate

*/
	public Candidate(String name, String affiliation){
		this.name = name;
		this.affiliation = affiliation;
		this.voteCount = 0;
	}

	/**
	*Getter Method that returns Candidate's Name
	*@return name returns Candidate's Name

	*/
	public String getName(){
    return name;
	}
	/**
	*Getter Method that returns Candidate's affiliation
	*@return name returns Candidate's affiliation

	*/
	public String getAffiliation(){
    return affiliation;

	}
	/**
	*Getter Method for the voteCount for a candidate
	*@return voteCount returns the votecount of the candidate

	*/
	public int getVoteCount(){
    return voteCount;
	}
	/**
	* Tally votes by increasing voteCount by 1 everytime it is called.

	*/

	public void tallyVote(){
		voteCount++;
	}
	/**
	*Method to compare two candidates and see who has more votes
	*Note stays with current if they are tied
	*@param c2 A candidate which you want to compare votes to
	*@return Candidate who has more votes

	*/
	public Candidate compareCandidate(Candidate c2){
			if (this.getVoteCount() >= (c2.getVoteCount()))	{
				return this;
			}
			else{
				return c2;

			}

	}

	/**
	* Overriding the toString() Method of the Object Candidate to include name, affiliation, and voteCount
	*@return the name party affliation and votecount in a string

	*/
	@Override
	public String toString(){
    return (this.getName() + " - " +this.getAffiliation());
	}
}
