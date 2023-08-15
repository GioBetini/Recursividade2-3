package view;

import controller.QuantPar;

public class Principal {

	public static void main(String[] args) {
		controller.QuantPar qp = new controller.QuantPar();
		int[] vetor = { 1, 4, 5, 34, 2, 5, 6, 1, 67, 8, 12 };
		int size = vetor.length;
		int vet = qp.vetPar(vetor, size-1);
		System.out.println("A quantidade de número pares no vetor é: "+vet);

	}

}
