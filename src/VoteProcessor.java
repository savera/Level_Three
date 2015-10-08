import java.util.ArrayList;


public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes){
		
		String topVotes = ""; 

		int popeFrancisVotes = 0; 
		
		int edwardSnowdenVotes = 0;
		
		for (int i = 0; i < votes.size(); i++) {
			
			String s = votes.get(i);
		
			if(s.equalsIgnoreCase("pope francis"))	
			{
				
				popeFrancisVotes = popeFrancisVotes + 1; 
				
			}
			else{
				
				edwardSnowdenVotes = edwardSnowdenVotes++; 
				
			}
		}
		
		//System.out.println(edwardSnowdenVotes);
		
		System.out.println(popeFrancisVotes);
		
		if(popeFrancisVotes == edwardSnowdenVotes){
			
			topVotes = "TIE";
			
		}else if(popeFrancisVotes > edwardSnowdenVotes){
			
			 topVotes = "pope francis";
			
		}else{
			
			topVotes = "edward snowden"; 
			
		}
		
		return topVotes; 
	}
	
}

