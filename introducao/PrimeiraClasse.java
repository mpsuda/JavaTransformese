package introducao;

import java.util.Date;

public class PrimeiraClasse {
	
	public static void main(String[] args) {
		System.out.println ("Olá Mundo!");
		System.out.println ("Primeira aula de Java da Turma 1 !!!!");
		System.out.println ("Vamos de turma aprender muuuuuuuito!!!");
		
		Date relogio = new Date();
		System.out.println ("A hora do sistema é :");
		System.out.println(relogio.toString());
		
		// Variáveis
		// Tipo, o nome e o valor
		int idade = 10;
		double altura = 1.70;
		String nome = "Gabriel";
		boolean estaCalor = true;
		
		// Constantes
		
		final int media = 5;
		System.out.println("O valor da média é " + media);
		
		// Não pode
		
		// media = 10;
		
		// System.out.println("O valor da média é " + media);
		
		// Operadores Aritméticos
		
		int a = 5;
		int b = 7;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		
		// Módulo ou resto de uma divisão
		System.out.println(a % b);
		
		}

}
