package RevisaoLista1;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int  a, b, c, d, e, f;
		int x,y;
		
		
		
		System.out.println(" digite valor de a");
		a = leia.nextInt();
		System.out.println(" digite valor de b");
		b = leia.nextInt();
		System.out.println(" digite valor de c");
		c = leia.nextInt();
		System.out.println(" digite valor de d");
		d = leia.nextInt();
		System.out.println(" digite valor de e");
		e = leia.nextInt();
		System.out.println(" digite valor de f");
		f = leia.nextInt();
	
		
		x= ((c * e) - (b * f)) / ((a * e) -(b * d));
		
		y= ((a * f) - (c * d)) / ((a * e) -(b * d)); 
		 
		
		System.out.printf("O valor correspondente de x ?: %d", x  );
		System.out.printf("\nO valor correspondente de y ?: %d", y );


	
		

	}

}
