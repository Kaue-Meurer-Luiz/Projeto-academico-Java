package br.com.fintech;

public class Investimento {
	
	private String descInvestimento;
	private int quantInvestimento;
	private double valorInvestido;
	
	
	// Implementação dos metodos Getters and Setters
	public String getDescInvestimento() {
		return descInvestimento;
	}
	public void setDescInvestimento(String descInvestimento) {
		this.descInvestimento = descInvestimento;
	}
	
	
	//Métodos 
	public void quantidade (int valor) {
		this.quantInvestimento += valor;
		
	}
	
	public void retirada (int valor) {
		this.quantInvestimento -= valor;
		}
	
	public void vlInvestido (double valor) {
		this.valorInvestido += valor;
	}
	
	public void vlretirado (double valor) {
		this.valorInvestido -= valor;
	}
	
	public double getValorInvestido() {
		return valorInvestido;
	}
	
	public int getQuantInvestimento() {
		return quantInvestimento;
	}
	
	
}
