package artur.pdv.util;

import java.util.HashMap;
import java.util.Map;

import artur.pdv.model.Produto;

public class LeitorCodigoBarras {
	
	private Map<String, Produto> catalago = new HashMap<>();
	
	public LeitorCodigoBarras() {
		// simulação de produto cadastrados
		
		catalago.put("7891000100101", new Produto("7891000100101", "Arroz 5k", 21.90));
		catalago.put("7891000100102", new Produto("7891000100102", "Feijão 1k", 7.50));
		catalago.put("7891000100103", new Produto("7891000100103", "Coca cola 2L", 8.99));
	}
	
	
	public Produto ler(String codigoBarra) {
		return catalago.get(codigoBarra);
	}
	
	

}
