package tpclasses;

import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class Dessin {



	Set<Figure> ff = new HashSet<Figure>();

	public boolean add(Figure fig) {
		return ff.add(fig);
	}
	
	public Collection<Figure> getFigures(){
		return ff;
	}

	public  Collection<Figure> add(Collection<Figure> genere) {
		return ff = (Set<Figure>) genere;
		
	}
	
}
