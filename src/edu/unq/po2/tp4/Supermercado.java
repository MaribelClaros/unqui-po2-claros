package edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    public Supermercado(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    private String nombre;
    private String direccion;
    private List<Producto> productos = new ArrayList<Producto>();


    public List<Producto> getProductos() {
        return productos;
    }

    public int getCantidadDeProductos() {
    	return getProductos().size();
    }
    
    public void agregarProducto(Producto productoAAgregar) {
        productos.add(productoAAgregar);
    }
    
    public double getPrecioTotal() {
    	double sum = 0;
        for (int i = 0; i < getProductos().size(); i++) { // loop through the list
           sum += productos.get(i).getPrecio(); // add the current element to the sum
        }
        return sum;
    }
}
