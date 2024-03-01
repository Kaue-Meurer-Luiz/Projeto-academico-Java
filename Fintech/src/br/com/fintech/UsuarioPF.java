package br.com.fintech;

public class UsuarioPF extends Usuario {
	private static final long serialVersionUID = 1L;
	
	private String cpf;
	private String rg;
	private String dataNasc;
	private String sexo;
	
	//Construtor padrão
	public UsuarioPF() {};
	
	//Construtor de Classe
	public UsuarioPF(String cpf, String rg, String dataNasc, String sexo) {
		this.cpf = cpf;
		this.rg = rg;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
	}
	
	// Implementação dos metodos Getters and Setters
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	}