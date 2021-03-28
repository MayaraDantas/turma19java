package RevisaoLista2;

import java.util.Scanner;

/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.*/

public class Exercicio2 {
	public static void main (String[] args ) {
		Scanner leia = new Scanner (System.in);
		int codigo, horaTrabalho;
		double salario, salarioExtra, extras, excesso;
		
		System.out.println("Informe o código de usuário: ");
		codigo = leia.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		horaTrabalho = leia.nextInt();
		salario = (horaTrabalho * 10.00);
		if(horaTrabalho <= 50) 
		{
			System.out.printf("O salário do colaborador %d é de: R$ %.2f", codigo, salario);
		} else if (horaTrabalho > 50) 
			{ 	salario = (horaTrabalho * 10.00);
				extras = horaTrabalho - 50;
				excesso = (extras * 20.00);
				salarioExtra = salario + excesso;
			System.out.printf("O salário do colaborador %d é de R$ %.2f\nE abono de horas excedentes é de R$ %.2f\nO salário total é de R$ %.2f", codigo, salario, excesso, salarioExtra);
			}
		
		
		
		
		
	}

}