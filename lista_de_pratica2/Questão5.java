//Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-
//matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa 
//Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso. 

package lista_de_pratica2;

import java.util.Scanner;

public class Questão5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Olá! Em que turno você estuda?");
			System.out.println("\nPara matutino digitar M!");
				System.out.println("\nPara vespertino digitar V!");
					System.out.println("\nPara noturno digitar N!");
						String turno = s.next();
		 	
		 	switch(turno) {
		 	
		 	case "m": case "M":
		 		System.out.println("Bom Dia!");
		 		 break;
		 	case "v": case "V":
		 		System.out.println("Boa Tarde!");
		 		break;
		 	case "n": case "N":
		 		System.out.println("Boa Noite!");
		 		break;
		 		default:
		 			System.out.println("Valor inválido!");
		 				 		
	 	}
		 	System.out.println("Fim do programa!");
		 	System.out.println("================");
		 	
	}

}
