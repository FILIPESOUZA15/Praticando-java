//Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa dever� 
//informar se os valores podem ser um tri�ngulo. Indique, caso os lados formem um 
//tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno. 

 //Tri�ngulo Equil�tero: tr�s lados iguais;  
 //Tri�ngulo Is�sceles: quaisquer dois lados iguais;  
//Tri�ngulo Escaleno: tr�s lados diferentes;


package lista_de_pratica2;

import java.util.Scanner;

public class Quest�o9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("==============================================================================");
		System.out.println("=                    Descubra o tipo do triangulo:                           =");
		System.out.println("==============================================================================");
		
		System.out.println("Informe o lado A:");
			int a = s.nextInt();
			
			System.out.println("Informe o lado B:");
				int b = s.nextInt();
				
				System.out.println("Informe o lado C:");
					int c = s.nextInt();			
					
					
					        if ((a == b) && (a == c)){
					          System.out.println("Tr�s lados iguais . Trata-se de um Triangulo Equilatero");
					        } else 
					         if((a == b) && (a != c) || (b == c) || (c == a)){					        	
					          System.out.println("Dois lados iguais . Trata-se de um Triangulo Isosceles");
					         
	
					        }else
					         if((a != b) && ( b != c ) && ( c != a)) {	
					          System.out.println("Tr�s lados diferentes.Trata-se de um Triangulo escaleno");
					         }
					          System.out.println("=========================================================="); 
}
	
}


					
			
					
	




