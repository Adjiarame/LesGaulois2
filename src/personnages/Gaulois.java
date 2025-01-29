package personnages;

public class Gaulois extends Personnage {
    private double boostPotion = 1;

    public Gaulois(String nom, int force) {
        super(nom, force);
    }

    public void boirePotion(double puissance) {
        boostPotion = puissance;
    }

    @Override
    public void frapper(Personnage p) {
        int forceCoup = (int) (getForce() * boostPotion);
        System.out.println(getNom() + " donne un grand coup de force " + forceCoup + " à " + p.getNom() + ".");
        p.recevoirCoup(forceCoup);
        
        // La puissance du boost diminue après chaque coup jusqu'à atteindre 1
        if (boostPotion > 1) {
            boostPotion = Math.max(1, boostPotion - 0.5);
        }
    }

    @Override
    public void parler(String chaine) {
        System.out.println("Le gaulois " + getNom() + " : \"" + chaine + "\".");
        System.out.println(donnerAuteur());
    }

    @Override
    public void recevoirCoup(int forceCoup) {
        System.out.println("Le gaulois " + getNom() + " : \"Aïe !\"");
    }
}
