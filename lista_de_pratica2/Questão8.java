//As Organizações Tabajara resolveram dar um aumento de salário aos seus 
//colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.  
//Faça um programa que recebe o salário de um colaborador e o reajuste segundo o 
//seguinte critério, baseado no salário atual:  
// salário menor que R$ 280,00 (incluindo) : aumento de 20%  
// salário maior ou igual que R$ 280,00 e menor que R$ 700,00 : aumento de 15%  
// salário maior ou igual que R$ 700,00 e menor que R$ 1500,00 : aumento de 10%  
// salário maior ou igual R$ 1500,00 em diante : aumento de 5%  
//Após o aumento ser realizado, informe na tela:  
// o salário antes do reajuste;  
// o percentual de aumento aplicado;  
// o valor do aumento;  
// o novo salário, após o aumento.



package lista_de_pratica2;
import java.util.Scanner;
public class Questão8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double novosalario, reajuste = 0;
		
		System.out.println("===============================");
		System.out.println("==  Organizações Tabajara    ==");
		System.out.println("===============================");
		
		
		System.out.println("Informe o valor do seu salário:");
		 	float salario = s.nextFloat();
		 	
		 	if(salario <= 280 ) {
		 	   	reajuste = 20;
		 	}else {
		 		
		 	}			
		 	   	if(salario > 280 && salario < 700) {
		 	   		reajuste = 15;
		 	}else {
		 	   		
		 	   	}if(salario >= 700 && salario < 1500) {
		 	   			reajuste = 10;
		 	}else {
		 	   			
		 	   		}
		 	   			if(salario >= 1500) {
		 	   				reajuste = 5;
		 	   				
		 	   			
		 	   			}
		 	   			novosalario = salario + (salario*reajuste)/100;
		 	   		System.out.println("\nSalário antes do reajuste: R$ "+salario);
				  System.out.println("\nPercentual de reajuste aplicado: R$ " +reajuste+ "%");
			    System.out.println("\nValor do aumento: R$ "+(salario*reajuste)/100);
			System.out.println("\nNovo salário após o aumento: R$ " +novosalario);
		 	   			
		 	   			
		 	   			
		 	   		}
	
		 	   			 	   	
		 	   			 	   	
		  	  
		 
		 	
		}


