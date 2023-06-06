package pilha;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		System.out.println("Tamanho da pilha: "+pilha.size());
		System.out.println("Pilha vazio no começo: "+pilha.empty());
		System.out.println("Início do passeio..." + pilha);
		pilha.push("Casa");
		pilha.push("Cinema");
		pilha.push("Oficina Mecânica");
		System.out.println("Local onde deixou a carteira: " + pilha);
		pilha.push("Zoológico");
		pilha.push("Museu");
		pilha.push("Parque");
		pilha.push("Sorveteria");
		System.out.println("Fim do passeio..." + pilha);
		System.out.println("Posição do museu na pilha: "+pilha.search("Museu"));
		System.out.println("Elemento no topo: "+pilha.peek());
		System.out.println("_____________________________");
		System.out.println("Início do caminho inverso...: " + pilha);
		pilha.pop();
		pilha.pop();
		pilha.pop();
		pilha.pop();
		System.out.println("Local onde deixou a carteira: " + pilha);
		pilha.pop();
		pilha.pop();
		pilha.pop();
		System.out.println("Fim do caminho inverso..." + pilha);

	}

}
