//Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.
package lista_de_pratica2;

import java.util.Scanner;

public class Quest�o2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o 1� n�mero:");
			float n1 = s.nextFloat();
			System.out.println("Informe o 2� n�mero:");
				float n2 = s.nextFloat();
				System.out.println("Informe o 3� n�mero:");
					float n3 = s.nextFloat();
					
					if(n1>n2 && n1>n3 || n1>n3 && n1>n2){
						System.out.println("O maior n�mero �:" +n1+ "!");
					}
						if(n2>n1 && n2>n3 || n2>n1 && n2>n3) {
							System.out.println("O maior n�mero �:" +n2+ "!");
						}		
							if(n3>n1 && n3>n2 || n3>n2 && n3>n1) {
								System.out.println("O maior n�mero �:" +n3+ "!");
							}
						}
						
					
				
	}


