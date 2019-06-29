package ir.ac.um.k8s.beans;

public class Welcome {

	public Welcome(String message) {
		super();
		this.message = message;
	}

	private final String message;

	public String getMessage() {
		return message;
	}

}