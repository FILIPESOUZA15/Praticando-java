//As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus 
//colaboradores e lhe contrataram para desenvolver o programa que calcular� os reajustes.  
//Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o 
//seguinte crit�rio, baseado no sal�rio atual:  
// sal�rio menor que R$ 280,00 (incluindo) : aumento de 20%  
// sal�rio maior ou igual que R$ 280,00 e menor que R$ 700,00 : aumento de 15%  
// sal�rio maior ou igual que R$ 700,00 e menor que R$ 1500,00 : aumento de 10%  
// sal�rio maior ou igual R$ 1500,00 em diante : aumento de 5%  
//Ap�s o aumento ser realizado, informe na tela:  
// o sal�rio antes do reajuste;  
// o percentual de aumento aplicado;  
// o valor do aumento;  
// o novo sal�rio, ap�s o aumento.



package lista_de_pratica2;
import java.util.Scanner;
public class Quest�o8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double novosalario, reajuste = 0;
		
		System.out.println("===============================");
		System.out.println("==  Organiza��es Tabajara    ==");
		System.out.println("===============================");
		
		
		System.out.println("Informe o valor do seu sal�rio:");
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
		 	   		System.out.println("\nSal�rio antes do reajuste: R$ "+salario);
				  System.out.println("\nPercentual de reajuste aplicado: R$ " +reajuste+ "%");
			    System.out.println("\nValor do aumento: R$ "+(salario*reajuste)/100);
			System.out.println("\nNovo sal�rio ap�s o aumento: R$ " +novosalario);
		 	   			
		 	   			
		 	   			
		 	   		}
	
		 	   			 	   	
		 	   			 	   	
		  	  
		 
		 	
		}


