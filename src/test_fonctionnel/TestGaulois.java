package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Ast�rix", 8);
        Romain minus = new Romain("Minus", 6);

        asterix.parler("Bonjour � tous");

        minus.parler("UN GAU... UN GAUGAU...");

        // Ast�rix  le frappe trois fois
        for (int i = 0; i < 3; i++) {
            asterix.frapper(minus);
        }
    }
}