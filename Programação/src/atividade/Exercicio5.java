
// Fa�a um Programa que pe�a a temperatura em graus Fahrenheit, transforme e mostre 
//a temperatura em graus Celsius. 
//C = (5 * (F-32) / 9). 

package atividade;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print(" Ol�! Informe a temperatura em �F: ");
			double f = in.nextDouble();
			double c = (5 * (f-32) / 9);
			
				System.out.print("A temperatura em graus celcius �: "+c);
				

	}

}
