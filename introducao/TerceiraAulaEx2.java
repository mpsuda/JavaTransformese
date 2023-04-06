package introducao;

import java.util.Scanner;

public class TerceiraAulaEx2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, informe um número");
		int primeiroNumero = entrada.nextInt();
		
		System.out.println("Por favor, informe outro número");
		int segundoNumero = entrada.nextInt();
		
		float soma = primeiroNumero + segundoNumero;
		float subtracao = primeiroNumero - segundoNumero;
		float multiplicacao = primeiroNumero * segundoNumero;
		float media = soma/2;
		
		System.out.println(soma + " é a soma dos 2 números");
		System.out.println(subtracao + " é a subtração");
		System.out.println(multiplicacao + " é o valor da multiplicação");
		System.out.println(media + " é a média");
		
		entrada.close();
	}

}
