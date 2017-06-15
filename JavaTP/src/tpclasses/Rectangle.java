package tpclasses;

public class Rectangle {
	Point rect;
	Point hautgauche;
	Point basdroite;
	Point hautdroite;

	public Rectangle(Point rect, int largeur, int longueur) {					
		this.rect = rect;
		hautgauche = new Point(rect.getx(), rect.gety() + largeur);
		basdroite = new Point(rect.getx() + longueur, rect.gety());
		hautdroite = new Point(rect.getx() + longueur, rect.gety() + largeur);
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
		return "["+ getType() + getPointBasGauche()  + getPointHautGauche() + getPointBasDroite() + getPointHautDroite()+"]";  
	}
	public String getType(){
		return "RECT";
	}
	public void afficher(){
		System.out.println(toString());
	}
}
