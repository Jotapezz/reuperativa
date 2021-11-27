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
public class NoAlcoholica extends Bebestible{
    String light;
    String gas;

    public NoAlcoholica() {
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }
        public void listar (List<NoAlcoholica> noAlcoholicList){
        for (NoAlcoholica noAlcoholica : noAlcoholicList){
            System.out.println("Nombre:\t\t" + noAlcoholica.getNombre());
            System.out.println("Proveedor:\t" + noAlcoholica.getProveedor());
            System.out.println("Precio:\t\t" + noAlcoholica.getPrecio());
            System.out.println("Cantidad:\t" + noAlcoholica.getCantidad());
            System.out.println("Categoría:\t" + noAlcoholica.getLight());
            System.out.println("Gasficada:\t" + noAlcoholica.getGas());
        }
        }
        public void contar (List<NoAlcoholica> noAlcoholicList){
        for (NoAlcoholica noAlcoholica : noAlcoholicList){
            System.out.println("Nombre:\t\t" + noAlcoholica.getNombre());
            System.out.println("Cantidad:\t" + noAlcoholica.getCantidad());

        }
        }

     
    @Override
    public void listarBebestible(int cantidad){
        System.out.println(cantidad);
    }
   
    public void listadoBebNoAlcohol (List<NoAlcoholica> noAlcoholList){
        int cantNoAlcohol = 0;
        for (NoAlcoholica noAlcoholica: noAlcoholList){
            System.out.println("Cantidad de Bebidas no alcoholicas: " + noAlcoholica.getCantidad());
            cantNoAlcohol = cantidad++;
            
        }

    }

       
}
