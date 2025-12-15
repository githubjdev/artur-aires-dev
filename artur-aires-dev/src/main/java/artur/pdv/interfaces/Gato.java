package artur.pdv.interfaces;

public class Gato implements Animal {

	private String nome;
	
	public Gato(String nome) {
		this.nome = nome;
	}

	@Override
	public void emitirSom() {
		System.out.println("miu miau");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void correr() {
		System.out.println("gato correndo");
		
	}

	@Override
	public void respirar() {
		System.out.println(nome + " :gato está respirando");
		
	}

}
