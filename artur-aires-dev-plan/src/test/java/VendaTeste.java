import artur.pdv.enums.FormaPagamento;
import artur.pdv.model.Pessoa;
import artur.pdv.service.VendaService;

public class VendaTeste {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Alex fernando");
		pessoa.setCpf("56565565656");
		pessoa.setEmail("alex@gmail.com");
		pessoa.setTelefone("4554545455");
		
		VendaService vendaService = new VendaService(pessoa);

		vendaService.addProduto("7891000100101", 1);
		vendaService.addProduto("7891000100103", 2);
		vendaService.aplicarDesconto(5.00);
		vendaService.finalizarVenda(FormaPagamento.PIX);
		
		
		vendaService.imprimirNota();
		
	}

}
