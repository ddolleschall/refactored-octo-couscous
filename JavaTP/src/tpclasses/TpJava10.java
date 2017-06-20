package tpclasses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TpJava10 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, ImpressionHorsLimiteException {
		
		/*Point p = new Point(2,2);
		Point p2 = new Point (3,3);
		Point p3 = new Point (2,2);
		Carré p4 = new Carré(p, 2);
		System.out.println(p.equals(p2));
		System.out.println(p.equals(p3));
		System.out.println(p2.equals(p4)); */
		
		/* Point p = new Point(2,2);
		Object p2 = new Point (3,3);
		Object p3 = new Point (2,2);
		System.out.println(p.equals(p2));
		System.out.println(p.equals(p3));
		System.out.println(p2.equals(p3));
		Figure rre = FigureUtil.getRandomFigure();
		rre.afficher();
		System.out.println(rre.getCentre());
		rre.affCentre();
				
		
		
		car.afficher();
		rec.afficher();
		ronron.afficher();
		System.out.println(rec.surface());
		System.out.println(car.surface());
		System.out.println(ronron.surface());
		System.out.println(FigureUtil.getRandomSurfaceable().surface()); */
		
		/*Surfaceable sss = FigureUtil.getRandomSurfaceable();
		sss.affSurface();
		System.out.println(FigureUtil.getRandomSurfaceable());
		System.out.println(FigureUtil.getRandomSurfaceable());
		System.out.println(FigureUtil.getRandomFigure());
		Point p = new Point(2,2);
		Carré car = new Carré(p,5);
		Rectangle rec = new Rectangle(p,3,4);
		Rond ronron = new Rond(p, 1);
		Figure[] figfig = new Figure[] {car, rec, ronron};
		Point var[] = ronron.getPoints();
		for (int i = 0; i < var.length; i++) System.out.println(var[i]);
		Point vfjk[] = FigureUtil.getPoints(car, rec, ronron);
		for (int i = 0; i < vfjk.length; i++) System.out.print(vfjk[i]);
		
		
		Point p = new Point(2,2);
		Rectangle rec = new Rectangle(p,3,4);
		Carré car = new Carré(p,5);
		Rond rond = new Rond (p,2);
		Point p1 = new Point (2,5);
		Point p2 = new Point (7,2);
		Point p3 = new Point (2,6);
		System.out.println(rec.distanceOrigine());
				
		Dessin dessin = new Dessin(FigureUtil.genere(7));
		System.out.println(dessin.getFigures());
		System.out.println("Liste trié : " + FigureUtil.trieProcheOrigine(dessin));
	
		List<Surfaceable> surfa = new ArrayList<Surfaceable>(FigureUtil.trieDominant(dessin));
		System.out.println("Surfaceables : " +surfa);
		for (Surfaceable f : surfa) { System.out.println(((Surfaceable) f).surface()); }*/
		Point p = new Point(2,2);
		Rectangle rect = new Rectangle(p, 2, 3, Couleur.Bleu);
		System.out.println(rect.getCouleur());
		System.out.println(rect);
		
		Dessin dessin2 = new Dessin(FigureUtil.genere(500));
		try {
			FigureUtil.imprime(dessin2);
		} catch (ImpressionHorsLimiteException hl) {
			System.out.println("Hors limite");
		}
		
		String dessinsaved = new String();
		dessinsaved = FigureUtil.sauvegarde(dessin2);
		FigureUtil.charge(dessinsaved);
		
			
		/*System.out.println(FigureUtil.getRandomFigure());
		System.out.println(FigureUtil.getRandomFigure());
		System.out.println(FigureUtil.getRandomFigure());
		System.out.println(FigureUtil.getRandomFigure());
		System.out.println(FigureUtil.getRandomSurfaceable());
		System.out.println("==================================");
		System.out.println(FigureUtil.stockrand.entrySet());
		System.out.println(FigureUtil.stockrand.size());		
		System.out.println(FigureUtil.stockrand.keySet());
		FigureUtil.stockrand.clear();*/
		
	
		// FigureUtil.stockrand pour utiliser cette variable 
		
		/*// Iterator...
		Iterator<Figure> iter = dessin.iterator();
		while (iter.hasNext()){
			Figure f = iter.next();
			System.out.println(f);
		} System.out.println("");
		
		// ...équivaut à :
		for (Figure f : dessin){
			System.out.println(f);
		}*/

			
	}
}
