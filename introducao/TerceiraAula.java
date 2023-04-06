package introducao;

import java.util.Scanner;

public class TerceiraAula {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de clientes que ingressaram no primeiro mês");
		int mes1 = entrada.nextInt();
		
		System.out.println("Informe a quantidade de clientes que ingressaram no segundo mês");
		int mes2 = entrada.nextInt();
		
		System.out.println("Informe a quantidade de clientes que ingressaram no terceiro mês");
		int mes3 = entrada.nextInt();
		
		float soma = mes1 + mes2 + mes3;
		float media = soma/3;
				
		System.out.println("A média de clientes que ingressaram por mês é de: " + media);
		
		entrada.close();
	}
		

}
