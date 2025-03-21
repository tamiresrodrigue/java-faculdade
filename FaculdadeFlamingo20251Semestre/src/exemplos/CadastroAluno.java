package exemplos;

import java.util.Scanner;

public class CadastroAluno {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu nome:");
		String nome = sc.nextLine();
		System.out.println("Digite o seu sobrenome:");
		String sobrenome= sc.next();
		System.out.println("Digite a sua idade:");
		int idade = sc.nextInt();
		System.out.println("Digite o seu periodo de estudo:");
		String periodo = sc.nextLine();
		sc.nextLine();
		System.out.println("Digite a turma que esta matriculado:");
		String turma = sc.nextLine();
		System.out.println("Digite o seu CPF:");
		String cpf = sc.nextLine();
		System.out.println("Digite o seu logradouro:");
		String logadouro = sc.nextLine();
		System.out.println("Digite o seu CEP:");
		String cep = sc.nextLine();
		System.out.println("Digite o seu telefone sem DDD:");
		String telefone = sc.nextLine();
		System.out.println("Digite o numero do seu RG:");
		String rg = sc.nextLine();
		
		System.out.println("O nome do aluno(a) é:"+nome);
		System.out.println("O nome do aluno(a) é:"+sobrenome);
		System.out.println("O nome do aluno(a) é:"+idade);
		System.out.println("O aluno estuda no periodo escolar:"+periodo);
		System.out.println("O aluno estuda na turma:"+turma);
		System.out.println("O numero do CPF do aluno é:"+cpf);
		System.out.println("O nome do logadouro do aluno é:"+logadouro);
		System.out.println("O numero do CEP do aluno(a) é:"+cep);
		System.out.println("O numero do telefone do aluno é:"+telefone);
		System.out.println("O numero do RG do aluno é:"+rg);
		
		
		sc.close();
	}
	

}
