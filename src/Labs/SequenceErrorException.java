package Labs;

public class SequenceErrorException extends Exception {
	String phone;
	
	public SequenceErrorException (String phone) {
		this.phone = phone ;
	}
	
	public String toString() {
		return "ERROR : 911 Sequence detected: "+phone;
	}

}
