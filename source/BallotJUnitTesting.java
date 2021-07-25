import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BallotJUnitTesting{
Ballot ballot;
Candidate c1;
Candidate c2;
Candidate c3;
  @BeforeEach
  public void setUp(){
   ballot = new Ballot("Office of President");
   c1 = new Candidate("name1", "party1");
   c2 = new Candidate("name2","party2");
   c3 = new Candidate("name3","party3");
   ballot.addCandidate(c1);
   ballot.addCandidate(c2);
   ballot.addCandidate(c3);

  }

  @Test
  public void testOfficeName(){
    //test Office Name function
    //Basic test for a basic getter function
    assertEquals("Office of President", ballot.getOfficeName());
  }
  @Test
  public void testCandidateNames(){
    //test Both the add candidate function and get function
    //Create candidates add them to the arraylist and then print the arraylist
    ballot.addCandidate(c1);
    ballot.addCandidate(c2);
    ballot.getCandidates();
    // Write assertEquals
  }
  @Test
  public void testFindWinner(){
    //Test if Find winner is really finds highest vote reciever
    for (int i = 0; i<15; i++){
        c1.tallyVote();
    }
    for (int i = 0; i<45; i++){
        c2.tallyVote();
    }

    assertEquals(c2,ballot.findWinner());
  }
  @Test
  public void testTrueCheckTie(){
    for (int i = 0; i<15; i++){
        c1.tallyVote();
    }
    for (int i = 0; i<15; i++){
        c2.tallyVote();
    }

    assertEquals(true,ballot.checkTie());
  }
  @Test
  public void testFalseCheckTie(){
    for (int i = 0; i<15; i++){
        c1.tallyVote();
    }
    for (int i = 0; i<35; i++){
        c2.tallyVote();
    }

    assertEquals(true,!ballot.checkTie());
  }
  @Test void testTrueCheckTieBoundarycase1(){
    for (int i = 0; i<15; i++){
        c1.tallyVote();
    }
    for (int i = 0; i<15; i++){
        c2.tallyVote();
    }
    for (int i =0; i<35; i++){
      c3.tallyVote();
    }

    assertEquals(false,ballot.checkTie());
  }

  }
