package edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso {

	private int cantidadHoras;
	
	public IngresoPorHorasExtras(String mesDePercepcion, String concepto, double monto, int cantidadHoras) {
		super(mesDePercepcion, concepto, monto);
		this.cantidadHoras = cantidadHoras;
	}

	@Override
	public double montoImponible() {
		return 0 ;
	}
}
