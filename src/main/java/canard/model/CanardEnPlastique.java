package canard.model;

public class CanardEnPlastique extends Canard {

	public CanardEnPlastique(String name) {
		super(name);
	}

	@Override
	public String afficher() {
		return "Je suis un canard en plastique";
	}
}
