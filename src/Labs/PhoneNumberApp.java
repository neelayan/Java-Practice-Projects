package Labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		
		String filename = "E:\\JAVA\\FILES\\PhoneNumber.txt";
		
		File f = new File(filename);
		
		String phoneNum =null;
		String[] phones = new String[9];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			for(int i =0;i<phones.length;i++) {
				phones[i] = br.readLine();
			}
			br.close();
		
			
		} catch (FileNotFoundException x) {
			System.out.println("ERROR : FILE NOT FOUND.");
			//x.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR : CANNOT READ.");
			e.printStackTrace();
		}
		
		
		// Read the file and retrieve phone number
				//Valid phone number
					// 10 digits
					//Area code cannot start in 0 or 9
					//Cannot contain 911
		for(int x =0; x<phones.length;x++) {
			phoneNum = phones[x];
			try {
				if(phoneNum.length() !=10) {
					throw new TenDigitsException(phoneNum);
				}
				if((phoneNum.substring(0,1).equals("0")) || (phoneNum.substring(0, 1).equals("5"))) {
					throw new areaMismatchException(phoneNum);
				}
				for(int n=0 ; n<phoneNum.length()-2; n++) {
					if(phoneNum.substring(n, n+1).equals("9")){
						if(phoneNum.substring(n+1, n+3	).equals("11")) {
							throw new SequenceErrorException(phoneNum);
						}
					}
				}
			}
			catch(TenDigitsException e) {
				System.out.println(e.toString());
			}
			catch(areaMismatchException e) {
				System.out.println(e.toString());
			}
			catch(SequenceErrorException e) {
				System.out.println(e.toString());
			}
			finally {
				System.out.println("CHECK COMPLETED : "+phoneNum);
			}
		}
	}

}


