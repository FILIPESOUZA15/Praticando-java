package atividade;
import java.util.Scanner;
public class Exemplosala {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("digite seu nome:");
			
		String nome = "Filipe";
		
		switch(nome)
		{
		case "Leo":
			System.out.print("Meu nome � Leo!");
			break;
		case "OutroNome":
			System.out.println("Seu nome � OutroNome!");
			break;
			default:
				System.out.println("Nenhuma situa��o foi verdadeira!");
				break;
				
		}
		
		
	}

}
