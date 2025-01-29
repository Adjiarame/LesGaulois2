package test_fonctionnel;

import personnages.*;

public class TestGaulois {
    public static void main(String[] args) {

        // Création du druide et des personnages
        Druide panoramix = new Druide("Panoramix", 5);
        Gaulois asterix = new Gaulois("Asterix", 5);
        Gaulois obelix = new Gaulois("Obélix", 15);
        Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
        Gaulois agecanonix = new Gaulois("Agecanonix", 1);
        Romain minus = new Romain("Minus", 6);

        // Fabrication de potion
        panoramix.fabriquerPotion();

        // Distribution de la potion
        panoramix.booster(asterix);
        panoramix.booster(obelix);
        panoramix.booster(assurancetourix);
        panoramix.booster(abraracourcix);
        panoramix.booster(agecanonix);

        // Début du combat
        System.out.println("Début du combat entre Asterix et Minus !");
        while (!minus.estAterre() && !asterix.estAterre()) {
            asterix.frapper(minus);
            if (!minus.estAterre()) {
                minus.frapper(asterix);
            }
        }
    
    }
}
       