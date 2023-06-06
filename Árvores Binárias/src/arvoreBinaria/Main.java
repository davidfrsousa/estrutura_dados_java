package arvoreBinaria;

public class Main {

	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria();
		arvore.inserir(9);
		arvore.inserir(11);
		arvore.inserir(2);
		arvore.remover(11);
		arvore.inserir(4);
		arvore.remover(2);
		arvore.inserir(7);
		arvore.inserir(10);
		arvore.imprime_preFixado();
	}

}
