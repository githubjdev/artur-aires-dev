package artur.pdv.model;

import java.util.ArrayList;
import java.util.List;

import artur.pdv.enums.FormaPagamento;

public class Venda {

	private List<ItemVenda> itens = new ArrayList<>();
	private double desconto;
	private double valorPago;
	private FormaPagamento formaPagamento;

	public void adicionarProduto(Produto produto, double quantidade) {
		itens.add(new ItemVenda(produto, quantidade));
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

}
