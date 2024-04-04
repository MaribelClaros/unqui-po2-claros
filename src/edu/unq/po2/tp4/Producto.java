package edu.unq.po2.tp4;

public class Producto {
    private String nombre;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean esPrecioCuidado() {
        return esPartePreciosCuidados;
    }

    private boolean esPartePreciosCuidados;

    public Producto(String nombre, double precio, boolean esPartePreciosCuidados) {
        this.nombre = nombre;
        this.precio = precio;
        this.esPartePreciosCuidados = esPartePreciosCuidados;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.esPartePreciosCuidados = false;
    }
    
    public void aumentarPrecio(double cantAAumentar) {
    	precio += cantAAumentar;
    }
}
