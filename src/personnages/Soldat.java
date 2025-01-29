package personnages;

public class Soldat {
    private String nom;
    private int force;
    private String grade; // SOLDAT, TESSERARIUS, OPTIO, CENTURION

    public Soldat(String nom, int force, String grade) {
        this.nom = nom;
        this.force = force;
        this.grade = grade;
    }

    public String getNom() {
        return nom;
    }

    public int getForce() {
        return force;
    }

    public String getGrade() {
        return grade;
    }

    public boolean estCenturion() {
        return "CENTURION".equals(grade);
    }

    public void parler() {
        System.out.println("Le romain " + nom + " : \"Je mets mon épée au service de Rome dans le camp dirigé par Minus\"");
    }
}



