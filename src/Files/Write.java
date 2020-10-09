package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		
		// 1. Define the path
		String filename = "E:\\JAVA\\FILES\\FileToWrite.txt";
		String msg = "Writing Data.........";
		
		// 2. Create the File in Java
		File f = new File(filename);
		
		try {
			
			// 3. Open the file
			FileWriter fw;
			fw = new FileWriter(f);
			
			// 4. Write in file
			fw.write(msg);

			// 5. Close the resource
			fw.close();
			
		} catch (IOException e) {
			System.out.println("File Not Present.");
			e.printStackTrace();
		}finally {
			System.out.println("Closing File Writer.");
			
		}
		
	}

}
