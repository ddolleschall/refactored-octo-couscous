package tpclasses;

public class Carr� extends Rectangle {
	int cot�;
	public Carr�(Point coin1, int cot�) {
		super (coin1, cot�, cot�);
		this.cot� = cot�;
	}
	public String getType(){
		return "CARRE";
	}
}

/*	Sans h�ritage : 
 
Point coin1;
Point coin2;
Point coin3;
Point coin4;
int cot�;
public Carr�(Point coin1, int cot�) {
	super (coin1, int largeur, int longueur);
	this.coin1 = coin1;
	this.cot� = cot�;
	coin2 = new Point(coin1.getx()+cot�,coin1.gety());
	coin3 = new Point(coin1.getx() , coin1.gety() + cot�);
	coin4 = new Point(coin1.getx()+cot�,coin1.gety() + cot�);
	}

public String toString() {
	return "[CARRE " + coin1 + coin2 + coin3 + coin4 + "]";
}

public void afficher() {
	System.out.println(toString());
}
}*/
