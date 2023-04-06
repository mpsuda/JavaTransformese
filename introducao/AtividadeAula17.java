package introducao;

import java.util.Arrays;
import java.util.Scanner;

public class AtividadeAula17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] notas = new double[4];
		
		for (int i = 0; i <= 3; i++ ) {
		System.out.println("Informe a nota " + i);
		notas[i] = entrada.nextDouble();
		}
		System.out.println("As notas do aluno foram: ");
		System.out.println(Arrays.toString(notas));
		
		entrada.close();

		}
}
