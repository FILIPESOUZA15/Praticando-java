
//Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas 
		//trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.
		
package atividade;

import java.util.Scanner;


public class Exercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Ol�, Quanto voc� recebe por hora? R$: ");
		double valorhora = in.nextDouble();
		
		System.out.print("Quantas horas voc� trabalhou no m�s tual? Hrs: ");
		double horatrabalhada = in.nextDouble();
		
		System.out.println("Seu sal�rio no m�s atual ser�, R$: "+(valorhora*horatrabalhada));
	}

}
