package tpclasses;

public class Carré extends Rectangle implements Surfaceable {
	int coté;
	public Carré(Point coin1, int coté, Couleur color) {
		super (coin1, coté, coté, color);
		this.coté = coté;
		this.couleur = color;
	}
	public Carré(Point coin1, int coté) {
		super (coin1, coté, coté, Couleur.getCouleurDefaut());
		
	}
	public String getType(){
		return "CARRE";
	}
	public void affCentre(){
		System.out.println("Le centre de ce carré est : " + centrerect );
	}
	public void affSurface(){
		System.out.println("La surface de ce carré est de : " + surface());
	}
	
}

/*	Sans héritage : 
 
Point coin1;
Point coin2;
Point coin3;
Point coin4;
int coté;
public Carré(Point coin1, int coté) {
	super (coin1, int largeur, int longueur);
	this.coin1 = coin1;
	this.coté = coté;
	coin2 = new Point(coin1.getx()+coté,coin1.gety());
	coin3 = new Point(coin1.getx() , coin1.gety() + coté);
	coin4 = new Point(coin1.getx()+coté,coin1.gety() + coté);
	}

public String toString() {
	return "[CARRE " + coin1 + coin2 + coin3 + coin4 + "]";
}

public void afficher() {
	System.out.println(toString());
}
}*/
