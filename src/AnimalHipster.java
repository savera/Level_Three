import java.util.ArrayList;
import java.util.HashMap;


public class AnimalHipster {
	

	public ArrayList<String> findAnimalHipsters(HashMap<String, ArrayList<String>> network, HashMap<String, String> favoriteAnimal){
	
		ArrayList<String> animalHipster = new ArrayList<String>();
	
		
		for (String s : favoriteAnimal.keySet()) {
			
			boolean match = false;
			
			String p = favoriteAnimal.get(s);
			
			for(String b : network.get(s)){ 
				
				String f = favoriteAnimal.get(b); 
				
				if (favoriteAnimal.get(b).equals(p)){
					
					match = true; 
					
					break; 
					
				}

			}
			
			if(!match){
				
				animalHipster.add(s);
				
			}
			
			System.out.println(animalHipster);
		}	
	
	return animalHipster; 
	}
	
}
