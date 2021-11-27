/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;

/**
 *
 * @author JP
 */
public abstract class Bebestible {
    protected String nombre;
    protected String proveedor;
    protected int precio;
    protected int cantidad;
    
    public Bebestible(String nombre, String proveedor, int precio, int cantidad) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Bebestible() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNumRef(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String registroBebestible(){
        return "Bebesible[nombre: "+ nombre + "proveedor: "+ proveedor + "precio: "+ precio + "Cantidad: "+ cantidad +"]";
    }
    public abstract void listarBebestible (int cantidad);

}
