// Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre: 
//a) o produto do dobro do primeiro com metade do segundo . 
//b) a soma do triplo do primeiro com o terceiro. 
//c) o terceiro elevado ao cubo.


package atividade;

import java.util.Scanner;

public class Exercicio8 {

		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro:");
			int n1 = in.nextInt();
			
				System.out.println("Digite outro numero inteiro:");
					int n2 = in.nextInt();
			
					System.out.println("Digite um numero real:");
						double n3 = in.nextDouble();
							double result = n1*2+(n2/2);
								double result1 = n1*3+n3;
									double result2 = Math.pow (n3,3);
									
			System.out.println("o produto do dobro do primeiro com metade do segundo: "+result);
	  System.out.println(" a soma do triplo do primeiro com o terceiro."+result1);
 System.out.println("o terceiro elevado ao cubo."+result2);									
							
	}

}
