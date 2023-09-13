
package com.emergentes.modelo;

/**
 *
 * @author MARQUEZ
 */
public class Producto {
    private int id;
    private String Descripcion;
    private int cantidad;
    private double precio;
    private String Categoria;

    public Producto() {
        this.id = 0;
        this.Descripcion="";
        this.cantidad=0;
        this.precio=0;
        this.Categoria="";
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    
    
}
