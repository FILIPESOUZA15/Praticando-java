//Fa�a um algoritmo para ler dois n�meros inteiros A e B e informar se A � divis�vel por B. 

package lista_de_pratica2;

import java.util.Scanner;

public class Quest�o1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o 1� n�mero:");
		 int a = s.nextInt();
		 	System.out.println("Informe o 2� n�mero:");
		 	 int b = s.nextInt();
		 	 
		 	 if(a%b == 0) {
		 		 
		 		System.out.println("A � divis�vel por B");
		 		
		 	 }else {
		 		System.out.println("A n�o � divis�vel por B:");
		 		
		 		 
		 	 }
		 

	}

}
