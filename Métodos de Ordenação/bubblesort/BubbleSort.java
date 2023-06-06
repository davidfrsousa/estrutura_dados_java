package bubblesort;

public class BubbleSort {
	
	public static int[] bubblesort(int vetor[]) {
		int aux;
		int tam = vetor.length;
		for(int i = 0; i < tam - 1; i++) {
			for(int j = 0; j < tam - 1 - i; j++) {
				if(vetor[j] > vetor[j+1]) {
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		return vetor;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor[] = {64,34,25,12,90,11,22};
		bubblesort(vetor);
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
