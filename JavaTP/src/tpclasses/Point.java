package tpclasses;

public class Point {
	int x;
	int y;
	static int INIT_X = 25;			// propriété de classe 		
	static int INIT_Y = 25;
	
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
}
