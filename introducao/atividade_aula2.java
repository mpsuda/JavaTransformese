package introducao;

public class atividade_aula2 {
	
	public static void main(String[]args) {
		int mes1 = 40;
		int mes2 = 30;
		int mes3 = 70;
		
		float soma = mes1 + mes2 + mes3;
		
		float media = soma / 3;
		float sobra = soma % 3;
		
		System.out.println("A média dos últimos 3 meses foi de: "
				+ media + " clientes" );
		System.out.println("A sobra no cálculo da média é de: "
				+ sobra + "  clientes");
	}

}
