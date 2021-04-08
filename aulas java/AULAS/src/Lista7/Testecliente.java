package Lista7;

import java.util.Scanner;

public class Testecliente {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		cliente cliente1 = new cliente();
		System.out.println(" digite o nome do clinte ");
		cliente1.setNome(leia.next());
		System.out.println(" digite o sua idade:  ");
		cliente1.setIdade(leia.nextInt());
		System.out.println(" digite o sua cpf:  ");
		cliente1.setCpf(leia.next());

		System.out.printf(" nome do cliente: %s  \n", cliente1.getNome());
		System.out.printf(" idade do cliente: %d \n", cliente1.getIdade());
		System.out.printf(" cpf do cliente: %s  \n", cliente1.getCpf());

	}
}
