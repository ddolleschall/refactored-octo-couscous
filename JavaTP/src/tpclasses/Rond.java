package tpclasses;

import java.util.ArrayList;
import java.util.List;

public class Rond extends Figure implements Surfaceable {

	int r;
	Point cent;

	public Rond(Point cent, int r, Couleur color) {
		this.cent = cent;
		this.r = r;
		this.couleur = color;
	}
	
	public Rond(Point cent, int r){
		this (cent, r, Couleur.getCouleurDefaut());
	}

	public String toString() {
		return "[" + getType() + " " + cent + ", " + r + ", " + getCouleur().getCode() + "]";
	}

	public String getType() {
		return "ROND";
	}

	public void affCentre() {
		System.out.println("Le centre de ce rond est : " + cent);
	}

	public Point getCentre() {
		return cent;
	}

	public double surface() {
		return (Math.PI * r * r);
	}

	public void affSurface() {
		System.out.println("La surface de ce rond est : " + surface());
	}

	public List<Point> getPoints() {
		List<Point> liste = new ArrayList<Point>();
		liste.add(cent);
		return liste;
	}

	public boolean couvre(Point p) {
		int x2 = (p.getx() - cent.getx()) * (p.getx() - cent.getx());
		int y2 = (p.gety() - cent.gety()) * (p.gety() - cent.gety());
		int d = (int) Math.round(Math.sqrt(x2 + y2));
		return d <= r;

	}

	public boolean equals(Object o) {
		if (o instanceof Rond) {
			Rond rond = (Rond) o;
			if (cent.equals( rond.getCentre()) && r == rond.r && couleur.equals(rond.getCouleur())) {
				return true;
			}
		}
		return false;
	}
}
