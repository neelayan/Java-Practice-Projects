package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		
		// 1. Define the file path
		String fileloc = "E:\\JAVA\\FILES\\GRAPH_TUTORIAL.txt";
		String text = null;
		
		// 2. Create new file in JAVA
		File f = new File(fileloc);
		
		
		try {
			// 3. Open the file
			BufferedReader br;
			br = new BufferedReader(new FileReader(f));

			// 4. Read the file
			text = br.readLine();
			
			// 5. Close resource
			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("ERROR : File Not Found : "+fileloc);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR : Could Not read the data : "+fileloc);
			e.printStackTrace();
		}finally {
			System.out.println("FINISHED reading file.");
		}
				
		System.out.println(text);
		
	}

}
