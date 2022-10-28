package org.howard.edu.lsp.midterm.problem1;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;



public class VotingMachineTestCases {
	
	@Test
	public void getVotesTestCase() throws UnknownCandidateException {
		VotingMachine arrayOfCandiates = new VotingMachine();
		arrayOfCandiates.addCandidate("Joshua");
		arrayOfCandiates.addCandidate("Hannah");
		arrayOfCandiates.addCandidate("Davida");
		arrayOfCandiates.addCandidate("Nina");
		arrayOfCandiates.addCandidate("Chris");
		
		assertEquals(0, arrayOfCandiates.getVotes("Joshua"));
		assertEquals(0, arrayOfCandiates.getVotes("Nina"));
		assertEquals(0, arrayOfCandiates.getVotes("Davida"));
		assertEquals(0, arrayOfCandiates.getVotes("Chris"));
		assertEquals(0, arrayOfCandiates.getVotes("Hannah"));
		
	}
	
	public void sumTestCase() {
		VotingMachine arrayOfCandiates = new VotingMachine();
		arrayOfCandiates.addCandidate("Joshua");
		arrayOfCandiates.addCandidate("Hannah");
		arrayOfCandiates.addCandidate("Davida");
		arrayOfCandiates.addCandidate("Nina");
		arrayOfCandiates.addCandidate("Chris");
		
		arrayOfCandiates.castVotes("Hannah", 15);
		arrayOfCandiates.castVotes("Davida", 5);
		arrayOfCandiates.castVotes("Nina", 25);
		arrayOfCandiates.castVotes("Chris", 10);
		arrayOfCandiates.castVotes("Joshua", 20);
		
		assertEquals(65, arrayOfCandiates.sum());
		
		
		
	}

}