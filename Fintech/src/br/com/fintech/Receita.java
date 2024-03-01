package br.com.fintech;

public class Receita {
	private String descReita;
	private double valorReceita;
	
	
	// Implementação dos metodos Getters and Setters
	public String getDescReita() {
		return descReita;
	}
	public void setDescReita(String descReita) {
		this.descReita = descReita;
	}
	
	
	//Métodos
	public void entrada (double valor) {
		this.valorReceita += valor;
	}
	
	public double getValorReceita() {
		return valorReceita;
	}

}
