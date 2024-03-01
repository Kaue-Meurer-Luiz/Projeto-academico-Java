package br.com.fintech;

public class Contato  {	
	private String telCelular;
	private String telResidencial;
	private String telComercial;
	private String email;
	
	
	
	//Construtor padrão
	public Contato () {}
	
	//Construtor de Classe
	public Contato (String telCelular, String telResidencial, String telComercial, String email ) {
		this.telCelular = telCelular;
		this.telResidencial = telResidencial;
		this.telComercial = telComercial;
		this.email = email;
	}
	
	// Implementação dos metodos Getters and Setters
	public String getTelCelular() {
		return telCelular;
	}
	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
	}
	public String getTelResidencial() {
		return telResidencial;
	}
	public void setTelResidencial(String telResidencial) {
		this.telResidencial = telResidencial;
	}
	public String getTelComercial() {
		return telComercial;
	}
	public void setTelComercial(String telComercial) {
		this.telComercial = telComercial;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "O telefone celular é: " + this.telCelular + "\n" + "O telefone residencial é: " + this.telResidencial + "\n" + "O telefone comercial é: " + this.telComercial + "\n" + "O E-mail para contato é: " + this.email;
	}
	
	

}
