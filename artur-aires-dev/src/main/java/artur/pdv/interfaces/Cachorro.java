package artur.pdv.interfaces;

public class Cachorro implements Animal{

	private String nome;
	
	public Cachorro(String nome) {
		this.nome = nome;
	}

	@Override
	public void emitirSom() {

		System.out.println("au au au");

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void correr() {
		
		System.out.println("cchorro correndo");
		
	}

	@Override
	public void respirar() {
		System.out.println(nome + " : cachorro está respirando");
		
	}

}
