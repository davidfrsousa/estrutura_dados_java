package insertionsort;

public class InsertionSort {
	public static int[] insertionsort(int vetor[]) {
		int aux;
		int tam = vetor.length;
		int j;
		for(int i = 1; i < tam; i++) {
			aux = vetor[i];
			j = i - 1;
			while(j >= 0 && aux < vetor[j]) {
				vetor[j+1] = vetor[j];
				j--;
			}
			vetor[j+1] = aux;
		}
		return vetor;
	}
	
	public static void main(String[] args) {
		int[] vetor = {5,3,1,4,2};
		insertionsort(vetor);
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}
