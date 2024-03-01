package br.com.fintech;

public class Meta {
	private String metaDesejada;
	private double valorMeta;
	private double arrecadado;
	
	
	
	// Implementação dos metodos Getters and Setters
	public String getMetaDesejada() {
		return metaDesejada;
	}
	public void setMetaDesejada(String metaDesejada) {
		this.metaDesejada = metaDesejada;
	}
	public double getValorMeta() {
		return valorMeta;
	}
	public void setValorMeta(double valorMeta) {
		this.valorMeta = valorMeta;
	}
	
	
	//Métodos
	public void depositar (double valor) {
		this.arrecadado += valor;
	}
	
	public void retirar (double valor) {
		this.arrecadado -= valor;
	}
	
	public double getArrecadado() {
		return arrecadado;
	}
	

}
