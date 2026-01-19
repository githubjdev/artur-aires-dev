package artur.pdv.array;

public class Array5 {

	/*Econtrar o numero 22 e parar*/
	public static void main(String[] args) {

		int[] numeros = { 3, 15, 22, 15, 11, 55, 5, 60, 10 };
		
		boolean encotrado = false;
		
		for (int n : numeros) {
			if (n == 22) {
				encotrado = true;
				break;
			}
		}
		
		System.out.println("O 22 foi encontrado? " + encotrado);
		

	}

}
