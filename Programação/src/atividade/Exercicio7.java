//Faça um Programa que converta metros para centímetros.

package atividade;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.println(">>Conversão de metros para centímetros<<");
		System.out.println("*****************************************");
		
		System.out.println("Digite um valor em metros:  ");
			double metros = in.nextDouble();
			double centimetros = (metros*100);
System.out.println("O resultado da conversão é:\n  "+centimetros+ " Centimetros!");

		
	}

}
