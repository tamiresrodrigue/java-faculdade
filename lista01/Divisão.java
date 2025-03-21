package lista01;

import java.util.Scanner;

public class Divisão {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um numero:");
		int numero1 =sc.nextInt();
	    System.out.println("Digite um segundo numero:");
	    int numero2 =sc.nextInt();
	    int resultado = numero1/numero2;
	    System.out.println();
	    System.out.println("A divisão dos valores digitados é:" +resultado);	
	    sc.close();
}
}
