package TP;

public class JavaTp06 {

	public static void main(String[] args) {
		int nb = Integer.parseInt(args[0]);
		int x = 1;
		for (int i = 1; i <= nb; i++) {
			x = x * i;
		}
	System.out.println(x);
	}
}
