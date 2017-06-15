package tpclasses;

import java.util.Random;

public class FigureUtil {

	static Random rand = new Random();											// variables liée aux méthodes static doivent être static

	public static Point getRandomPoint() {										// static => pas besoin de créer une nouvelle instance 
		return new Point(rand.nextInt(100), rand.nextInt(100));					// Obtenir un nouveau point en appelant la méthode
	}
	public static Rond getRandomRond() {
		return new Rond(getRandomPoint(), rand.nextInt(100));
	}
	public static Rectangle getRandomRectangle() {
		return new Rectangle(getRandomPoint(), rand.nextInt(100), rand.nextInt(100));
	}
	public static Carré getRandomCarré(){
		return new Carré(getRandomPoint(), rand.nextInt(50));
	}
	
/*	Test incomplet (voir soluce fichier tp)
	public static int getRandomInteger (int min, int max){
		return (int) Math.round(Math.random() * (max - min)) + min; 
	}
	public static Point getRandomPoint2 (int xmin, int xmax, int ymin, int ymax) {
		return new Point(getRandomInteger,getRandomInteger);
	}
	*/
}
