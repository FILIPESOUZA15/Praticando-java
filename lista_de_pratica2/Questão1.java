//Faça um algoritmo para ler dois números inteiros A e B e informar se A é divisível por B. 

package lista_de_pratica2;

import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o 1º número:");
		 int a = s.nextInt();
		 	System.out.println("Informe o 2º número:");
		 	 int b = s.nextInt();
		 	 
		 	 if(a%b == 0) {
		 		 
		 		System.out.println("A é divisível por B");
		 		
		 	 }else {
		 		System.out.println("A não é divisível por B:");
		 		
		 		 
		 	 }
		 

	}

}
