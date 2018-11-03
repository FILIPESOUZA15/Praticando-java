
// Entrar com um número e imprimir a seguinte saída: 
      // NUMERO: 
       //QUADRADO:

package atividade;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		System.out.print("Olá! Digite um número: ");
		  int num = in.nextInt();
		
		 	System.out.print("Agora informe um expoente:");
		      int exp = in.nextInt();
		  double result = Math.pow (num, exp);
System.out.print("O resultado é: " +num+", elevado ao expoente " +exp+ ", é igua a: "+result);

	}

}
