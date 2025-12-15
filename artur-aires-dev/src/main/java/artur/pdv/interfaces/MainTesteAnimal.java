package artur.pdv.interfaces;

public class MainTesteAnimal {

	public static void main(String[] args) {

		Animal cachorro = new Cachorro("Zeus");
		Animal gato = new Gato("Mi mi");

		Zoologico zoologico = new Zoologico();
		zoologico.interagirComAnimal(gato);
		zoologico.interagirComAnimal(cachorro);

	}

}
