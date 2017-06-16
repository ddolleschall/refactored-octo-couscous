package TP;

public class JavaTp07 {

	public static void main(String[] args) {
		int nb = Integer.parseInt(args[0]);
		int premier = 1;
		int compteur = 0;
		divis : while (compteur < nb) {							// nombre de premiers à afficher
			premier++;											// vérification du nombre suivant
			 for (int i = 2; i <= Math.sqrt(premier); i++) {	// boucle de test vérification si premier
				int mod = (premier % i);
				if (mod == 0)
				{
					continue divis;								// si non premier, continuer vers nombre suivant
					
				}									
			}System.out.println(premier);						// si premier, afficher
			compteur++;											// nombre de premiers affichés
		}
		
	}
}

