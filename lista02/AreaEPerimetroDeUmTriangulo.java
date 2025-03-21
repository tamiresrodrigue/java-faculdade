package lista02;

import java.util.Scanner;

public class AreaEPerimetroDeUmTriangulo {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do triangulo:");
		float lado1 = sc.nextFloat();
		System.out.println("Digite o segundo lado do triangulo:");
		float lado2 = sc.nextFloat();
		System.out.println("Digite o treceiro lado do triangulo:");
		float lado3 = sc.nextFloat();
		float perimetro = lado1+lado2+lado3;
		System.out.println("Digite o valor da base do triângulo:");
		float base = sc.nextFloat();
		System.out.println("Digite o valor da altura do triângulo:");
		float altura = sc.nextFloat();
		float area = base*altura/2;
		System.out.println("Valor do perimetro é:" +perimetro);
		System.out.println("O valor da area é:" +area);
		sc.close();
		
	}

}
