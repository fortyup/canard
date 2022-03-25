package canard.model;

import canard.model.vol.ComportementVol;

public abstract class Canard {
	protected String name;
	protected ComportementVol comportementVol;

	Canard(String name, ComportementVol comportementVol) {
		super();
		this.name = name;
		this.comportementVol = comportementVol;
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
	
	public String effectuerVol() {
		return comportementVol.voler();
	}
}
