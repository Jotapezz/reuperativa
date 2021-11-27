/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;

import java.util.List;

/**
 *
 * @author JP
 */
public class Alcoholica extends Bebestible{
    float gradoAlcohol;

    public Alcoholica(float gradoAlcohol, String nombre, String proveedor, int precio, int cantidad) {
        super(nombre, proveedor, precio, cantidad);
        this.gradoAlcohol = gradoAlcohol;
    }

    public Alcoholica(float gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }

    public Alcoholica() {
    }

    public float getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(float gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }
        public void listar (List<Alcoholica> AlcoholList){
        for (Alcoholica alcoholica : AlcoholList){
            System.out.println("Nombre:\t\t" + alcoholica.getNombre());
            System.out.println("Proveedor:\t" + alcoholica.getProveedor());
            System.out.println("Precio:\t\t" + alcoholica.getPrecio());
            System.out.println("Cantidad:\t" + alcoholica.getCantidad());
            System.out.println("Graduación Alcoholica: " + alcoholica.getGradoAlcohol());
            }
        }
        public void contar (List<Alcoholica> AlcoholList){
        for (Alcoholica alcoholica : AlcoholList){
            System.out.println("Nombre:\t\t" + alcoholica.getNombre());
            System.out.println("Cantidad:\t" + alcoholica.getCantidad());
        }
                }
        
    @Override
    public void listarBebestible(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void listadoBebAlcohol (List<Alcoholica> alcoholList){
        int cantAlcohol = 0;
        for (Alcoholica alcoholica: alcoholList){
            System.out.println("Cantidad de Bebidas no alcoholicas: " + alcoholica.getCantidad());
            cantAlcohol = cantidad++;
    
        }
    }

}
