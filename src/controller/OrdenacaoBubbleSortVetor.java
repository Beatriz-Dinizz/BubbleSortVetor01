package controller;

import br.edu.fateczl.BubbleSort.OrdenacaoBubbleSort;

public class OrdenacaoBubbleSortVetor {

	public OrdenacaoBubbleSortVetor() {
		super();
	}
	
	public void ordenarVetorBubbleSort() {
		OrdenacaoBubbleSort ordenacao = new OrdenacaoBubbleSort();
		
		int[] vetor = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		ordenacao.ordenacaoBubbleSort(vetor);
		
		int tamanho = vetor.length;
		for(int i = 0; i < tamanho; i ++) {
			System.out.println(vetor[i]);
		}
	}
}
