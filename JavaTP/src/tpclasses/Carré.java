package tpclasses;

public class Carré extends Rectangle {
	int coté;
	public Carré(Point coin1, int coté) {
		super (coin1, coté, coté);
		this.coté = coté;
	}
	public String getType(){
		return "CARRE";
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
