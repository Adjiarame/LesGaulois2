package personnages;

public class Romain extends Personnage {

    public Romain(String nom, int force) {
        super(nom, force);
    }

    @Override
    public void parler(String chaine) {
        System.out.println("Le romain " + nom + " : \"" + chaine + "\".");
    }

    @Override
    public void frapper(Personnage p) {
        System.out.println("Le romain " + nom + " donne un coup de force " + (force / 3) + " à " + p.getNom() + ".");
        p.recevoirCoup(force / 3);
    }

    @Override
    public void recevoirCoup(int forceCoup) {
        force -= forceCoup;
        if (force <= 0) {
            System.out.println("Le romain " + nom + " : J’abandonne...");
        } else {
            System.out.println("Le romain " + nom + " : Aïe !");
        }
    }
}

