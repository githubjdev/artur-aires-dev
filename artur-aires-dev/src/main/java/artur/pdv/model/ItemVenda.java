package artur.pdv.model;

public class ItemVenda {

	private Long id;
	private double quantidade;
	private String descricao;
	private Produto produto;
	private Venda venda;

	public ItemVenda(Produto produto, double quantidade, Venda venda) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		this.venda = venda;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
