package tpclasses;

import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Figure implements Surfaceable {
	Point rect;
	Point hautgauche;
	Point basdroite;
	Point hautdroite;
	Point centrerect;
	int largeur;
	int longueur;
	double rectsurf;

	public Rectangle(Point rect, int largeur, int longueur, Couleur color) {
		this.rect = rect;
		this.couleur = color;
		hautgauche = new Point(rect.getx(), rect.gety() + largeur);
		basdroite = new Point(rect.getx() + longueur, rect.gety());
		hautdroite = new Point(rect.getx() + longueur, rect.gety() + largeur);
		centrerect = new Point(rect.getx() + (longueur / 2), rect.gety() + (largeur / 2));
		rectsurf = largeur * longueur;

	}

	public Rectangle(Point rect, int largeur, int longueur) {
		this(rect, largeur, longueur, Couleur.getCouleurDefaut());
	}

	public Point getPointBasGauche() {
		return rect;
	}

	public Point getPointHautGauche() {
		return hautgauche;
	}

	public Point getPointBasDroite() {
		return basdroite;
	}

	public Point getPointHautDroite() {
		return hautdroite;
	}

	/*
	 * public String toString(){ return "[RECT "+ getPointBasGauche() +
	 * getPointHautGauche() + getPointBasDroite() + getPointHautDroite()+"]"; }
	 */
	public String toString() {
		return "[" + getType() + " " + getPointBasGauche() + getPointHautGauche() + getPointBasDroite()
				+ getPointHautDroite() + " " + getCouleur().getCode() + "]";
	}

	public String getType() {
		return "RECT";
	}

	public void affCentre() {
		System.out.println("Le centre de ce rectangle est : " + centrerect);
	}

	public Point getCentre() {
		return centrerect;
	}

	public double surface() {
		return rectsurf;
	}

	public void affSurface() {
		System.out.println("La surface de ce rectangle est de : " + surface());
	}

	public List<Point> getPoints() {
		List<Point> liste = new ArrayList<Point>();
		liste.add(rect);
		liste.add(hautgauche);
		liste.add(basdroite);
		liste.add(hautdroite);
		return liste;
	}

	public boolean couvre(Point p) {
		if ((int) p.getx() < rect.getx()) {
			return false;
		}
		if ((int) p.getx() > basdroite.getx()) {
			return false;
		}
		if ((int) p.gety() > hautgauche.gety()) {
			return false;
		}
		if ((int) p.gety() < rect.gety()) {
			return false;
		}
		return true;

	}

	/*
	 * public boolean equals(Object o){ if (o instanceof Rectangle || o
	 * instanceof Carré) { if (rect.equals(((Rectangle) o).rect) &&
	 * basdroite.equals(((Rectangle) o).basdroite) &&
	 * hautgauche.equals(((Rectangle) o).hautgauche) &&
	 * hautdroite.equals(((Rectangle) o).hautdroite)) { return true; } } return
	 * false; }
	 */

	public boolean equals(Object o){

		if(o instanceof Rectangle || o instanceof Carré){

			Rectangle r = (Rectangle) o;
			if ( rect.equals(r.getPointBasGauche()) 
					&& hautdroite.equals(r.getPointHautDroite())  
							&& couleur.equals(r.getCouleur()) ){
				return true;
			}
				
		} 
		return false;
	}

}
