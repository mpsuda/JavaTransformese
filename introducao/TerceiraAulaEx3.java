package introducao;

import java.util.Scanner;

public class TerceiraAulaEx3 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, informe seu nome");
		String nome = entrada.nextLine();
		
		System.out.println("Por favor, informe seu sobrenome");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Por favor, informe sua cor favorita");
		String cor = entrada.nextLine();
		
		System.out.println("Por favor, informe seu time favorito");
		String timeFavorito = entrada.nextLine();
		
		System.out.printf("Olá, %s %s, sua cor favorita é %s e seu time favorito %s",
				nome, sobrenome, cor, timeFavorito);
		
		entrada.close();
		
	}
}
