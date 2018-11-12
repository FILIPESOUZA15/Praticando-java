//Faça um Programa que leia três números e mostre-os em ordem decrescente. 

package lista_de_pratica2;

import java.util.Scanner;

public class Quetão4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Olá!");
		
		System.out.println("Informe o 1º número:");
			int n1 = s.nextInt();
		
		System.out.println("Informe o 2º número:");
			int n2 = s.nextInt();
			
		System.out.println("Informe o 3º número:");
			int n3 = s.nextInt();
			
			if(n3 > n2 && n2 > n1){
			 System.out.println(+n3+"," +n2+"," +n1+"!");
			}
			 if(n2 > n3 && n3 > n1) {
			  System.out.println(+n2+"," +n3+"," +n1+"!");
			}
			if(n1 > n2 && n2 > n3) {
				System.out.println(+n1+","+n2+","+n3+"!");
			}
			if( n1 > n3 && n3 > n2) {
				System.out.println(+n1+","+n3+","+n2+"!");
			}
			if(n2 > n1 && n1 > n3) {
				System.out.println(+n2+","+n1+","+n3+"!");
				
			}
			System.out.println("\nFim do programa!");
	}

}
