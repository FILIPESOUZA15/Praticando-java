//FAÇA UM PROGRAMA QUE VERIFICQUE SE UMA LETRA DIGITADA É VOGAL OU CONSOANTE.
package atividade;

import java.util.Scanner;


public class Exerciciosala4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite uma letra:");
		
		     char vogal = 'letra';
		
		switch(letra){
		
		case 'letra':
			System.out.println("Essa letra, a, é uma vogal ");		
			break;
		case 'e':
			System.out.println("Essa letra, e, é uma vogal  ");
			break;
		case 'i':
			System.out.println("Essa letra, i, é uma vogal  ");
		case 'o':
			System.out.println("Essa letra, o, é uma vogal  ");
		case 'u':
			System.out.println("Essa letra, u, é uma vogal  ");
			default:
				System.out.println("Esta letra é uma consoante!");
				
				break;
				
		}
		
		
	}




}


