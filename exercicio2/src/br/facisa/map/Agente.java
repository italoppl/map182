package br.facisa.map;

public class Agente {
	
	private Pessoa pessoa;
	private String idAgente;
	
	public Agente (Pessoa pessoa, String id) {
		this.pessoa = pessoa;
		this.idAgente = id;
	}
	
	public String getIdAgente() {
		return idAgente;
	}
	public void setIdAgente(String idAgente) {
		this.idAgente = idAgente;
	}	
	
	public String getNomeAgente() {
		return pessoa.getNome();
	}
	
	public void setNome (String nomeAgente) {
		pessoa.setNome(nomeAgente);
	}
	
	public String getEnderecoAgente() {
		return pessoa.getEndereco();
	}
	
	public void setEndereco (String enderecoAgente) {
		pessoa.setNome(enderecoAgente);
	}
	
	

}
