package sites;

import personnages.Gaulois;

import java.util.ArrayList;
import java.util.List;

public class Village {
    private String nom;
    private Gaulois chef;
    private List<Gaulois> villageois;
    private static final int CAPACITE_VILLAGE = 4;

    public Village(String nom, Gaulois chef) {
        this.nom = nom;
        this.chef = chef;
        this.villageois = new ArrayList<>();
    }

    public void ajouterVillageois(Gaulois g) {
        if (villageois.size() < CAPACITE_VILLAGE) {
            villageois.add(g);
            System.out.println("Le gaulois " + chef.getNom() + " : \"Bienvenue " + g.getNom() + "!\"");
        } else {
            System.out.println("Le gaulois " + chef.getNom() + " : \"Désolé " + g.getNom() + " mon village est déjà bien rempli.\"");
        }
    }

    public void afficherVillageois() {
        System.out.println("Le village de " + chef.getNom() + " est habité par :");
        for (Gaulois g : villageois) {
            System.out.println("- " + g.getNom());
        }
    }

    public void changerChef(Gaulois nouveauChef) {
        System.out.println("Le gaulois " + chef.getNom() + " : \"Je laisse mon grand bouclier au grand " + nouveauChef.getNom() + "\".");
        chef = nouveauChef;
        System.out.println("Le gaulois " + nouveauChef.getNom() + " : \"Merci !\"");
    }
}
