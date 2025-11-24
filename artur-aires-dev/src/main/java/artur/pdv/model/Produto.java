package artur.pdv.model;

public class Produto {

	private String codigoBarra;
	private String nome;
	private double preco;

	public Produto(String codigoBarra, String nome, double preco) {
		super();
		
		this.codigoBarra = codigoBarra;
		this.nome = nome;
		this.preco = preco;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
