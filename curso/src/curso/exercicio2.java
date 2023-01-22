package curso;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double raio, pi = 3.141519, area; 
		
		raio = sc.nextDouble();
		
		area = pi * raio * raio; 
		
		System.out.printf("area=%.4f%n",area);
		
		sc.close();
	
		
	}

}
