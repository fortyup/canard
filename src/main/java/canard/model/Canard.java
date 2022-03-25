package canard.model;

public abstract class Canard {
	protected String name;

	Canard(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String nager() {
		return "Tous les canards flottent, même les leurres !";
	}
	
	public abstract String afficher();
}
