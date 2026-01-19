package artur.pdv.array;

public class Array10 {
	
	/*Verificar quantos números são pares*/
	public static void main(String[] args) {
		
		int[] numeros = { 3, 5, 10, 15, 20, 25, 35, 60, 70 };
		
		
		int pares = 0;
		for (int n : numeros) {
			if (n % 2 == 0) {
				pares ++;
				System.out.println(n);
			}
		}
		
		System.out.println("QUantidad de pares: " + pares);
		
	}

}
