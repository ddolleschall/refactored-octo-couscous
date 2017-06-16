package tpclasses;

public class Segment extends Figure {
	Point debut;
	int seglongeur;
	boolean horizontal;
	Point segcentre;
	Point segfin;
	
	public Segment(Point debut, int seglongueur, boolean horizontal) {
		this.debut = debut;
		this.horizontal = horizontal;
		this.seglongeur = seglongueur;
		if (horizontal) {
			segfin = new Point(debut.getx() + seglongueur, debut.gety());
			segcentre = new Point(debut.getx() + (seglongueur / 2), debut.gety());
		} else {
			segfin = new Point(debut.getx(), debut.gety() + seglongueur);
			segcentre = new Point(debut.getx(), debut.gety() + (seglongueur / 2));
		}
	}

	public String toString() {
		return "[" + getType() + " " + debut + segfin + "]";
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
	public Point[] getPoints(){
		return new Point[] {debut,segfin};
	}

}
