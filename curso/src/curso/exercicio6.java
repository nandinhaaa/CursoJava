package curso;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A, B, C, pi = 3.14159, Triangulo, Circulo, Trapezio, Quadrado, Retangulo;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		Triangulo = A* C / 2;
		Circulo = pi * C * C;
		Trapezio = 0.5 * C * (A + B);
		Quadrado = B*B;
		Retangulo = A *B; 

		System.out.printf("Triangulo:  %.3f%n", Triangulo);
		System.out.printf("Circulo:  %.3f%n", Circulo);
		System.out.printf("Trapezio:  %.3f%n", Trapezio);
		System.out.printf("Quadrado:  %.3f%n",Quadrado);
		System.out.printf("Retangulo:  %.3f%n",Retangulo);
		
		sc.close();

	}
}
