package introducao;

import java.util.Scanner;

public class atividade3Aula7Desafio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int soma = 0;
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("Por favor, digite um número par: ");
			int numero = entrada.nextInt();
			
			if (numero % 2 == 0) {
			soma += numero;			
		} else {
			System.out.println("O número informado é impar e não será considerado. ");
			i--;
		}
		}
		System.out.println("A soma dos números pares informados resulta no valor de: " + soma);
		
		entrada.close();
		
	}
}
