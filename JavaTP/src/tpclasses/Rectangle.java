package tpclasses;

public class Rectangle extends Figure implements Surfaceable {
	Point rect;
	Point hautgauche;
	Point basdroite;
	Point hautdroite;
	Point centrerect;
	int largeur;
	int longueur;
	double rectsurf;
	
	public Rectangle(Point rect, int largeur, int longueur) {					
		this.rect = rect;
		hautgauche = new Point(rect.getx(), rect.gety() + largeur);
		basdroite = new Point(rect.getx() + longueur, rect.gety());
		hautdroite = new Point(rect.getx() + longueur, rect.gety() + largeur);
		centrerect = new Point( rect.getx() + (longueur/2), rect.gety() + (largeur /2));
		rectsurf = largeur * longueur;
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
	/*public String toString(){
		return "[RECT "+ getPointBasGauche()  + getPointHautGauche() + getPointBasDroite() + getPointHautDroite()+"]";  
	} */
	public String toString(){
		return "["+ getType() + " " + getPointBasGauche()  + getPointHautGauche() + getPointBasDroite() + getPointHautDroite()+"]";  
	}
	public String getType(){
		return "RECT";
	}
	public void affCentre(){
		System.out.println("Le centre de ce rectangle est : " + centrerect);
	}
	public Point getCentre(){
		return centrerect;
	}
	
	public double surface() {
		return rectsurf;
	}
	public void affSurface(){
		System.out.println("La surface de ce rectangle est de : " + surface());
	}
	public Point[] getPoints(){
		return new Point[] {rect, hautgauche, basdroite, hautdroite};
	}
	

}
