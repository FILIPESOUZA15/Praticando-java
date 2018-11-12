//Faça um programa que pergunte o preço de três produtos e informe qual produto 
//você deve comprar, sabendo que a decisão é sempre pelo mais barato. 

package lista_de_pratica2;

import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
			System.out.println("Informe o valor dos produtos a seguir.");
			
			System.out.println("Valor da Ameixa.");
				double ameixa = s.nextDouble();
			
			System.out.println("Valor da Pêra.");
				double pera = s.nextDouble();
				
			System.out.println("Valor da Uva.");
				double uva = s.nextDouble();
				
				if(ameixa < pera && ameixa < uva || ameixa < uva && ameixa < pera) {
				  System.out.println("Você deve optar pela ameixa, pois está com o menor preço!");
				}
	
				if(pera < ameixa && pera < uva || pera < uva && pera < ameixa) {
					System.out.println("Você deve optar pela pera, pois está com o menor preço!");
				}
				
				if(uva < ameixa && uva < pera || uva < pera && uva < ameixa) {
					System.out.println("Você deve optar pela uva, pois está com o menor preço!");
				
				}
			

	}

}
