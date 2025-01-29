package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois {
    private int dosesPotion;
    private double puissancePotion;
    private Random random;

    public Druide(String nom, int force) {
        super(nom, force);
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            e.printStackTrace();
        }
        dosesPotion = 0;
        puissancePotion = 1;
    }

    public void fabriquerPotion() {
        dosesPotion = random.nextInt(5) + 1; // Entre 1 et 5 doses
        puissancePotion = 2 + random.nextInt(5); // Entre 2 et 6 de puissance
        System.out.println("Le gaulois " + getNom() + " : \"J'ai concocté " + dosesPotion + " doses de potion magique. Elle a une force de " + puissancePotion + ".\"");
    }

    public void booster(Gaulois g) {
        if (dosesPotion > 0) {
            if (g.getNom().equals("Obélix")) {
                System.out.println("Le gaulois " + getNom() + " : \"Non, Obélix Non !... Et tu le sais très bien !\"");
            } else {
                g.boirePotion(puissancePotion);
                dosesPotion--;
                System.out.println("Le gaulois " + getNom() + " : \"Tiens " + g.getNom() + " un peu de potion magique.\"");
            }
        } else {
            System.out.println("Le gaulois " + getNom() + " : \"Désolé " + g.getNom() + " il n'y a plus une seule goutte de potion.\"");
        }
    }
}
