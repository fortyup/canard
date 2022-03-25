package canard.model;

import canard.model.cancan.ComportementCancan;
import canard.model.vol.ComportementVol;

public abstract class Canard {
	protected String name;
	protected ComportementVol comportementVol;
	protected ComportementCancan comportementCancan;

	Canard(String name, ComportementVol comportementVol, ComportementCancan comportementCancan) {
		super();
		this.name = name;
		this.comportementVol = comportementVol;
		this.comportementCancan = comportementCancan;
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
	
	public String effectuerCancan() {
		return comportementCancan.cancaner();
	}

	public ComportementVol getComportementVol() {
		return comportementVol;
	}

	public void changerComportementVol(ComportementVol comportementVol) {
		this.comportementVol = comportementVol;
	}

	public ComportementCancan getComportementCancan() {
		return comportementCancan;
	}

	public void changerComportementCancan(ComportementCancan comportementCancan) {
		this.comportementCancan = comportementCancan;
	}
	
	
}
