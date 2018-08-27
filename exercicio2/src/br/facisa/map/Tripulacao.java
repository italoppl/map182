package br.facisa.map;

public class Tripulacao {
	
	private Pessoa pessoa;
	private  String idTripulacao;
	
	public Tripulacao (Pessoa pessoa, String id) {
		this.pessoa = pessoa;
		this.idTripulacao = id;
	}

	public String getIdTripulacao() {
		return idTripulacao;
	}

	public void setIdTripulacao(String idTripulacao) {
		this.idTripulacao = idTripulacao;
	}
	
	public String getNomeTripulacao() {
		return pessoa.getNome();
	}
	
	public void setNome (String nomeTripulacao) {
		pessoa.setNome(nomeTripulacao);
	}
	
	public String getEnderecoTripulacao() {
		return pessoa.getEndereco();
	}
	
	public void setEndereco (String enderecoTripulacao) {
		pessoa.setNome(enderecoTripulacao);
	}

}
