package artur.pdv.array;

public class Array1 {

	public static void main(String[] args) {

		int[] numeros = { 10, 20, 30, 40 };
		
		/*for (int n : numeros) {
			System.out.println(n);
		}*/
		
		//System.out.println(numeros[1]);
		
		numeros[1] = 50;
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println(numeros[i]);
		}

	}

}
