//Numa padaria trabalham x pessoas, distribu�das entre a Produ��o (recebem R$ 
//10 por hora) e Administrativo (recebem R$ 12 a hora).  
//Crie um programa de computador que  leia o setor onde a pessoa trabalha, quantas horas 
//trabalhou por m�s e , no fim, deve exibir o sal�rio final a receber. 

package lista_de_pratica2;

import java.util.Scanner;

public class Quest�o7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println(" Em qual setor voc� trabalha?"); 
			String setor = s.next();
			
			System.out.println("Quantas horas vov� trabalhou no m�s?");
				double hora = s.nextDouble();
				
			switch(setor) {
			
			case "Administrativo": case "administrativo":
				System.out.println("Seu sal�rio no m�s ser� de: R$" +(hora*12));
				break;
				
			case "Produ��o": case "produ��o":
				System.out.println("Seu sal�rio no m�s ser� de: R$" +(hora*10));
				break;
				
			default:
				System.out.println("Desculpe!\nSetor n�o cadastrado!");
				 break;
				 
			
			}
		

	}

}
