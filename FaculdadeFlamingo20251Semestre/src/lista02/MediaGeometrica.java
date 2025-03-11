package lista02;

import java.util.Scanner;

public class MediaGeometrica {
	public static void main(String[]args){

	Scanner sc = new Scanner(System.in);{
		System.out.println("Digite o 1 numero: ");
		double numero01 = sc.nextDouble();
		System.out.println("Digite o 2 numero: ");
		double numero02 = sc.nextDouble();
		System.out.println("Digite 0 3 numero: ");
		double numero03 = sc.nextDouble();
		//calcular o MMC (Minimo, Multiplo Comum)
		/*(3*6*9)=> 3*6*9=162*/
		double mediaGeometrica = Math.cbrt(numero01*numero02*numero03);
				System.out.println("A média geometrica dos numeros digitados é:" +mediaGeometrica);
	}
	}

	