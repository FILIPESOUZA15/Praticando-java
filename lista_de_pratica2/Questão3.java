//Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto 
//voc� deve comprar, sabendo que a decis�o � sempre pelo mais barato. 

package lista_de_pratica2;

import java.util.Scanner;

public class Quest�o3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
			System.out.println("Informe o valor dos produtos a seguir.");
			
			System.out.println("Valor da Ameixa.");
				double ameixa = s.nextDouble();
			
			System.out.println("Valor da P�ra.");
				double pera = s.nextDouble();
				
			System.out.println("Valor da Uva.");
				double uva = s.nextDouble();
				
				if(ameixa < pera && ameixa < uva || ameixa < uva && ameixa < pera) {
				  System.out.println("Voc� deve optar pela ameixa, pois est� com o menor pre�o!");
				}
	
				if(pera < ameixa && pera < uva || pera < uva && pera < ameixa) {
					System.out.println("Voc� deve optar pela pera, pois est� com o menor pre�o!");
				}
				
				if(uva < ameixa && uva < pera || uva < pera && uva < ameixa) {
					System.out.println("Voc� deve optar pela uva, pois est� com o menor pre�o!");
				
				}
			

	}

}
