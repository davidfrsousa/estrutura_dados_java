package fila;

import java.util.LinkedList;
import java.util.Queue;

public class Main_Interface {

	public static void main(String[] args) {

		Queue<Integer> fila = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			fila.add(i * 2);
		}
		System.out.println("Elementos na fila: " + fila);
		
		fila.remove();
		System.out.println("Elementos na fila: " + fila);

	}

}
