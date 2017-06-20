package tpclasses;

import java.util.HashSet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Dessin extends ArrayList<Figure> implements Serializable {


	private static final long serialVersionUID = 1L;

	public Dessin(Collection<Figure> coll){
		super(coll);
	}
	public Collection<Figure> getFigures(){
		return this;
	}

	public  Collection<Figure> add(Collection<Figure> genere) {
		Collection<Figure> coll = new HashSet<Figure>();
		coll.addAll(genere);
		return coll;
		
	}
	
	
}
