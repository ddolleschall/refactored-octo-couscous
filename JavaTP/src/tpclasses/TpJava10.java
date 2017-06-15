package tpclasses;

public class TpJava10 {

	public static void main(String[] args) {
		
		Point p = new Point(2,2);
		Point p2 = new Point (3,3);
		Point p3 = new Point (2,2);
		Carré p4 = new Carré(p, 2);
		System.out.println(p.equals(p2));
		System.out.println(p.equals(p3));
		System.out.println(p2.equals(p4));
		
		/*Object p = new Point(2,2);
		Object p2 = new Point (3,3);
		Object p3 = new Point (2,2);
		System.out.println(p.equals(p2));
		System.out.println(p.equals(p3));
		System.out.println(p2.equals(p3));*/
		
		
		
		
		/*	
		Carré car = new Carré(p,5);
		Rectangle rec = new Rectangle(p,2,3);
		car.afficher();
		rec.afficher();
		System.out.println(FigureUtil.getRandomPoint());
		System.out.println(FigureUtil.getRandomPoint());
		System.out.println(FigureUtil.getRandomPoint());
		System.out.println(FigureUtil.getRandomRond());
		System.out.println(FigureUtil.getRandomRond());
		System.out.println(FigureUtil.getRandomRond());
		System.out.println(FigureUtil.getRandomRectangle());
		System.out.println(FigureUtil.getRandomCarré());*/ 

	}
}
