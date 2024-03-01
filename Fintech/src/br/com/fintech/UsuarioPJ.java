package br.com.fintech;

public class UsuarioPJ extends Usuario {
	private static final long serialVersionUID = 1L;

	private String cnpj;
	private String nroIscricaoEst;
	private String nroIscricaoMun;
	private String nomeFantasia;
	
	//Construtor padrão
	public UsuarioPJ () {};
	
	//Construtor de Classe
	public UsuarioPJ(String cnpj, String nroIscricaoEst, String nroIscricaoMun, String nomeFantasia) {		
		this.cnpj = cnpj;
		this.nroIscricaoEst = nroIscricaoEst;
		this.nroIscricaoMun = nroIscricaoMun;
		this.nomeFantasia = nomeFantasia;
	}

	// Implementação dos metodos Getters and Setters
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNroIscricaoEst() {
		return nroIscricaoEst;
	}

	public void setNroIscricaoEst(String nroIscricaoEst) {
		this.nroIscricaoEst = nroIscricaoEst;
	}

	public String getNroIscricaoMun() {
		return nroIscricaoMun;
	}

	public void setNroIscricaoMun(String nroIscricaoMun) {
		this.nroIscricaoMun = nroIscricaoMun;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
}