package tpclasses;

public class Rond {
	
	int r;
	Point cent;
	
	public Rond(Point cent, int r) {
		this.cent = cent;
		this.r = r;
			
	}
	public String toString() {
		return "[ROND "+ cent +", "+ r +"]";
	}
	public void afficher() {
		System.out.println(toString());;
	}
}
