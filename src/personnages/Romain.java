package personnages;

public class Romain {

    private String nom;
    private int force;

    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String chaine) {
        System.out.println("Le romain " + nom + " : \"" + chaine + "\".");
    }

    public void recevoirCoup(int forceCoup) {
        force -= forceCoup;
        if (force <= 0) {
            force = 0;
            parler("J'abandonne...");
        } else {
            parler("Aïe !");
        }
    }

    public static void main(String[] args) {
        Romain minus = new Romain("Minus", 6);
        minus.parler("UN GAU... UN GAUGAU...");
        for (int i = 0; i < 2; i++) {
            minus.recevoirCoup(3);
        }
    }
}



