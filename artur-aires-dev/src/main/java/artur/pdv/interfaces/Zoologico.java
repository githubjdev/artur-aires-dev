package artur.pdv.interfaces;

public class Zoologico {

	public void interagirComAnimal(Animal animal) {
		animal.emitirSom();
		animal.correr();
		animal.respirar();
	}

}
