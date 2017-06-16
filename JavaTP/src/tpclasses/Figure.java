package tpclasses;

public abstract class Figure {

	
	public void afficher(){
		System.out.println("C'est une figure de type : "+this);		//m�thode commune � toutes les figures (non instanci�es)
	}
	public abstract String getType();				//m�thode � red�finir dans classes non abstraites
		
	public abstract void affCentre();
	public abstract Point getCentre();
	public abstract Point[] getPoints();
	Point tab[];
}
