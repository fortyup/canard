package canard.application;
import canard.model.Colvert;
import canard.model.PrototypeCanard;
import canard.model.vol.PropulsionAReaction;

public class ScenarioCanard {

    private static final String LIGNE = "-----------------";

    public static void main(String[] args) {
    	Colvert colvert = new Colvert("Piero");
    	PrototypeCanard protocanard = new PrototypeCanard("Donald");
    	
        new PrototypeCanard("Donald");
        System.out.println(LIGNE);
        System.out.println("Scenario des canards");
        System.out.println(LIGNE);
        
        // Canard colvert
        System.out.println(colvert.afficher());
        System.out.println(colvert.nager());
        System.out.println(colvert.effectuerCancan());
        System.out.println(colvert.effectuerVol());
        System.out.println();
        
        // Prototype canard
        System.out.println(protocanard.afficher());
        System.out.println(protocanard.effectuerVol());
        protocanard.changerComportementVol(new PropulsionAReaction());
        System.out.println(protocanard.effectuerVol());
        System.out.println();

        }


    }
