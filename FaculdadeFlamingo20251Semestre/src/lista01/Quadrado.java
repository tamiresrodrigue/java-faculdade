package lista01;

import java.util.Scanner;

public class Quadrado {
	public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
		System.out.println("Digite o valor que deseja saber o quadrado:");
		float numero1 = sc.nextFloat();
		float resultado = numero1 * numero1;
		
	System.out.println("O quadrado de " + numero1 + " é igual à: " + resultado);
	
		sc.close();
	}
}
