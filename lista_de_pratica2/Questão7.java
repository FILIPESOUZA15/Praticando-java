//Numa padaria trabalham x pessoas, distribuídas entre a Produção (recebem R$ 
//10 por hora) e Administrativo (recebem R$ 12 a hora).  
//Crie um programa de computador que  leia o setor onde a pessoa trabalha, quantas horas 
//trabalhou por mês e , no fim, deve exibir o salário final a receber. 

package lista_de_pratica2;

import java.util.Scanner;

public class Questão7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println(" Em qual setor você trabalha?"); 
			String setor = s.next();
			
			System.out.println("Quantas horas vovê trabalhou no mês?");
				double hora = s.nextDouble();
				
			switch(setor) {
			
			case "Administrativo": case "administrativo":
				System.out.println("Seu salário no mês será de: R$" +(hora*12));
				break;
				
			case "Produção": case "produção":
				System.out.println("Seu salário no mês será de: R$" +(hora*10));
				break;
				
			default:
				System.out.println("Desculpe!\nSetor não cadastrado!");
				 break;
				 
			
			}
		

	}

}
