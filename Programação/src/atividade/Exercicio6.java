 // Faça um algoritmo que possa entrar com o saldo de sua caderneta de poupança e 
//imprima o novo saldo que teve reajuste de 3%.

package atividade;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe o seu saldo atual: ");
		  double s = in.nextDouble();
		  double novosaldo = s+( s* 0.03);
 System.out.print("Seu novo saldo é: "+novosaldo);
		  		 
	}

}
