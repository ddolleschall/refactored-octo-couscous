package tpclasses;

import java.util.ArrayList;
import java.util.List;

public class Segment extends Figure {
	Point debut;
	int seglongeur;
	boolean horizontal;
	Point segcentre;
	Point segfin;
	
	public Segment(Point debut, int seglongueur, boolean horizontal, Couleur color) {
		this.debut = debut;
		this.horizontal = horizontal;
		this.seglongeur = seglongueur;
		this.couleur = color;
		
		if (horizontal) {
			segfin = new Point(debut.getx() + seglongueur, debut.gety());
			segcentre = new Point(debut.getx() + (seglongueur / 2), debut.gety());
		} else {
			segfin = new Point(debut.getx(), debut.gety() + seglongueur);
			segcentre = new Point(debut.getx(), debut.gety() + (seglongueur / 2));
		}
	}
	public Segment(Point debut, int seglongueur, boolean horizontal) {
		this (debut, seglongueur, horizontal, Couleur.getCouleurDefaut());
	}

	public String toString() {
		return "[" + getType() + " " + debut + segfin + " " + getCouleur().getCode() + "]";
	}

	public String getType() {
		return "SEGMENT";
	}

	public void affCentre() {
		System.out.println("Le centre de ce segment est : " + segcentre);
	}

	public Point getCentre() {
		return segcentre;
	}
	public List<Point> getPoints(){
		List<Point> liste = new ArrayList<Point>();
		liste.add(debut);
		liste.add(segfin);
		return liste;
	}

	
	public boolean couvre(Point p) {
		if (p.getx() < debut.getx()){
			return false;
		}
		if (p.getx() > segfin.getx()){
			return false;
		}
		if (p.gety() < debut.gety()){
			return false;
		}
		if (p.gety() > segfin.gety()){
			return false;
		}
		return true;
	}
	public boolean equals(Object o){
		if (o instanceof Segment){									// pour éviter comparaison entre différents éléments
			Segment s = (Segment) o;
			if (debut.equals(s.debut) 
					&& segfin.equals(s.segfin)
					&& couleur.equals( s.getCouleur()) ) {
				return true;
			}
		}return false;
	}

}
