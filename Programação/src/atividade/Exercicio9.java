//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que 
//calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) – 58.


package atividade;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Calculo do peso ideal para uma pessoa:");
		
	    	System.out.println("=====================================");
			
		  		System.out.println("Informe a sua altura: ");
		  		   double altura = in.nextDouble();
		  		   	double peso = (72.7*altura) -58;
		 System.out.println("O seu peso ideal é: "+peso+ "Kg");
		 		
	}

}
