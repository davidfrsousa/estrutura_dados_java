package selectionsort;

public class SelectionSort {
	
	public static int[] selectionsort(int vetor[]) {
		int aux;
		int tam = vetor.length;
		for(int i = 0; i < tam - 1; i++) {
			for(int j = i+1; j < tam; j++) {
				if(vetor[j] < vetor[i]) {
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
		}
		return vetor;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor[] = {34,25,12,64,90,11,22};
		selectionsort(vetor);
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
