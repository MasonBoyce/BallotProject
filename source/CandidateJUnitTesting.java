import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class CandidateJUnitTesting{
      private Candidate c1;
      private Candidate c2;
      //Test Tally vote
      //Test voteCount
      //Test Compare Candidate
      @BeforeEach
      public void setUp(){
      c1 = new Candidate("Mason Boyce", "Knicks");
      c2 = new Candidate("Lebron James", "Lakers");
      }

      @Test
      public void testCandidateName(){
        //test Candidate Name function
        //Basic test for a basic getter function
        assertEquals("Mason Boyce", c1.getName());
      }

      @Test
      public void testCandidateAffiliation(){
        // test  candidate Afflilation
        //Basic test for basic getter function
        assertEquals("Knicks", c1.getAffiliation());
      }
      @Test
      public void testTallyVote(){
        //Test votecount and  tally vote
        //Basic test for basic addition function
        for (int i = 0; i<10; i++){
          c1.tallyVote();
        }
        assertEquals(10, c1.getVoteCount());
      }
      @Test
      public void testCorrectCompareCandidates(){
        //Test Compare Candidates
        //Testing 3 Different Cases
        //This is a correct Case
        for (int i = 0; i<10; i++){
          c1.tallyVote();
        }
        for (int i = 0; i<25; i++){
          c2.tallyVote();
        }
        assertEquals(c2, c1.compareCandidate(c2));
        assertEquals(c2, c2.compareCandidate(c1));

      }
      @Test
      public void testIncorrectCompareCandidates(){
          //Test votecount and  tally vote
          //Testing 3 Different Cases
          //Testing an incorrect Comparasion of candidates
          for (int i = 0; i<15; i++){
              c1.tallyVote();
          }
          for (int i = 0; i<45; i++){
              c2.tallyVote();
          }
          assertEquals(c1, c1.compareCandidate(c2));
          assertEquals(c1, c2.compareCandidate(c1));

        }
        @Test
        public void testBoundary1CompareCandidates(){
            //Test votecount and  tally vote
            //Testing 3 Different Cases
            //Test Boundary Case where the two candidates are Tied
            // The code dictates that unless the new candidate has more votes than previous one return previous
            // Correct answer should be c1
            for (int i = 0; i<25; i++){
                c1.tallyVote();
            }
            for (int i = 0; i<25; i++){
                c2.tallyVote();
            }
            assertEquals(c1, c1.compareCandidate(c2));
            assertEquals(c2, c2.compareCandidate(c1));

          }
          @Test
          public void testBoundary2CompareCandidates(){
              //Test votecount and  tally vote
              //Testing 3 Different Cases
              //Test Boundary Case where one candidate recieves zero votes

              for (int i = 0; i<25; i++){
                  c2.tallyVote();
              }
              assertEquals(c2, c1.compareCandidate(c2));
              assertEquals(c2, c2.compareCandidate(c1));

            }

        }
