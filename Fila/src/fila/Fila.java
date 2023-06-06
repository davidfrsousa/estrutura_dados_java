package fila;

public class Fila {

	private Integer[] elementos;

	public void tamanho(int valor) {
		elementos = new Integer[valor];
	}

	public void enfileirar(int valor) {
		int ultimoElemento = 0;
		for (Integer elemento : elementos) {
			if (elemento != null) {
				ultimoElemento++;
			}
		}
		elementos[ultimoElemento] = valor;
	}

	public int desenfileirar() {
		int cont = 0;
		int desenfileirado = elementos[0];
		elementos[0] = null;
		Integer[] aux = new Integer[elementos.length];
		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i] != null) {
				aux[cont] = elementos[i];
				cont++;
			}
		}
		elementos = aux;

		return desenfileirado;
	}

	public void imprimir() {
		int tam = elementos.length;
		String fila = "[ " + elementos[0];
		for (int i = 1; i < tam; i++) {
			if (elementos[i] != null) {
				fila += ", " + elementos[i];
			}
		}
		fila += " ]";
		System.out.println(fila);
	}
}
