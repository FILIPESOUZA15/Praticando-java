// FA�A UM PROGRAMA QUE PE�A UM VALOR E MOSTRE NA TELA SE O VALOR � POSITIVO OU NEGATIVO.
package atividade;

import java.util.Scanner;


public class Exerciciosala2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
			System.out.println("Informe um valor:");
			 	int valor = in.nextInt();
			 		
			 	if (valor > 0) {
			 		System.out.println("Esse valor � positivo!");
			 	}else {
			 		System.out.println("Esse valor � negativo!");
			 		 
			 		
			 	}

	}

}
