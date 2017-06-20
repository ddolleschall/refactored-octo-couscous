package tpclasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Figure implements Comparable<Figure>, Serializable {
	
	protected Couleur couleur;
	
	public  Couleur getCouleur(){
		return couleur;
	}
	
	private static int nbrefigrandom = 0;
	
	public String getId(){
		return  getType() + (nbrefigrandom++);
	}

	public void afficher() {
		System.out.println("C'est une figure de type : " + this); // méthode
																	// commune à
																	// toutes
																	// les
																	// figures
																	// non
																	// instanciées

	}

	public abstract String getType(); // méthode à redéfinir dans classes non abstraites
										
	public abstract void affCentre();

	public abstract Point getCentre();

	public abstract List<Point> getPoints();

	public abstract boolean couvre(Point p);

	public double distanceOrigine() {
		Point orig = new Point();
		List<Double> liste = new ArrayList<Double>();
		for (Point p : getPoints()) {
			liste.add(p.distanceOrigine(orig));
		}
		return Collections.min(liste);
	}

	public int compareTo(Figure o) {
		if (this.equals(o)) {
			return 0;
		}
		double d = (this.distanceOrigine());
		double d2 = (o.distanceOrigine());
		return (d2 - d) > 0 ? -1 : 1;

	}
	
	

}
