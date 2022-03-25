package canard.model;

import canard.model.cancan.Cancan;
import canard.model.vol.VolerAvecDesAiles;

public class Colvert extends Canard {

	public Colvert(String name) {
		super(name,new VolerAvecDesAiles(),new Cancan());
	}

	@Override
	public String afficher() {
		return "Je suis un vrai colvert";
	}
	
}
