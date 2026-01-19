package artur.pdv.array;

public class Array9 {
	
	/*Exibir quantos nomes possuem mais que 5 caracteres.*/
	public static void main(String[] args) {
		
		String [] nomes = {"Alex", "Artur", "João", "Pedro", "Juliana"};
		
		int contador = 0;
		
		for (String n : nomes) {
			if (n.length() > 5) {
				contador ++;
				System.out.println(n);
			}
		}
		
		System.out.println("Quantidde: " + contador);
		
	}

}
