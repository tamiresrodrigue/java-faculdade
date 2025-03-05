package lista02;

import java.util.Scanner;

public class MediaPonderada {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua 1° Nota:");
		float nota1= sc.nextFloat();
		System.out.println("Digite o valor do peso da sua 1°Nota");
		int peso1 = sc.nextInt();
		System.out.println("Digite o valor da sua 2° Nota:");
		float nota2= sc.nextFloat();
		System.out.println("Digite o valor do peso da sua 2°Nota");
		int peso2 = sc.nextInt();
		System.out.println("Digite o valor da sua 3° Nota:");
		float nota3= sc.nextFloat();
		System.out.println("Digite o valor do peso da sua 3°Nota");
		int peso3 = sc.nextInt();
		sc.close();
		
	}

}
