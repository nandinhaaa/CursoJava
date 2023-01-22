package curso;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main (String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numFunc, horasTrabalhadas;
		double valorHora, salario;

		numFunc = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		sc.nextLine();
		valorHora = sc.nextDouble();

		salario = horasTrabalhadas * valorHora;

		System.out.println("Numero: " + numFunc);
		System.out.printf("salario = U$ %.2f%n", salario);

		           sc.close();

	}

}
