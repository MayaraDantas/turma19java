package Revisão3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

	
			int contagem=233; 
			do  {
			  
			 if  (contagem <= 300 ) {
			  contagem = contagem  +1;
			  
			  }
			 else if  (contagem >= 300 & contagem < 400){
			  	contagem = contagem +3;
			  	
			  }
			 else  {
			  contagem= contagem + 5;
			
			  	
			  }
			 System.out.println ( " \n contagem" + contagem);
			}
			while (contagem <= 456 );
				
			
		}
}
