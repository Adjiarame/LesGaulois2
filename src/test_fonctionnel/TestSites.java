package test_fonctionnel;

import personnages.*;
import sites.*;

public class TestSites {
    public static void main(String[] args) {
        // Création des gaulois
        Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
        Gaulois agecanonix = new Gaulois("Agecanonix", 1);
        Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
        Gaulois asterix = new Gaulois("Astérix", 5);
        Gaulois obelix = new Gaulois("Obélix", 15);
        Gaulois prolix = new Gaulois("Prolix", 2);

        // Création des soldats
        Soldat minus = new Soldat("Minus", 2, "SOLDAT");
        Soldat brutus = new Soldat("Brutus", 5, "CENTURION");
        Soldat milexcus = new Soldat("Milexcus", 2, "SOLDAT");
        Soldat tullius = new Soldat("Tullius Octopus", 2, "TESSERARIUS");
        Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, "OPTIO");

        // Création du village et du camp
        Village village = new Village("Village d'Astérix", vercingetorix);
        Camp camp = new Camp("Camp romain", minus);

        // Ajout des villageois
        village.ajouterVillageois(agecanonix);
        village.ajouterVillageois(assurancetourix);
        village.ajouterVillageois(asterix);
        village.ajouterVillageois(obelix);
        village.ajouterVillageois(prolix);  // Cela doit échouer, car le village est plein

        // Ajout des soldats
        camp.ajouterSoldat(brutus);
        camp.ajouterSoldat(milexcus);
        camp.ajouterSoldat(tullius);
        camp.ajouterSoldat(ballondebaudrus); // Le camp est complet à ce moment-là

        // Affichage du village et du camp
        village.afficherVillageois();
        camp.afficherCamp();

        // Changer le chef du village
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
        village.changerChef(abraracourcix);

        // Changer le commandant du camp
        Soldat chorus = new Soldat("Chorus", 4, "CENTURION");
        camp.changerCommandant(chorus);
    }
}
