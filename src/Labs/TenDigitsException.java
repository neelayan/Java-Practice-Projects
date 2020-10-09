package Labs;

public class TenDigitsException extends Exception {
	
	String phone;
	
	public TenDigitsException(String phone) {
		this.phone = phone;
	}

	public String toString() {
		return "ERROR : Number less than 10 digits : "+phone;
	}
}
