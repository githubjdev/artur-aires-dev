package artur.pdv.interfaces;

public interface VendaServiceI {
	
	
	void addProduto(String codigoBarra, double quatidade);
	void removerProduto(String codigoBarra);
	void aplicarDesconto(double valor);
	
	default void comprovante() {
		System.out.println("compt");
	}

}
