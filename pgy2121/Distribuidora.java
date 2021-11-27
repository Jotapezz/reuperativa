/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;

import cl.duoc.pgy2121.distribuidora.businessImp.DistribuidoraBusinessImp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JP
 */
public class Distribuidora {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        List<NoAlcoholica> noAlcoholList = new ArrayList<NoAlcoholica>();
        List<Alcoholica> alcoholList = new ArrayList<Alcoholica>();
      /*CREACION DE PRODUCTOS Y STOCK*/
      
     /* NoAlcoholica bebida1 = new NoAlcoholica();
      bebida1.nombre = "Papaya";
      bebida1.proveedor = "BubiCo";
      bebida1.precio = 1550;
      bebida1.cantidad = 5;
      bebida1.light = "con azucar";
      bebida1.gas = "gasificada";
      noAlcoholList.add(bebida1);
      
      Alcoholica pisco1 = new Alcoholica();
      pisco1.nombre = "Uyuy";
      pisco1.proveedor = "Cholito S.A.";
      pisco1.precio = 9990;
      pisco1.cantidad = 10;
      pisco1.gradoAlcohol = (float) 30.5;
      alcoholList.add(pisco1);*/

        
        /*Menú*/
        
    int opcion = 0;
    while (opcion != 9){
        System.out.println("==================================================\nBienvenido a distribuidora Le~Ciel\n");
        System.out.println("1.- Realizar una Compra");
        System.out.println("2.- Ver carrito de compras");
        System.out.println("3.- Ver cantidad y tipos de bebestibles");
        System.out.println("4.- Total a pagar"); 
        System.out.println("9.- Salir");
        System.out.println("==================================================");
        opcion = s.nextInt();       
        s.nextLine();    
        
        if (opcion == 1){
            System.out.println ("Qué tipo de bebida desea comprar?\n1. Alcoholica \n2. Gaseosa\n");
            int opcionBebida = s.nextInt();
            s.nextLine();
            
            if (opcionBebida == 1){
                System.out.println("***Beba con moderación***\n");
                System.out.println("1. Pisco\n2. Whisky");
                int opcionLicor = s.nextInt();
                
                if (opcionLicor == 1){
                    Alcoholica pisco1 = new Alcoholica();
                    pisco1.nombre = "Uyuy";
                    pisco1.proveedor = "Cholito S.A.";
                    pisco1.precio = 9990;
                    pisco1.cantidad = 1;
                    pisco1.gradoAlcohol = (float) 30.5;
                    alcoholList.add(pisco1);
                }       
                if (opcionLicor == 2){
                    Alcoholica whisky1 = new Alcoholica();
                    whisky1.nombre = "Mr.Burbon";
                    whisky1.proveedor = "Whithexican";
                    whisky1.precio = 21990;
                    whisky1.cantidad = 1;
                    whisky1.gradoAlcohol = (float) 45;
                    alcoholList.add(whisky1);
                }
                if (opcionLicor != 1 && opcionLicor != 2){
                    System.out.println ("Opción no disponible\nIntentelo nuevamente");
                        }
            }   
            if (opcionBebida == 2){
                    System.out.println("1. Bebida\n2. Jugo");
                    int opcionGaseosa = s.nextInt();

                    if (opcionGaseosa == 1){
                        NoAlcoholica bebida1 = new NoAlcoholica();
                        bebida1.nombre = "Papaya";
                        bebida1.proveedor = "BubiCo";
                        bebida1.precio = 1550;
                        bebida1.cantidad = 1;
                        bebida1.light = "con azucar";
                        bebida1.gas = "gasificada";
                        noAlcoholList.add(bebida1);}
                
                    if(opcionGaseosa == 2){
                        NoAlcoholica jugo1 = new NoAlcoholica();
                        jugo1.nombre = "Hanna Manzana";
                        jugo1.proveedor = "ColaLoca S.A.";
                        jugo1.precio = 2500;
                        jugo1.cantidad = 1;
                        jugo1.light = "con azucar";
                        jugo1.gas = "sin gas";
                        noAlcoholList.add(jugo1);}
                    if(opcionGaseosa !=1 && opcionGaseosa!=2){
                        System.out.println ("Opción no disponible\nIntentelo nuevamente");
                        }
                
            }
            if (opcionBebida != 1 && opcionBebida != 2){
                System.out.println ("Opción no disponible\nIntentelo nuevamente");
            }
        }
        if (opcion == 2){
            System.out.println ("==================================================\nUsted ha seleccionado: \n");
                    
                    NoAlcoholica bebida1 = new NoAlcoholica ();
                    bebida1.listar(noAlcoholList);

                    Alcoholica pisco1 = new Alcoholica ();
                    pisco1.listar(alcoholList);}   
        
        if (opcion == 3){
            System.out.println ("==================================================\nUsted ha seleccionado: \n");
                    
                    NoAlcoholica bebida1 = new NoAlcoholica ();
                    bebida1.contar(noAlcoholList);

                    Alcoholica pisco1 = new Alcoholica ();
                    pisco1.contar(alcoholList);}   

            }
        if (opcion == 4){
            int impto = 0;
            DistribuidoraBusinessImp ObtenerIva = new DistribuidoraBusinessImp();
            for (Alcoholica pisco1 : alcoholList){
                System.out.println("IVA:\t" + impto  * 0.19);
        }
        }
    }
    
}
                
        
       
        
    

    
