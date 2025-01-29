package personnages;

public class Gaulois {
    private String nom;
    private int force;

    public Gaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getGaulois() {
        return nom;
    }

    public int getForce() {
        return force;
    }

    public static void main(String[] args) {

        Gaulois asterix = new Gaulois("Asterix", 8);

        System.out.println(asterix.getGaulois());
        //System.out.println(asterix);
    }

    public void parler(String chaine) {
        System.out.println("Le gaulois " + nom + " : \"" + chaine + "\".");
    }

    public void frapper(Romain romain) {
        System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
        romain.recevoirCoup(force / 3);
    }

    public char[] getRomain() {
        // TODO Auto-generated method stub
        return null;
    }
}
