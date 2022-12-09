package atividade09_12;

import java.util.Scanner;
import java.util.Random;

public class questao1 {

	public static void main(String[] args) {
		
		int valor = 0, tentativasTotais = 0;
		
		boolean acerto = false;
		
		Scanner teclado = new Scanner (System.in);
		
		Random sorteio = new Random();
		
		int numeroSorteado = sorteio.nextInt(1000);
		
		do {
		
		System.out.println("\nInsira um valor de 0 a 1000: ");
		valor = teclado.nextInt();
		
		tentativasTotais = somarTentativas(valor, tentativasTotais, numeroSorteado);
		
		acerto = verificadorAcerto(acerto, valor, numeroSorteado);
		
		} while (acerto == false);
			
		
	}

	
	public static int somarTentativas (int valor, int tentativas, int numeroSorteado) {
		
		if(valor > numeroSorteado) {
			
			tentativas++;
			
			System.out.println("Você errou! o número sorteado é menor que " + valor);
			
		} else if (valor < numeroSorteado) {
			
			tentativas++;
			
			System.out.println("Você errou! O número sorteado é maior que " + valor);
			
		} else {
			
			tentativas++;
			
			System.out.println("Parabéns você acertou em " + tentativas + " tentativas!");
			
		}
		return tentativas;
	}
	
	public static boolean verificadorAcerto(boolean acerto, int valor, int numeroSorteado) {
		
		if (valor == numeroSorteado) {
			
			acerto = true;
			
		} return acerto;
		
	}
	
}
