package controller;

public class QuantPar {

	public QuantPar() {
		super();
	}

	public int vetPar(int[] vetor, int size) {
		if (size == 0) {
			return 0;
		}
		if (vetor[size] % 2 == 0) {
			return 1 + vetPar(vetor, size - 1);
		}
		return 0 + vetPar(vetor, size - 1);
	}

}
