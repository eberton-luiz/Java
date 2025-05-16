package main;

import java.util.Scanner;

public class ExercicioItamarCaixa {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		final int valor100 = 100;
		final int valor50 = 50;
		final int valor20 = 20;
		final int valor10 = 10;		
		
		System.out.print("Qual o valor do saque: ");
		int valorSaque = scanner.nextInt();
		
		if (valorSaque >= 10 && valorSaque <= 1000) {
			
			System.out.print("Quantas notas de 100: ");
			int notas100 = scanner.nextInt();
			System.out.print("Quantas notas de 50: ");
			int notas50 = scanner.nextInt();
			System.out.print("Quantas notas de 20: ");
			int notas20 = scanner.nextInt();
			System.out.print("Quantas notas de 10: ");
			int notas10 = scanner.nextInt();
			
			int somaSaqueNotas = ((notas100*valor100) + (notas50*valor50) + (notas20*valor20) + (notas10*valor10));
			
			if (valorSaque == somaSaqueNotas) {
				
				System.out.println("Quantidade de notas de 100: " + notas100);
				System.out.println("Quantidade de notas de 50: " + notas50);
				System.out.println("Quantidade de notas de 20: " + notas20);
				System.out.println("Quantidade de notas de 10: " + notas10);
				
			} else {
				System.out.println("Valor de saque e quantidade de notas está divergente, repita a operação.");
			}
			
			
		} else {
			System.out.println("Valor invalido, insira um valor entre 10 e 1.000");
		}
		
	}

}
