package br.facisa.map;

public class Passageiro {
	
	private Pessoa pessoa;
	private String numeroSmile;
	
	
	public Passageiro (Pessoa pessoa, String smiles) {
		this.pessoa = pessoa;
		this.numeroSmile = smiles;
	}

	
	public String getNumeroSmile() {
		return numeroSmile;
	}
	public void setNumeroSmile(String numeroSmile) {
		this.numeroSmile = numeroSmile;
	}
	
	public String getNomePassageiro() {
		return pessoa.getNome();
	}
	
	public void setNome (String nomePassageiro) {
		pessoa.setNome(nomePassageiro);
	}
	
	public String getEnderecoPassageiro() {
		return pessoa.getEndereco();
	}
	
	public void setEndereco (String enderecoPassageiro) {
		pessoa.setNome(enderecoPassageiro);
	}
	

}
