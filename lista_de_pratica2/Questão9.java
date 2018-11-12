//Faça um Programa que peça os 3 lados de um triângulo. O programa deverá 
//informar se os valores podem ser um triângulo. Indique, caso os lados formem um 
//triângulo, se o mesmo é: equilátero, isósceles ou escaleno. 

 //Triângulo Equilátero: três lados iguais;  
 //Triângulo Isósceles: quaisquer dois lados iguais;  
//Triângulo Escaleno: três lados diferentes;


package lista_de_pratica2;

import java.util.Scanner;

public class Questão9 {

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
					          System.out.println("Três lados iguais . Trata-se de um Triangulo Equilatero");
					        } else 
					         if((a == b) && (a != c) || (b == c) || (c == a)){					        	
					          System.out.println("Dois lados iguais . Trata-se de um Triangulo Isosceles");
					         
	
					        }else
					         if((a != b) && ( b != c ) && ( c != a)) {	
					          System.out.println("Três lados diferentes.Trata-se de um Triangulo escaleno");
					         }
					          System.out.println("=========================================================="); 
}
	
}


					
			
					
	




