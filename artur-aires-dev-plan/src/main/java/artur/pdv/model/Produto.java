package artur.pdv.model;

public class Produto {

	private Long id;
	private String codigoBarra;
	private String nome;
	private double preco;
	private Categoria categoria;

	public Produto(String codigoBarra, String nome, double preco, Categoria categoria) {
		super();

		this.codigoBarra = codigoBarra;
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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
