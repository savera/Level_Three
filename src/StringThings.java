import java.util.ArrayList;
import java.util.Scanner;


public class StringThings {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String firstString = scanner.next();
		
		String secondString = scanner.next(); 
		
		//Print the total length of strings. 
		int totalLengthFirst = firstString.length(); 
		
		int totalLengthSecond = secondString.length(); 
		
		System.out.println("1. " + totalLengthFirst + " " + totalLengthSecond);
		
		//Determine if the firstString is lexicographically before the second.
		if(firstString.compareTo(secondString) <= -1){
			
			System.out.println("2. Lexicographically before");
			
		}else if(firstString.compareTo(secondString) >= 1){
			
			System.out.println("2. Lexicographically after");
			
		}else{
			
			System.out.println("2. Lexicographically equal");
			
		}
		
		//Capitalize and print out Strings. 
		String capitalFirst = firstString.toUpperCase(); 
		
		String capitalSecond = secondString.toUpperCase(); 
		
		System.out.println("3. " + capitalFirst + " " + capitalSecond);
		
		//Anagrams 
		ArrayList<String> alphabetically = new ArrayList<String>(); 
		
	
		
		firstString.
		
	}
	
}
