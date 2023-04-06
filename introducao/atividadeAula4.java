package introducao;

import java.util.Scanner;

public class atividadeAula4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
						
		System.out.println("Por favor, informe o valor do acordo");
		int primeiroValor = entrada.nextInt();
		
		System.out.println("Por favor, informe o dia de pagamento");
		int numero = entrada.nextInt();
		
		int dataVencimento = 8;
		int dataPagamento = numero - dataVencimento;
				
		if (dataPagamento <= 0) {
			System.out.printf("O valor a pagar nesta data é R$ %d, no prazo, SEM cobrança de multa", primeiroValor);
		} else if (dataPagamento > 0 && dataPagamento <= 10) {
			int multa = 1;
			int valorMulta = dataPagamento * multa;
			int primeiroValorMulta = primeiroValor + valorMulta; 
			System.out.printf("O valor da multa pelo atraso de %d dias é de R$ %d."
					+ "O valor total a pagar nesta data é de R$ %d.", dataPagamento, valorMulta, primeiroValorMulta);
		} else {
			double multaTempo = 1.50d;
			double valorMultaTempo = dataPagamento * multaTempo;
			double segundoValorMulta = primeiroValor + valorMultaTempo; 
			System.out.printf("O valor da multa pelo atraso de %d dias é de R$ %f."
					+ "O valor total a pagar nesta data é de R$ %f", dataPagamento, valorMultaTempo, segundoValorMulta);
			entrada.close();
			}
		}
}
