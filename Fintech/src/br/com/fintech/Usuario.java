package br.com.fintech;

public class Usuario extends Login {

	private static final long serialVersionUID = 1L;
	
	private int codUser;
	private String nomeUser;
	
	
	//Construtor padrão
	public Usuario () {}
	
	
	//Construtor de Classe
	public Usuario (int codUser, String nomeUser) {
		this.codUser = codUser;
		this.nomeUser = nomeUser;
	}
	
	
	// Implementação dos metodos Getters and Setters
	public String getNomeUser() {
		return nomeUser;
	}
	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}
	
	public int getCodUser() {
		return codUser;
	}
	public void setCodUser(int codUser) {
		this.codUser = codUser;
	}
		
	}
	
	

