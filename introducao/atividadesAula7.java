package introducao;

import java.util.Scanner;

public class atividadesAula7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		while (num < 100) {
			System.out.println("Favor informar um número");
			int num1 = entrada.nextInt();
			
			num += num1;
		}
		
		System.out.println("A soma dos números, com resultado igual ou maior a 100 é: " + num);
				
		entrada.close();		
	}
}
