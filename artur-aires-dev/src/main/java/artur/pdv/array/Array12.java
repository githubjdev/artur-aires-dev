package artur.pdv.array;

public class Array12 {

	public static void main(String[] args) {

		/*
		 * Dado um array de inteiros, encontre o segundo maior valor sem ordenar o array
		 */
		int[] numeros = { 10, 50, 20, 5, 80, 60 };

		int maior = Integer.MIN_VALUE;
		int segundoMaior = Integer.MIN_VALUE;

		for (int n : numeros) {

			if (n > maior) {
				segundoMaior = maior;
				maior = n;
			} else if (n > segundoMaior && n != maior) {
				segundoMaior = n;
			}

		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Segundo Maior: " + segundoMaior);

	}

}
