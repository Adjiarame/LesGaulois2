package test_fonctionnel;

import personnages.Romain;

public class TestRomain {
    public static void main(String[] args) {
        Romain minus = new Romain("Minus", 6);
        System.out.println("Nom : " + minus.getNom());
        minus.parler("Je suis prêt à servir Rome !");
    }
}
