package TP;

public class JavaTp04a {

	public static void main(String[] args) {
		float montant = Float.parseFloat(args[0]);
		float reduction = 0;
		System.out.println("Le montant est : " + montant);
		if (montant < 1000) {
			reduction = 0;
		} else if (montant < 2000) {
			reduction = (float) 0.01;
		} else if (montant < 5000) {
			reduction = (float) 0.03;
		} else if (5000 <= montant) {
			reduction = (float) 0.05;
		}

		float remise = (montant * reduction);

		System.out.println("La remise est de : " + remise);

		int poids = Integer.parseInt(args[1]);
		switch (poids) {
		case 1:
			System.out.println("petit");
		case 2:
			System.out.println("moyen");
		default:
			System.out.println("grand");
		}

	}
}
