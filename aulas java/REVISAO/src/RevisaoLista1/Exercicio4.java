package RevisaoLista1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int A, B, C, R, S, D;

		System.out.println(" digite o valor de A ");
		A = leia.nextInt();

		System.out.println(" digite o valor de B ");
		B = leia.nextInt();

		System.out.println(" digite o valor de C ");
		C = leia.nextInt();

		R = (int) Math.pow(A + B, 2);
		S = (int) Math.pow(B + C, 2);
		D = (R + S) / 2;
		
		System.out.printf(" O valor de 'R' é: %d \n O valor de 'S' é: %d \n  O valor de 'D' é: %d ", R, S, D);
	}
}
