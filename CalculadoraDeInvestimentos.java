package main;

import java.text.NumberFormat;
import java.util.Scanner;

public class CalculadoraDeInvestimentos {

	public static void main(String[] args) {
		final int  PERCENTUAL = 100;
				
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Valor de aplicação mensal: ");
		double aplicacaoMensal = scanner.nextDouble();
		
		
		System.out.print("Taxa mensal de rendimento: ");
		float taxaMensal = scanner.nextFloat();
		float taxaMensalFormatada = taxaMensal / PERCENTUAL;
		
		
		System.out.print("Prazo da aplicação em meses: ");
		int prazoAplicacao = scanner.nextInt();
		
		
		double montanteRendimentoNoPeriodo = aplicacaoMensal * (Math.pow(1 + taxaMensalFormatada, prazoAplicacao) - 1) / (taxaMensalFormatada);
		
		
		double montanteAplicado = aplicacaoMensal * prazoAplicacao;
		String montanteAplicadoFormatado = NumberFormat.getCurrencyInstance().format(montanteAplicado);
		System.out.println("Montante aplicado no periodo (sem juros): " + montanteAplicadoFormatado);
		
		
		String montanteRendimentoNoPeriodoFormatado = NumberFormat.getCurrencyInstance().format(montanteRendimentoNoPeriodo);
		System.out.println("Montante aplicado no periodo (com juros): " + montanteRendimentoNoPeriodoFormatado);
		
		
		scanner.close();

		
	}

}
