package Ifelse;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, idade, parImpar;

		System.out.println(" digite um numero ");
		numero = leia.nextInt();

		if (numero > 10) { // if � uma condi��o.
			System.out.println(" o numero � maior que 10 ");

		} else {
			System.out.println(" o numero � menor que 10");

		}
		System.out.println(" qual a sua idade? ");
		idade = leia.nextInt();

		if (idade <= 10) {
			System.out.println(" voc� � kids");

		} else if (idade > 10 && idade < 18) {
			System.out.println("voc� � adolescente");

		} else {
			System.out.println("voc� � um adulto vai trabalhar vagabundo.");
		}

		System.out.println(" informe um numero ");
		parImpar = leia.nextInt();

		if (parImpar == 0) {
			System.out.println(" � um numero neutro");
		}

		else if (parImpar % 2 == 0) {
			System.out.println("O numero � par ");

		}

		else {
			System.out.println(" o seu numero � impar ");

		}

	}

}
