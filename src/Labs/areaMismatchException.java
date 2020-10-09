package Labs;

public class areaMismatchException extends Exception {
	String phone;
	public	areaMismatchException(String phone) {
		this.phone= phone;
	}
	public String toString() {
		return "Area Code Error : "+phone+" : Cannot start with 0 or 5: "+phone;
	}

}
