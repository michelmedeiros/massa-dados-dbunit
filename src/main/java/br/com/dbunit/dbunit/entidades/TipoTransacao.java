package br.com.dbunit.dbunit.entidades;

public enum TipoTransacao {
	RECEITA("REC"), DESPESA("DESP");
	
	private String texto;
	
	private TipoTransacao(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public static TipoTransacao getPorTexto(String texto) {
		return (texto.equals("REC"))? RECEITA: DESPESA;
	}
}
