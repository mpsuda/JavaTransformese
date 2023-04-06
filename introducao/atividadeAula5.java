package introducao;

import java.util.Scanner;

public class atividadeAula5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, informe a hora de 0 a 23");
		int horaValor = entrada.nextInt();
		
		System.out.println("Por favor, informe se é PF ou PJ");
		String pessoaValor = entrada.next();
		
		if ( horaValor >= 0 && horaValor <= 12) {
			System.out.println("Bom dia!");
			System.out.println(pessoaValor);
		} else if (horaValor <= 18){
			System.out.println("Boa tarde!");
			System.out.println(pessoaValor);
		} else if (horaValor <=23) {
			System.out.println("Boa noite!");
			System.out.println(pessoaValor);
		} else {
			System.out.println(" Favor informar hora de 0 a 23");
		}
		entrada.close();
	}
}
