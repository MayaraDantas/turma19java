package RevisaoLista1;

import java.util.Scanner;

public class Exemplo8 {
	

		public static void main(String[] args) {
			
	 
			Scanner leia = new Scanner(System.in);
			double custoFabrica, custoTotal, distribuidor, imposto;
			
			System.out.println("Informe o custo de fábrica do carro:");
			custoFabrica = leia.nextInt();
			imposto = 0.45;
			distribuidor = 0.28;
			custoTotal = (custoFabrica * 0.45) + (custoFabrica * 0.28) + custoFabrica;
			
			System.out.printf("O custo total do carro é: %f",custoTotal);
			
		}

	}



