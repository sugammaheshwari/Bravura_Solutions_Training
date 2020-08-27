package customException;

public class ProductNotFoundException extends Exception {

	String messege;

	public ProductNotFoundException(String messege) {
		super();
		this.messege = messege;
	}

	@Override
	public String toString() {
		return "ProductNotFoundException [messege=" + messege + "]";
	}
	
	
	
	
}
