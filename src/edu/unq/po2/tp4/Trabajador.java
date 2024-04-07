package edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	public double getTotalPercibido() {
		double sum = 0;
	    for (Ingreso i: ingresos) {
	        sum += i.getMonto();
	    }
		return sum;
	}
	
	public double getMontoImponible() {
		double sum = 0;
	    for (Ingreso i: ingresos) {
	        sum += i.montoImponible();
	    }
		return sum;
	}

	public Trabajador(List<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}

}
