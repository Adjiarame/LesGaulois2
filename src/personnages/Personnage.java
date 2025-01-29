package personnages;

public abstract class Personnage {
    protected String nom;
    protected int force;
    
    public Personnage(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public int getForce() {
        return force;
    }

    public abstract void parler(String chaine);

    public void frapper(Personnage p) {
        System.out.println(nom + " donne un coup de force " + (force / 3) + " à " + p.getNom() + ".");
        p.recevoirCoup(force / 3);
    }

    public void recevoirCoup(int forceCoup) {
        force -= forceCoup;
        if (force <= 0) {
            System.out.println(nom + " : J’abandonne...");
        } else {
            System.out.println(nom + " : Aïe !");
        }
    }

    public boolean estAterre() {
        return force <= 0;
    }


    //donner l'auteur
    public String donnerAuteur() {
        return "Auteur inconnu";
    }
}
