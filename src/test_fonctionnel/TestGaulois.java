package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main (String[] args) {
		
      Gaulois asterix = new Gaulois("Astérix", 8);
      Romain minus = new Romain ("Minus", 6);
      System.out.println(asterix.getGaulois());
      
      asterix.parler("Bonjour a tous");
	
	  minus.parler(" UN GAU… UN GAUGAU… ");
	  /*recevoicoup* et terminer question 10*/ 
	 
	  System.out.println(minus);
	  System.out.println(asterix);
	  for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
			minus.frapper(asterix);
	  }
	  
	  
	}
	//  System.out.println(minus.getMinus());
	  
	 public double calculForce(double force) {
			return force = force/3;
			}         
      
    
}
	


	
	

