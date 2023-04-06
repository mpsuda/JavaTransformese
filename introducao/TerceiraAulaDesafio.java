package introducao;

import java.util.Scanner;

public class TerceiraAulaDesafio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, informe um número");
		int numero = entrada.nextInt();
		
		if (numero % 2 == 0) {
		System.out.printf("Você digitou %d. Seu número é PAR!", numero);
		} else {
			System.out.printf("Você digitou %d. Seu número é ÍMPAR!", numero);
		}
		entrada.close();
		
	}

}
