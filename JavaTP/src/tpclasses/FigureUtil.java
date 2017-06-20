package tpclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class FigureUtil {

	static Random rand = new Random(); // variables liée aux méthodes static doivent être static
	static int dsize = 50;	
	static int xcadredessin = 300;
	static int ycadredessin = 1000;
	
	public static Point getRandomPoint() { // static => pas besoin de créer une nouvelle instance
		
		return new Point(getRandomInt(dsize, xcadredessin - dsize), getRandomInt(dsize, ycadredessin - dsize));
	}
	
	public static int getRandomInt(int min, int max){
		return rand.nextInt(max-min)+min;
	}

	public static ArrayList<Point> getPoints(Figure... tabfig) {

		ArrayList<Point> tableau = new ArrayList<Point>();
		for (Figure f : tabfig) {
			for (Point p123 : f.getPoints()) {
				tableau.add(p123);

			}
		}
		return tableau;
	}

	/*
	 * public static Point[] getPoints(Figure... figures){ int nbPoint = 0;
	 * for(Figure f : figures) { nbPoint += f.getPoints().length; } Point[]
	 * points = new Point[nbPoint]; int index = 0; for (Figure f : figures) {
	 * Point[] temps = f.getPoints(); for (int i = 0; i < temps.length; i++,
	 * index++){ points[index] = temps[i]; } }return points; }
	 */

	public static HashMap<String, Figure> stockrand = new HashMap<String, Figure>();
	

	private static Couleur getRandomCouleur(){
		Couleur values[] = Couleur.values();
		return values[rand.nextInt(values.length)];
	}
	
	public static Rond getRandomRond() {
		Rond randrond = new Rond(getRandomPoint(), rand.nextInt(dsize/2), getRandomCouleur());
		stockrand.put(randrond.getId(), randrond);
		return randrond;
		
	}

	public static Rectangle getRandomRectangle() {
		Figure randrect = new Rectangle(getRandomPoint(), rand.nextInt(dsize), rand.nextInt(dsize), getRandomCouleur());
		
		stockrand.put(randrect.getId(), randrect);		
		return (Rectangle) randrect;
	}

	public static Carré getRandomCarré() {
		Figure randcarre = new Carré(getRandomPoint(), rand.nextInt(dsize), getRandomCouleur());
	
		stockrand.put(randcarre.getId(), randcarre);
		return (Carré) randcarre;
	}

	public static Segment getRandomSegment() {
		Figure randsegment = new Segment(getRandomPoint(), rand.nextInt(dsize), rand.nextBoolean(), Couleur.values()[rand.nextInt(4)]);
		
		stockrand.put(randsegment.getId(), randsegment);
		return (Segment) randsegment;
	}

	public static Figure getRandomFigure() {
		int random = rand.nextInt(4);
		switch (random) {
		case 0:
			return getRandomRond();
		case 1:
			return getRandomRectangle();
		case 2:
			return getRandomCarré();
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
			return getRandomCarré();

		}
	}

	public static Collection<Figure> genere(int i) {

		Set<Figure> nouvellecollection = new HashSet<Figure>();
		for (int nbre = 0; nbre < i; nbre++) {
			nouvellecollection.add(getRandomFigure());
		}
		return nouvellecollection;
	}

	// Iterator passant par chaque figure du dessin, qui passe en revue égalité
	// de coordonnées du point par méthode couvre et renvoie la figure

	/*public static Figure getFigureEn(Point p, Dessin dessin) {
		Iterator<Figure> iter = dessin.iterator();
		while (iter.hasNext()) {
			Figure f = iter.next();
			if (f.couvre(p)) {
				return f;
			}

		}
		return null;
		}
*/
	
	public static Optional<Figure> getFigureEn(Point p, Dessin d) {		//Nouvelle méthode avec Stream 
		return d.getFigures().stream()
				.filter( f -> f.couvre(p))
				.findFirst();
	}

	/*public static List<Figure> trieProcheOrigine(Dessin dessin) {
			List<Figure> liste = new ArrayList<Figure>();			// nouvelle liste pour ne pas changer l'ordre directement dans dessin		
			liste.addAll(dessin);
			Collections.sort(liste); 					//Collection (liste , comparateur appelé en en
			return liste;						//expression lambda car compareTo() est l'unique méthode
			}*/
		
	public static List<Figure> trieProcheOrigine(Dessin dessin) {
		return dessin.getFigures().stream()
				.sorted()
				.collect(Collectors.toList());
		}

	/*public static List<Figure> trieDominant(Dessin dessin){
		List<Figure> liste = new ArrayList<Figure>();
		for (Figure f : dessin){
			if (f instanceof Surfaceable) {
				liste.add(f);
			}
		} Collections.sort(liste, (Figure f1, Figure f2) -> {
			double d = ((Surfaceable) f1).surface() -((Surfaceable) f2).surface();
			if (d < 0) return 1;
			if (d > 0) return -1;
			return 0;
		});
		return liste;
	}
	*/
	
	public static List<Surfaceable> trieDominant(Dessin dessin) {
		return dessin.getFigures().stream()
				.filter(f -> f instanceof Surfaceable)
				.map(x -> (Surfaceable) x)
				.sorted( (f1,f2) -> f1.surface() > f2.surface() ? -1 : 1)
				.collect( Collectors.toList());
 		
	}
	
	public static Figure get(String id){
		return stockrand.get(id);
	}

	public static void imprime(Dessin dessin) throws ImpressionHorsLimiteException{
		try {
		for (Figure f : dessin) {
				for (Point pf : f.getPoints()){
					if (pf.getx() > xcadredessin || pf.gety() > ycadredessin) throw new ImpressionHorsLimiteException();
				}
			}
		PrintWriter sortie = new PrintWriter(new FileWriter ("ListeFigures.txt"));
		for (Figure f : dessin){
			sortie.println(f.toString());
		} 
		for (int nb = 0; nb < xcadredessin; nb++){
			sortie.print("=");
			}
		sortie.println();
		
		int x = 0, y = 0;
		for (x = 0; x < xcadredessin; x++){
				for (y = 0; y < ycadredessin; y++){
					Point p = new Point(x,y);
					if (getFigureEn(p,dessin).isPresent()) {
						sortie.print(getFigureEn(p,dessin).get().getCouleur().getCode());
					} else {
						sortie.print(" ");
					}
					
			}sortie.println();
		}
		sortie.close();
		System.out.println("Impression sous ListeFigure.txt");}
		catch (IOException e){
			System.err.println(e);
		}
	} 
	
	public static String sauvegarde(Dessin dessin) throws IOException {
		
		File file = File.createTempFile("monDessin", ".save");
		ObjectOutputStream sortie = new ObjectOutputStream(new FileOutputStream(file));
		sortie.writeObject(dessin);
		System.out.println("Sauvegarde sous " + file.getAbsolutePath());
		sortie.close();
		return file.getAbsolutePath();
	} 
	
	public static Dessin charge(String filename) throws IOException, ClassNotFoundException {
		Dessin dessin;
		try {
			ObjectInputStream charger = new ObjectInputStream(new FileInputStream(filename));
			dessin = (Dessin) charger.readObject();
			charger.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichier non trouvé : " + e.getMessage());
			return null;
			
		}
		return dessin;		
	}
	
	
	
}
