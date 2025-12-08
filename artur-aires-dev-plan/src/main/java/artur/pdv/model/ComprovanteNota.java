package artur.pdv.model;

import java.util.Date;

import artur.pdv.enums.TipoComprovante;

public class ComprovanteNota {

	private Long id;
	private String descricao;
	private Date data;
	private TipoComprovante tipoComprovante;

	private Venda venda;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public TipoComprovante getTipoComprovante() {
		return tipoComprovante;
	}

	public void setTipoComprovante(TipoComprovante tipoComprovante) {
		this.tipoComprovante = tipoComprovante;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

}
