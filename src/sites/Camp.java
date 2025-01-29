package sites;

import personnages.Soldat;

import java.util.ArrayList;
import java.util.List;

public class Camp {
    private String nom;
    private Soldat commandant;
    private List<Soldat> soldats;
    private static final int CAPACITE_CAMP = 4;

    public Camp(String nom, Soldat commandant) {
        this.nom = nom;
        this.commandant = commandant;
        this.soldats = new ArrayList<>();
    }

    public void ajouterSoldat(Soldat s) {
        if (soldats.size() < CAPACITE_CAMP) {
            soldats.add(s);
            s.parler();
        } else {
            System.out.println("Le romain " + commandant.getNom() + " : \"Désolé " + s.getNom() + " notre camp est complet !\"");
        }
    }

    public void afficherCamp() {
        System.out.println("Le camp dirigé par " + commandant.getNom() + " contient les soldats :");
        for (Soldat s : soldats) {
            System.out.println("- " + s.getNom());
        }
    }

    public void changerCommandant(Soldat nouveauCommandant) {
        if (nouveauCommandant.estCenturion()) {
            System.out.println("Le romain " + commandant.getNom() + " : \"Je laisse le commandement à " + nouveauCommandant.getNom() + "\".");
            commandant = nouveauCommandant;
            System.out.println("Le romain " + commandant.getNom() + " : \"Moi " + commandant.getNom() + " je prends la direction du camp romain.\"");
        } else {
            System.out.println("Le romain " + nouveauCommandant.getNom() + " : \"Je ne suis pas suffisamment gradé pour prendre la direction du camp romain.\"");
        }
    }
}
