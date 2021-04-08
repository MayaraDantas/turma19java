package Lista7;

import java.util.Scanner;

public class TesteAviao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Aviao aviao1 = new Aviao();
		System.out.println(" digite  o numero da passagem  ");
		aviao1.setNumeroDePassagem(leia.nextInt());
		System.out.println(" digite o peso da bagagem  ");
		aviao1.setPesoBagagem(leia.nextDouble());
		System.out.println(" digite o numero da sua poltrona  ");
		aviao1.setNumeroPoltrona(leia.nextInt());

		System.out.printf(" Numero da poltrona: %d \n ", aviao1.getNumeroPoltrona());

		System.out.printf(" numero da passagem: %f \n ", aviao1.getNumeroDePassagem());

		System.out.printf(" peso da bagagem: %d \n", aviao1.getPesoBagagem());

	}
}
