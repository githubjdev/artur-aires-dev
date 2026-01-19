package artur.pdv.array;

public class Array4 {

	/* Contar quantos valores são maior que 10 */
	public static void main(String[] args) {

		int[] numeros = { 3, 15, 22, 15, 11, 55, 5, 60, 10 };

		int contador = 0;

		for (int n : numeros) {
			if (n == 10) {
				contador++;
			}
		}
		
		System.out.println("QUantos numero são maiores do que  (10)  qtd: " + contador);

	}

}
