package introducao;

import java.util.Scanner;

public class atividade2Aula7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int proximoNumero;
		int soma = 0;
		
		do {
			System.out.println("Por favor digite um número: ");
			int numero = entrada.nextInt();
			
			soma += numero;
			
			System.out.println("Deseja incluir mais um número: 1 - Sim, 2 - Não ");
			proximoNumero = entrada.nextInt();
						
		} while (proximoNumero != 2);
		
		System.out.println("A soma dos números digitados, resulta no valor de: " + soma);
		
		entrada.close();
		}
}
