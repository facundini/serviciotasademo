package com.facundo.ws.rest;

public class Consulta {

	public static final double TASA_SQUA = 2.1;
	public static final double TASA_SCO = 2.0;
	public static final double TASA_PERE = 0.9;

	
	private double importe;
	private double tasa;
	private String marca;
	
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getTasa() {
		return tasa;
	}
	public void setTasa(double tasa) {
		this.tasa = tasa;
	}
	
	
	
}
