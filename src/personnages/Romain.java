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
	public static void main (String[] args) {
		
	      Gaulois minus = new Gaulois("Minus", 6);
		
		  System.out.println(minus.getRomain());

	}
public void parler(String chaine) {
		System.out.println("Le romain " + nom + " : \"" +  chaine  + "\".");
	}
	public void recevoirCoup(int forceCoup) {
		force = force - forceCoup; 
		if (force <= 0) {
			force = 0; 
			parler("J'abandonne");
		}
		else {
			parler( "Aie ! ");
		
		/*public void recevoirCoup(double forceCoup) {
				//force = (int) (force - forceCoup); 
				double force = calculForceCoup(forceCoup); 
				if (force <= 0) {
					force = 0; 
					System.out.println("Le " + donnerAuteur() + nom + " : " + "J'abandonne");
				}
				else {
					System.out.println("Le " + donnerAuteur() + nom + " : " + "Aie ! ");
				}*/
			}
		
		}
	
        
	public void frapper(Gaulois asterix) {

		
	}
}



