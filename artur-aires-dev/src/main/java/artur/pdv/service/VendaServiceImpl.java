package artur.pdv.service;

import java.util.Calendar;

import artur.pdv.enums.FormaPagamento;
import artur.pdv.enums.TipoComprovante;
import artur.pdv.interfaces.VendaServiceI;
import artur.pdv.model.ComprovanteNota;
import artur.pdv.model.ItemVenda;
import artur.pdv.model.Pessoa;
import artur.pdv.model.Produto;
import artur.pdv.model.Venda;
import artur.pdv.util.LeitorCodigoBarras;

public class VendaServiceImpl implements VendaServiceI {

	private Venda vendaAtual;
	private LeitorCodigoBarras leitor;

	public VendaServiceImpl(Pessoa pessoa) {
		vendaAtual = new Venda(pessoa);
		leitor = new LeitorCodigoBarras();
	}

	@Override
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
		
		System.out.println("Cliente Pessoa: " + vendaAtual.getPessoa().getNome());
		System.out.println("CPF do Cliente: " + vendaAtual.getPessoa().getCpf());
		System.out.println("Venda finalizada com: " + formaPagamento);
		System.out.println("Total a pagar: R$: " + totalVendaFinal());
		
		/*Grava no banco de dados*/
		/*Diminuir estoque*/
		/*Imprimir comprovante*/
	}
	
	public void imprimirNota() {
		
		
		ComprovanteNota comprovanteNota = new ComprovanteNota();
		comprovanteNota.setData(Calendar.getInstance().getTime());
		comprovanteNota.setDescricao("Comprovante de venda para: " + vendaAtual.getPessoa().getNome());
		comprovanteNota.setVenda(vendaAtual);
		comprovanteNota.setTipoComprovante(TipoComprovante.COMPROVANTE);
		
		System.out.println("------------------------NOTA FISCAL-----------------------");
		
		for (ItemVenda item: comprovanteNota.getVenda().getItens()) {
			System.out.println(item.getProduto().getNome() + " qtd: " + item.getQuantidade());
		}
		
		System.out.println("-----------------------------------------------");
		
		
		System.out.println("Total Bruto: " + comprovanteNota.getVenda().totalVenda());
		System.out.println("Total Final: " + comprovanteNota.getVenda().totalVendaFinal());
	}

}
