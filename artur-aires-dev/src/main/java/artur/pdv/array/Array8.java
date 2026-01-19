package artur.pdv.array;

public class Array8 {

	/*
	 * Dado um array de números, gerar uma nova lista(array) onde cada número esteja
	 * multiplicado por 2.
	 */
	public static void main(String[] args) {

		int[] numeros = { 3, 5, 10, 15, 20, 25, 35, 60, 70 };
		int[] dobro = new int[numeros.length];

		for (int i = 0; i < numeros.length; i++) {
			dobro[i] = numeros[i] * 2;
		}
		
		
		for (int d : dobro) {
			System.out.println(d);
		}

	}

}
