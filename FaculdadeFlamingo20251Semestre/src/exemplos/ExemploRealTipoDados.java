package exemplos;

public class ExemploRealTipoDados {

	public static void main(String[] args) {
		//Declaração das variaveis
		
		int itens =50;
		float precoPorItens = 9.99f;
		float precoTotal = itens * precoPorItens;
		char moeda = '$';
		
		System.out.println("A quantidade de itens é:"+itens);
		System.out.println("O preco por item é:" +precoPorItens+moeda);
		System.out.println("O preco total é:" +precoTotal + moeda);
	}

}
