package personnages;

public class TestPersonnage {
    public static void main(String[] args) {
        // Test avec un Gaulois
        Gaulois asterix = new Gaulois("Astérix", 10);
        System.out.println("Nom : " + asterix.getNom());
        asterix.parler("Bonjour à tous !");
        
        // Test avec un Romain
        Romain minus = new Romain("Minus", 8);
        System.out.println("Nom : " + minus.getNom());
        minus.parler("Je suis prêt à combattre !");
    }
}
