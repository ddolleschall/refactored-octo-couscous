package TP;

public class JavaTp02 {

	public static void main(String[] args){
		int i = 123456789;
		float f = i;
		System.out.println("i = " + i);
		System.out.println("f = " + f);
		
		float x = 15;
		float z = 0;
		float y = -123;
		float a = (x / z);
		float b = (y / z);
		float c = (a / b);
		System.out.println("x = " + x);
		System.out.println("z = " + z);
		System.out.println("y = " + y);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	
		int imax = Integer.MAX_VALUE;
		int imin = Integer.MIN_VALUE;
		long lmax = Long.MAX_VALUE;
		long lmin = Long.MIN_VALUE;
		float fmax = Float.MAX_VALUE;
		float fmin = Float.MIN_VALUE;
		double dmax = Double.MAX_VALUE;
		double dmin = Double.MIN_VALUE;
		
		System.out.println("int maximum = " + imax);
		System.out.println("int minimum = " + imin);
		System.out.println("long maximum = " + lmax);
		System.out.println("long minimum = " + lmin);
		System.out.println("float maximum = " + fmax);
		System.out.println("float minimum = " + fmin);
		System.out.println("double maximum = " + dmax);
		System.out.println("double minimum = " + dmin);
		System.out.println(dmax + 100000);
	}
}
