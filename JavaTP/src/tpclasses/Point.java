package tpclasses;

import java.io.Serializable;

public class Point implements Serializable {
	int x;
	int y;
	static int INIT_X = 50;			// propriété de classe 		
	static int INIT_Y = 50;
	
	public Point(){					//nouveau point sans argument 
		this (INIT_X, INIT_Y);
	}
	
	public Point(int abs, int ord) {
		x = abs;
		y = ord;
	}
	public int getx() {
		return x;		
	}
	public int gety() {
		return y;
	}
	public String toString() {
		return "["+x+";"+y+"]";
	}
	public boolean equals(Point p){
		return (p.x == x && p.y == y);
	}
	public boolean equals(Object o){
		if (o instanceof Point){
			Point p = (Point) o;
			return (p.getx() == this.getx() && p.gety() == this.gety());
		}return false;
				
	}

	public double distanceOrigine(Point p){
		return (Math.sqrt((x-INIT_X)*(x-INIT_X)+(y-INIT_Y)*(y-INIT_Y)));
	}
	
}
