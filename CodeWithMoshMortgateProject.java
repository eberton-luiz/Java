package ebertonProject;

import java.text.NumberFormat;
import java.util.Scanner;

public class CodeWithMoshMortgateProject {

	public static void main(String[] args) {
		final byte MESES_NO_ANO = 12;
		final byte PERCENTUAL = 100;
						
		Scanner scanner = new Scanner(System.in);
		System.out.print("Valor financiado ($1K - $1M): ");
		int valorFinanciado = scanner.nextInt();
		while ((valorFinanciado < 1000) || (valorFinanciado > 1_000_000)) {
			System.out.println("Insira um valor entre 1.000 e 1.000.000");
			System.out.print("Valor financiado ($1K - $1M): ");
			int valorFinanciado2 = scanner.nextInt();
			if (valorFinanciado2 >= 1000 && valorFinanciado <= 1_000_000) {
				valorFinanciado = valorFinanciado2;
				break;
			}
		}	
					
		System.out.print("Taxa de juros (anual): ");
		float taxaAnual = scanner.nextFloat();
		while ((taxaAnual <= 0) || (taxaAnual > 30)) {
			System.out.println("Insira um valor maior que 0 e menor que 30.");
			System.out.print("Taxa de juros (anual): ");
			float taxaAnual2 = scanner.nextFloat();
			if (taxaAnual2 > 0 && taxaAnual2 <= 30) {
				taxaAnual = taxaAnual2;
				break;
			}
		}
		float taxaMensal = taxaAnual / PERCENTUAL / MESES_NO_ANO;
		
		System.out.print("Prazo do financiamento (anos): ");
		byte anos = scanner.nextByte();
		while ((anos < 1) || (anos > 30)) {
			System.out.println("Insira um valor entre 1 e 30");
			System.out.print("Prazo do financiamento (anos): ");
			byte anos2 = scanner.nextByte();
			if (anos2 >= 1 && anos2 <= 30) {
				anos = anos2;
				break;
			}
		}
		int prazoDePagamentos = anos * MESES_NO_ANO;
		
		double parcelaMensal = valorFinanciado
				* (taxaMensal * Math.pow(1 + taxaMensal, prazoDePagamentos))
				/ (Math.pow(1 + taxaMensal, prazoDePagamentos)-1);
		
		String parcelaMensalFormatada = NumberFormat.getCurrencyInstance().format(parcelaMensal);
		System.out.println("Parcela mensal: " + parcelaMensalFormatada);
		
		scanner.close();

	}

}

