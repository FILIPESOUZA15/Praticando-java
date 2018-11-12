//Crie um programa que receba o nome de um produto, seu preço e a condição de 
//pagamento (à vista / a prazo). Se o pagamento for à vista o cliente deverá ter um 
//desconto de 5%, se for a prazo um juro de 2%. 

package lista_de_pratica2;

import java.util.Scanner;

public class Questão6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Informe o nome do produto:");
		 	char produto = s.next().charAt(0);
		 	
		 	System.out.println("Qual o valor do produto?");
		 		double preco = s.nextDouble();
		 		
		 		System.out.println("Qual a forma de pagamento?"+
		 		"\n1 - Avista: desconto de 5%:" + "\n 2 - Parcelado: juros 2%:");
		 			int formapagto = s.nextInt();
		 			
		 		switch(formapagto) {
		 		
		 		case 1:
		 			System.out.println("Desconto de 5%: \n Valor a pagar:"+(preco*0.95));
		 			break;
		 		case 2:
		 			System.out.println("Juros de 2%: \n Valor a pagar:"+(preco*1.02));
		 			break;
		 			
		 			}
		 			
		 		  System.out.println("Obrigado pela compra!:");
		 	
		}

}
