package tpclasses;

public class Rond extends Figure implements Surfaceable {
	
	int r;
	Point cent;
	
	public Rond(Point cent, int r) {
		this.cent = cent;
		this.r = r;
			
	}
	public String toString() {
		return "["+ getType() + " " + cent +", "+ r +"]";
	}
	public String getType(){
		return "ROND";
	}
	public void affCentre(){
		System.out.println("Le centre de ce rond est : " + cent);
	}
	public Point getCentre(){
		return cent;
	}
	
	public double surface() {
		return (Math.PI * r * r);
	}
	public void affSurface(){
		System.out.println("La surface de ce rond est : " + surface());  
	}
	public Point[] getPoints(){
		return new Point[] {cent};
	}
}
