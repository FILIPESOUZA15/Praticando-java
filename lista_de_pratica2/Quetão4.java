//Fa�a um Programa que leia tr�s n�meros e mostre-os em ordem decrescente. 

package lista_de_pratica2;

import java.util.Scanner;

public class Quet�o4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ol�!");
		
		System.out.println("Informe o 1� n�mero:");
			int n1 = s.nextInt();
		
		System.out.println("Informe o 2� n�mero:");
			int n2 = s.nextInt();
			
		System.out.println("Informe o 3� n�mero:");
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
