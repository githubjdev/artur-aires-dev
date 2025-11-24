package artur.pdv.service;

import artur.pdv.enums.FormaPagamento;
import artur.pdv.model.ItemVenda;
import artur.pdv.model.Produto;
import artur.pdv.model.Venda;
import artur.pdv.util.LeitorCodigoBarras;

public class VendaService {

	private Venda vendaAtual;
	private LeitorCodigoBarras leitor;

	public VendaService() {
		vendaAtual = new Venda();
		leitor = new LeitorCodigoBarras();
	}

	public void addProduto(String codigoBarra, double quatidade) {
		Produto p = leitor.ler(codigoBarra);

		if (p != null) {
			vendaAtual.adicionarProduto(p, quatidade);
		} else {
			System.out.println("Produto não existe");
		}
	}

	public void removerProduto(String codigoBarra) {
		vendaAtual.removerProduto(codigoBarra);
	}

	public void aplicarDesconto(double valor) {
		vendaAtual.setDesconto(valor);
	}

	public double totalVenda() {
		return vendaAtual.totalVenda();
	}

	public double totalVendaFinal() {
		return vendaAtual.totalVendaFinal();
	}
	
	
	public void finalizarVenda(FormaPagamento formaPagamento) {
		vendaAtual.setFormaPagamento(formaPagamento);
		System.out.println("Venda finalizada com: " + formaPagamento);
		System.out.println("Total a pagar: R$: " + totalVendaFinal());
		
		/*Grava no banco de dados*/
		/*Diminuir estoque*/
		/*Imprimir comprovante*/
	}
	
	public void imprimirNota() {
		
		System.out.println("------------------------NOTA FISCAL-----------------------");
		
		for (ItemVenda item: vendaAtual.getItens()) {
			System.out.println(item.getProduto().getNome() + " qtd: " + item.getQuantidade());
		}
		
		System.out.println("-----------------------------------------------");
		
		
		System.out.println("Total Bruto: " + vendaAtual.totalVenda());
		System.out.println("Total Final: " + vendaAtual.totalVendaFinal());
	}

}
