import artur.pdv.enums.FormaPagamento;
import artur.pdv.service.VendaService;

public class VendaTeste {
	
	public static void main(String[] args) {
		VendaService vendaService = new VendaService();

		vendaService.addProduto("7891000100101", 1);
		vendaService.addProduto("7891000100103", 2);
		vendaService.aplicarDesconto(5.00);
		vendaService.finalizarVenda(FormaPagamento.PIX);
		
		
		vendaService.imprimirNota();
		
	}

}
