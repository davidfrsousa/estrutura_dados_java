package fila;

public class Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila fila = new Fila();
		fila.tamanho(10);
		fila.enfileirar(5);
		fila.enfileirar(3);
		fila.desenfileirar();
		fila.enfileirar(7);
		fila.desenfileirar();
		fila.desenfileirar();
		fila.enfileirar(9);
		fila.enfileirar(7);
		fila.enfileirar(3);
		fila.enfileirar(5);
		fila.desenfileirar();

		fila.imprimir();
	}

}
