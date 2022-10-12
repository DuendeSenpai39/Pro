/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pro;

/**
 *
 * @author PC-09
 */
public class Pro {

    public static void main(String[] args) {
 var auto1 = new Auto();
        auto1.placa="ABF8592";
        auto1.marca="Chevrolet";
        auto1.nombrePropietario="Jose Garzon";
        
        System.out.println(auto1.mostrarInfo()+" el país de origen de la"
                + " marca es "+auto1.getPaisMarca());
        
        var auto2 = new Auto();
        auto2.placa="ADX0422";
        auto2.marca="Toyota";
        auto2.nombrePropietario="Maria Soledad";
        
        System.out.println(auto2.mostrarInfo()+" el país de origen de"
                + " la marca es "+auto2.getPaisMarca());
        
        
        var auto3 = new Auto();
        auto3.placa="ABH0025";
        auto3.marca="Jetour";
        auto3.nombrePropietario="Ulises de la Cruz";
        
        System.out.println(auto3.mostrarInfo()+" el país de origen de"
                + " la marca es "+auto3.getPaisMarca());
       
        var auto4 = new Auto();
        auto4.placa="ABH0025";
        auto4.marca="Mercedes Benz";
        auto4.nombrePropietario="Daniel Torres";
        
        System.out.println(auto4.mostrarInfo()+" el país de origen de"
                + " la marca es "+auto4.getPaisMarca());
     
        
  
    }
}
