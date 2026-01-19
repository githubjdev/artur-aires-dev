package artur.pdv.array;

public class Array6 {

	/* Invertar os valores do array */
	public static void main(String[] args) {

		int[] numeros = { 3, 5, 10, 15, 20, 25, 35, 60, 70 };
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("================================================");
		
		for (int i = numeros.length - 1 ; i >= 0; i--) {
			System.out.println(numeros[i]);
		}

	}

}
