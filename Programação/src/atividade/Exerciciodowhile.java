// FAZER UM PROGRAMA PARA LER DIVERSOS NUMEROS INFORMADO PELO USU�RIO USANDO O COMANDO DO WHILE
//E AP�S CADA LEITURA EXIBIR SE O NUMERO � PAR OU �MPAR. 
//CONSIDERE QUE OA FORNECER UM VALOR NEGATIVO O USUARIO DESEJA ENCERRAR A ENTRADA DE DADOS.

package atividade;

import java.util.Scanner;

public class Exerciciodowhile {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		 int n1 = 1;
		 
		 while(n1 > 0) {
			 System.out.println("Digite um numero:");
			  n1 = x.nextInt();
			  if(n1%2 == 0) {
				  System.out.println("O numero " +n1+ "� Par");
			  }else {
				  System.out.println("O numero " +n1+ "� Impar");
				  
			  }
		 }
		 System.out.println("FINAL DO PROGRAMA");
		 

	}

}
