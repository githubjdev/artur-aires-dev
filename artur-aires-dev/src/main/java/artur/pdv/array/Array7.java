package artur.pdv.array;

public class Array7 {
	
	/*Encontrar nomes que começcam com A*/
	public static void main(String[] args) {
		String [] nomes = {"Alex", "Artur", "João", "Pedro"};
		
		for (String nome : nomes) {
			if (nome.startsWith("A")) {
				System.out.println(nome);
			}
		}
		
	}

}
