package tpclasses;

public abstract class Figure {

	
	public void afficher(){
		System.out.println("C'est une figure de type : "+this);		//méthode commune à toutes les figures (non instanciées)
	}
	public abstract String getType();				//méthode à redéfinir dans classes non abstraites
		
	public abstract void affCentre();
	public abstract Point getCentre();
	public abstract Point[] getPoints();
	Point tab[];
}
