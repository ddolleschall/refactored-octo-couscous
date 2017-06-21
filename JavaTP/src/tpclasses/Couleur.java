package tpclasses;

public enum Couleur {
	Noir("N"), Rouge("R"), Bleu("B"), Jaune("J"), Vert("V");

	private String code;

	Couleur(String abr) {			//Constructeur avec le code de la couleur correspondante
		code = abr;
	}

	public String getCode() {
		return code;
	}

	static Couleur getCouleurDefaut() {
		return Couleur.Noir;
	}
}
