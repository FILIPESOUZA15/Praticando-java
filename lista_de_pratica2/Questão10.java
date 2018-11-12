//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 
//25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para 
//ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e 
//escreva o valor a ser pago pelo cliente. 

// ATÉ 5Kg                                      ACIMA DE 5Kg
//MORANGO DE 2,50 POR Kg						MORANGO 2,20 POR Kg
//MAÇÃ DE 1,80 POR Kg							MAÇÃ    1,50 POR Kg

package lista_de_pratica2;

import java.util.Scanner;

public class Questão10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double valorDaCompra, valormorango = 2.50, valormaca = 1.80, TotalMorango, TotalMaca ; 
		
			System.out.println("Informe a quantidade em Kg dos morangos:");
			 	float kgmorango = s.nextFloat();
			 	
			 	System.out.println("Informe a quantidade em Kg dos maçãs:");
			 		float kgmaca = s.nextFloat();
			 		
			 		
			 		if(kgmorango > 5)
			 		{
			 			TotalMorango = (valormorango - 0.30)  * kgmorango;		 			
			 			
			 		}else {
			 				TotalMorango = (valormorango * kgmorango);			 			
			 		}
			 		
			 		if(kgmaca > 5)
			 		{
			 			TotalMaca = (valormaca - 0.30) * kgmaca;
			 		}else {
			 			TotalMaca = (valormaca * kgmaca);
			 		}		 		 
			 		 double valorsemdesconto = (TotalMorango + TotalMaca);
			 		 	System.out.println("\nValor da compra antes do desconto: R$ "+valorsemdesconto);
			 		 				 		 
			 		if((TotalMorango + TotalMaca > 25) || (kgmorango + kgmaca > 8))
			 		{
			 			valorDaCompra = ((TotalMorango + TotalMaca)  * 0.90);			 			
			 			
			 		}else {
			 			valorDaCompra = (TotalMorango + TotalMaca);
			 			
			 		}
			 	
			 			System.out.println("\nValor total a pagar com : R$ "+valorDaCompra);
			 			
			 			
			 			

	}

}
