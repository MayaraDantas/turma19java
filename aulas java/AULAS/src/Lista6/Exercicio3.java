package Lista6;

import java.util.Scanner;

public class Exercicio3 {


/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
 * idade for =-99. (WHILE)
 */

public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int idade = 0, totalPessoasMenor = 0, totalPessoasMaior = 0;
	;

	do {
		System.out.println("Informe a idade: ");
		idade = leia.nextInt();

		if (idade <= 21 && idade > 0) {
			totalPessoasMenor = 1 + totalPessoasMenor++;
		} else if (idade > 50) {
			totalPessoasMaior = 1 + totalPessoasMaior++;
		}
	} while (idade != -99);

	System.out.println("O total de pessoas com menos de 21 anos é " + totalPessoasMenor);
	System.out.println("O total de pessoas com idade maior de 50 anos é " + totalPessoasMaior);

}
}


