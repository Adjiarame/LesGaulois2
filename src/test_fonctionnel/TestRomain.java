package test_fonctionnel;

import personnages.Romain;

public class TestRomain {

    public static void main(String[] args) {

        Romain minus = new Romain("Minus", 6);

        System.out.println(minus);

        //  System.out.println(minus.getMinus());

        minus.parler("UN GAU... UN GAUGAU...");
    }
}