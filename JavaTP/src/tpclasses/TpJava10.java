package tpclasses;

public class TpJava10 {

	public static void main(String[] args) {
		
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
		System.out.println(FigureUtil.getRandomFigure());*/
		Point p = new Point(2,2);
		Carré car = new Carré(p,5);
		Rectangle rec = new Rectangle(p,3,4);
		Rond ronron = new Rond(p, 1);
		Figure[] figfig = new Figure[] {car, rec, ronron};
		Point var[] = ronron.getPoints();
		for (int i = 0; i < var.length; i++) System.out.println(var[i]);
		Point vfjk[] = FigureUtil.getPoints(figfig);
		for (int i = 0; i < vfjk.length; i++) System.out.print(vfjk[i]);
		
	}
}
