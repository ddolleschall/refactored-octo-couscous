package TP;

public class JavaTp03 {

	public static void main(String[] args) {
		byte x = 10;
		byte bmax = Byte.MAX_VALUE;
		byte bmin = Byte.MIN_VALUE;

		System.out.println("Byte max = " + bmax);
		System.out.println("x = " + x);
		System.out.println("x++ donne : " + x++); // incrémentation appliquée mais non affichée
		System.out.println("x = " + x);
		System.out.println("++x donne : " + ++x);
		
		x += 1000;
		System.out.println();
		System.out.println("x + 1000 = " + x);
		System.out.println("x++ donne : " + x++); 
		System.out.println("x = " + x);
		System.out.println("++x donne : " + ++x);
	}
}
