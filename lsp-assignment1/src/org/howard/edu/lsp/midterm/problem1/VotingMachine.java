package org.howard.edu.lsp.midterm.problem1;
import java.util.HashMap;


public class VotingMachine {
		HashMap<String, Integer> arrayOfCandidates = new HashMap<String, Integer>();
			
		/**
		 * adds the name of the candidates/name of the voter to the list, with a check intitilaization
		 * @param nameOfVoter
		 */
		public void addCandidate(String nameOfVoter) {
			int check = 0;
			
			arrayOfCandidates.put(nameOfVoter, check);
		}
		
		
		/**
		 * this function cast the votes given by a the people for a certain candidates to their name
		 * @param name
		 * @param votes
		 */
		public void castVotes(String name, int votes) {
			for(String i : arrayOfCandidates.keySet()) {
				if (name.equals(i)) {
					int num = arrayOfCandidates.get(name);
					num = num + votes;
					arrayOfCandidates.replace(name, num);
				}
			}
		}
		
		
		/**
		 * this function returns the number of votes that a candidate was given
		 * @param namesCollected
		 * @return
		 * @throws UnknownCandidateException
		 */
		public int getVotes(String namesCollected) throws UnknownCandidateException {
			if(!(arrayOfCandidates.containsKey(namesCollected))) {
				throw new UnknownCandidateException("");
					// System.ln("Invalid entry");
					}
			int totalNumVotes = 0;
			if (arrayOfCandidates.containsKey(namesCollected)) {
				totalNumVotes = arrayOfCandidates.get(namesCollected);
		}
			return totalNumVotes;
		}

		
		/**
		 * this returns the total number of votes for every candidate on by one
		 * @return
		 */
		public int sum() {
			int sum = 0;
			// String total;
			
			for (String total1 : arrayOfCandidates.keySet()) {
				sum = sum + arrayOfCandidates.get(total1);
		}
			return sum;
			// Return the total number of votes for all candidates.	
		}
	}

	