package br.com.fintech;

public class Endereco {
	private String cep;
	private String cidade;
	private String enderecoRua;
	private String bairro;
	private int nroResidencia;
	private String complemento;
	
	
	//Construtor padrão
	public Endereco () {}
	
	//Construtor de classe
	public Endereco (String cep, String cidade, String enderecoRua, String bairro, int nroResidencia, String complemento) {
		this.cep = cep;
		this.cidade = cidade;
		this.enderecoRua = enderecoRua;
		this.bairro = bairro;
		this.nroResidencia = nroResidencia;
		this.complemento = complemento;
	}

	
	// Implementação dos metodos Getters and Setters
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEnderecoRua() {
		return enderecoRua;
	}

	public void setEnderecoRua(String enderecoRua) {
		this.enderecoRua = enderecoRua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNroResidencia() {
		return nroResidencia;
	}

	public void setNroResidencia(int nroResidencia) {
		this.nroResidencia = nroResidencia;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	@Override
	public String toString() {
		return "O cep é: "+ this.cep + "\n" + "A cidade é: " + this.cidade + "\n" + "O endereço seria: " + this.enderecoRua
				+ "\n" + "Bairro: " + this.bairro + "\n" + "Número: " + this.nroResidencia + "\n" + "Complemento: " + this.complemento;
	}
	
	

}
