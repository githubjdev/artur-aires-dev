package artur.pdv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import artur.pdv.enums.FormaPagamento;

public class Venda {

	private Long id;
	private Date data;
	private double desconto;
	private double valorPago;
	private String descricao;
	private FormaPagamento formaPagamento;

	private Pessoa pessoa;
	private ComprovanteNota comprovanteNota;
	private List<ItemVenda> itens = new ArrayList<>();
	
	public Venda(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	

	public void adicionarProduto(Produto produto, double quantidade) {
		itens.add(new ItemVenda(produto, quantidade, this));
	}

	public void removerProduto(String codigoBarra) {
		itens.removeIf(item -> item.getProduto().getCodigoBarra().equals(codigoBarra));
	}

	public double totalVenda() {

		double total = 0.0;

		for (ItemVenda item : itens) {
			total += item.getProduto().getPreco() * item.getQuantidade();
		}

		return total;
	}

	public double totalVendaFinal() {
		return totalVenda() - desconto;
	}

	public List<ItemVenda> getItens() {
		return itens;
	}

	public void setItens(List<ItemVenda> itens) {
		this.itens = itens;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ComprovanteNota getComprovanteNota() {
		return comprovanteNota;
	}

	public void setComprovanteNota(ComprovanteNota comprovanteNota) {
		this.comprovanteNota = comprovanteNota;
	}

}
