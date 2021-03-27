package RevisaoLista1;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int x1, x2, x3, y1, y2, y3, d;

		System.out.println(" digite valor de x1 ");
		x1 = leia.nextInt();
		System.out.println(" digite o valor de x2 ");
		x2 = leia.nextInt();
		System.out.println(" digite o valor de y1 ");
		y1 = leia.nextInt();
		System.out.println(" digite o valor de y2 ");
		y2 = leia.nextInt();

		x3 = (int) Math.pow(x2 - x1, 2);
		y3 = (int) Math.pow(y2 - y1, 2);
		d = (int) Math.sqrt(x3 + y3);

		System.out.printf("A distância entre os pontos X e Y é: %d ", d);

	}

}
