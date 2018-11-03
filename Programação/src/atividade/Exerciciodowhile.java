// FAZER UM PROGRAMA PARA LER DIVERSOS NUMEROS INFORMADO PELO USUÁRIO USANDO O COMANDO DO WHILE
//E APÓS CADA LEITURA EXIBIR SE O NUMERO É PAR OU ÍMPAR. 
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
				  System.out.println("O numero " +n1+ "é Par");
			  }else {
				  System.out.println("O numero " +n1+ "é Impar");
				  
			  }
		 }
		 System.out.println("FINAL DO PROGRAMA");
		 

	}

}
