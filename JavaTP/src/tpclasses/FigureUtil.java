package tpclasses;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class FigureUtil {

	static Random rand = new Random(); // variables li�e aux m�thodes static
										// doivent �tre static

	public static Point getRandomPoint() { // static => pas besoin de cr�er une
											// nouvelle instance
		return new Point(rand.nextInt(50), rand.nextInt(50)); // Obtenir un
																// nouveau point
																// en appelant
																// la m�thode
	}
	
	/*public static Point[] getPoints(Figure... tabfig){
		int comppts = 0;
		for(int i = 0; i < tabfig.length; i++) {				//parcourir les figures du tableau
			comppts += tabfig[i].getPoints().length;			// obtenir le nombre de points � chaque figure du tableau
		}														// afin de l'int�grer dans...
		Point[] tableau = new Point[comppts];					// nouveau tableau de points contenant tous les points
		comppts = 0;
		for(int i = 0; i < tabfig.length; i++){					
			for(Point p123 : tabfig[i].getPoints()){			// � chaque point de chaque figure
				tableau[comppts] = p123;						// ajouter les coordonne�s du point au tableau final
				comppts++;										// coordonn�es du point suivant int�gr� � la valeur suivante du tableau
			}
		}return tableau;
	}*/
	
	public static Point[] getPoints(Figure... tabfig){
		int comppts = 0;
		for(Figure f : tabfig) {								//parcourir les figures du tableau
			comppts += f.getPoints().length;			// obtenir le nombre de points � chaque figure du tableau
		}														// afin de l'int�grer dans...
		Point[] tableau = new Point[comppts];					// nouveau tableau de points contenant tous les points
		comppts = 0;
		for(Figure f : tabfig){					
			for(Point p123 : f.getPoints()){			// � chaque point de chaque figure
				tableau[comppts] = p123;						// ajouter les coordonne�s du point au tableau final
				comppts++;										// coordonn�es du point suivant int�gr� � la valeur suivante du tableau
			}
		}return tableau;
	}
	
	/*
	 * public static Point[] getPoints(Figure... figures){		// avec conversion en ellipse (correction)
	 * int nbPoint = 0;
	 * for(Figure f : figures) {
	 * 		nbPoint += f.getPoints().length;
	 * 	}
	 * Point[] points = new Point[nbPoint];
	 * int index = 0;
	 * for (Figure f : figures){
	 * 	Point[] temps = f.getPoints();
	 * 	for (int i =   0; i < temps.length; i++, index++) {
	 * 		points[index] = temps[i];
	 * 		}
	 * 	}return points;
	 * }
	 	 */
	

	public static Rond getRandomRond() {
		return new Rond(getRandomPoint(), rand.nextInt(50));
	}

	public static Rectangle getRandomRectangle() {
		return new Rectangle(getRandomPoint(), rand.nextInt(50), rand.nextInt(50));
	}

	public static Carr� getRandomCarr�() {
		return new Carr�(getRandomPoint(), rand.nextInt(50));
	}

	public static Segment getRandomSegment() {
		return new Segment(getRandomPoint(), rand.nextInt(50), rand.nextBoolean());
	}

	public static Figure getRandomFigure() {
		int random = rand.nextInt(4);
		switch (random) {
		case 0:
			return getRandomRond();
		case 1:
			return getRandomRectangle();
		case 2:
			return getRandomCarr�();
		case 3:
			return getRandomSegment();
		default:
			return getRandomFigure();
		}

	}

	public static Surfaceable getRandomSurfaceable() {
		int random = rand.nextInt(3);
		switch (random) {
		case 0:
			return getRandomRond();
		case 1:
			return getRandomRectangle();
		default:
			return getRandomCarr�();

		}
	}
	
	public static Collection<Figure> genere(int i) {
		
		Set<Figure> nouvellecollection = new HashSet<Figure>();
		for (int nbre = 0; nbre < i; nbre ++){
		nouvellecollection.add(getRandomFigure());
		}return nouvellecollection;
		}
		
	}
/*
 * Test incomplet (voir soluce fichier tp) public static int getRandomInteger
 * (int min, int max){ return (int) Math.round(Math.random() * (max - min)) +
 * min; } public static Point getRandomPoint2 (int xmin, int xmax, int ymin, int
 * ymax) { return new Point(getRandomInteger,getRandomInteger); }
 */