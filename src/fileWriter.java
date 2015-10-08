import java.io.File; 

import java.io.FileWriter; 

public class fileWriter {
	
	public static void main(String[] args) {
		
		File file = new File("AnyFileName.txt");
		
		System.out.println(file.getAbsolutePath());
		
		try{
		
		FileWriter fw = new FileWriter(file, true); 
		
		fw.write("Hello World!");
		
		fw.close();
		
		} catch(Exception e){
			
			System.out.println("Sorry, file not found!");
			
		}
		
		
	}

}
