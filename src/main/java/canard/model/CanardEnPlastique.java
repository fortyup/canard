package canard.model;

import canard.model.vol.NePasVoler;

public class CanardEnPlastique extends Canard {

	public CanardEnPlastique(String name) {
		super(name, new NePasVoler());
	}

	@Override
	public String afficher() {
		return "Je suis un canard en plastique";
	}
}
