
//Faça um Programa que pergunte quanto você ganha por hora e o número de horas 
		//trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
		
package atividade;

import java.util.Scanner;


public class Exercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Olá, Quanto você recebe por hora? R$: ");
		double valorhora = in.nextDouble();
		
		System.out.print("Quantas horas você trabalhou no mês tual? Hrs: ");
		double horatrabalhada = in.nextDouble();
		
		System.out.println("Seu salário no mês atual será, R$: "+(valorhora*horatrabalhada));
	}

}
