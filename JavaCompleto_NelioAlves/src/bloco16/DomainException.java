package bloco16;

public class DomainException extends Exception { // pode herdar exception ou runtimeexception
	private static final long serialVersionUID = 1L; 
	
	public DomainException (String msg) {
		super(msg);
		
	}
}