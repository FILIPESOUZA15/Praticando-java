
// Entrar com um n�mero e imprimir a seguinte sa�da: 
      // NUMERO: 
       //QUADRADO:

package atividade;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		System.out.print("Ol�! Digite um n�mero: ");
		  int num = in.nextInt();
		
		 	System.out.print("Agora informe um expoente:");
		      int exp = in.nextInt();
		  double result = Math.pow (num, exp);
System.out.print("O resultado �: " +num+", elevado ao expoente " +exp+ ", � igua a: "+result);

	}

}
