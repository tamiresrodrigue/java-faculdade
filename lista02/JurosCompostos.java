package lista02;

import java.util.Scanner;

public class JurosCompostos {
    
    // Função para calcular o montante com juros compostos
    public static double JurosCompostos(double capitalInicial, double taxaJuros, int anos) {
        return capitalInicial * Math.pow(1 + (taxaJuros / 100), anos);
    }

    public static void main(String[] args) {
        // Criando o scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o capital inicial (em R$): ");
        double capitalInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de juros anual (%): ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Digite o número de anos: ");
        int anos = scanner.nextInt();

        // Cálculo do montante final
        double montanteFinal = JurosCompostos(capitalInicial, taxaJuros, anos);

        // Exibindo o resultado
        System.out.printf("O montante final após %d anos será: R$%.2f\n", anos, montanteFinal);
        
        // Fechando o scanner
        scanner.close();
    }
}
