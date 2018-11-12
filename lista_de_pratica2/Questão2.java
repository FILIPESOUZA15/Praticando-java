//Faça um Programa que leia três números e mostre o maior e o menor deles.
package lista_de_pratica2;

import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o 1º número:");
			float n1 = s.nextFloat();
			System.out.println("Informe o 2º número:");
				float n2 = s.nextFloat();
				System.out.println("Informe o 3º número:");
					float n3 = s.nextFloat();
					
					if(n1>n2 && n1>n3 || n1>n3 && n1>n2){
						System.out.println("O maior número é:" +n1+ "!");
					}
						if(n2>n1 && n2>n3 || n2>n1 && n2>n3) {
							System.out.println("O maior número é:" +n2+ "!");
						}		
							if(n3>n1 && n3>n2 || n3>n2 && n3>n1) {
								System.out.println("O maior número é:" +n3+ "!");
							}
						}
						
					
				
	}


