//Fa�a um Programa que converta metros para cent�metros.

package atividade;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.println(">>Convers�o de metros para cent�metros<<");
		System.out.println("*****************************************");
		
		System.out.println("Digite um valor em metros:  ");
			double metros = in.nextDouble();
			double centimetros = (metros*100);
System.out.println("O resultado da convers�o �:\n  "+centimetros+ " Centimetros!");

		
	}

}
