package exceptionFiles;

public class CommonExceptions {

	public static void main(String[] args) {
		int a =5;
		int b = 0;
		
		try {
			int c = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot Divide by 0.");
			System.out.println(e.toString());
		}

		finally {
			System.out.println("Finally-Block executed.");
		}
		System.out.println("--------END--------");

		String[] states = {"AB","CD","EF","GH"};		
		
		for(int i =0;i<=states.length;i++) {
			try {
			System.out.println(states[i]);
			}
			catch(Exception e) {
				System.out.println("Not enough space.");
				System.out.println(e.toString());
			}
			finally {
				System.out.println("Finally-Block executed.");
			}
		}

	}

}
