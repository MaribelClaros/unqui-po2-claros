package edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad  extends Producto {
	
	private int descuento;
	
    public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPartePreciosCuidados, int descuento) {
        super(nombre, precio, esPartePreciosCuidados);
        this.descuento = descuento;
    }
    
    @Override
    public double getPrecio() {
    	return super.getPrecio() - (super.getPrecio() * this.descuento) / 100;
    }
}
