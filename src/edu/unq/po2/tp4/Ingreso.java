package edu.unq.po2.tp4;

public class Ingreso {
	
	private String mesDePercepcion;
	private String concepto;
	private double monto;
	
	
	public String getMesDePercepcion() {
		return mesDePercepcion;
	}
	public String getConcepto() {
		return concepto;
	}
	public double getMonto() {
		return monto;
	}
	
	public double montoImponible() {
		return monto;
	}
	public Ingreso(String mesDePercepcion, String concepto, double monto) {
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.monto = monto;
	}

}
