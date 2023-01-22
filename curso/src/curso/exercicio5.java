package curso;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int codPeca1, numPeca1, codPeca2, numPeca2 ;
		double valorUni1,valorUni2,valorPagar; 
		
		codPeca1 = sc.nextInt();
		numPeca1 = sc.nextInt(); 
		sc.nextLine();
		valorUni1 = sc.nextDouble();
		
		codPeca2 = sc.nextInt();
		numPeca2 = sc.nextInt(); 
		sc.nextLine();
		valorUni2 = sc.nextDouble();
		
		valorPagar = numPeca1 * valorUni1 + numPeca2 * valorUni2;
		System.out.printf("valor a Pagar: $ %.2f%n", valorPagar);
		
		
		
		
		
		sc.close();
	
	}
	
	
}
