package br.com.fintech;

public class Gasto {
	private String tipoGasto;
	private double vlGasto;
	
	
	// Implementação dos metodos Getters and Setters
	public String getTipoGasto() {
		return tipoGasto;
	}
	public void setTipoGasto(String tipoGasto) {
		this.tipoGasto = tipoGasto;
	}
	
	//Métodos
	public void saida (double valor) {
		this.vlGasto += valor;
	}
	
	public double getVlGasto() {
		return vlGasto;
	}
	
}
