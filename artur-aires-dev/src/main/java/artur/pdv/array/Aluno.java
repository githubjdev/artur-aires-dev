package artur.pdv.array;

public class Aluno {

	private String nome;
	private int idade;
	private double notas[] = new double[4];

	public Aluno(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	/* Mostras os dados */
	public void mostrar() {
		System.out.println("Nome: " + nome + ", idade : " + idade);
	}

}
