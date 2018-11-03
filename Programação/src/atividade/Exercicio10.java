//Faça um programa que leia o tempo de duração de um evento em uma fábrica 
//expressa em segundos e mostre-o expresso em horas, minutos e segundos.


package atividade;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o tempo do evento em segundos:");
			double tempo = in.nextDouble();
			
				double hora = tempo/3600;
				double minuto = (tempo % 3600)/60;
				double segundo = (tempo % 3600)%60;
		
	System.out.println("O tempo do evento foi:\n hrs: "+hora+ "\n min: "+minuto+ "\n seg: "+segundo );
	
	}

}


//h<-t div 3600
//m<- (t mod 3600)div 60
//s<-(t mod 3600)mod 60




//MINUTOS<-(SEGUNDOS-(HORAS*3600)/60)
//SEGUNDOS<-(SEGUNDOS-(HORAS*3600)-(MINUTOS*60))
//ESCREVAL("TEMPO DO EVENTO:","H:",HORAS,"MIN:",MINUTOS,"SEG:",SEGUNDOS)

