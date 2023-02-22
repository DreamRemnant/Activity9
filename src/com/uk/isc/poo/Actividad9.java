/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.uk.isc.poo;

/**
 *
 * @author jfmg6
 */
public class Actividad9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria(41520052, "Susana", 10000);
        System.out.printf("Nombre del Cliente: %s\nSaldo: %d\n\n", c1.getNombreCliente(), c1.getSaldo());
        c1.setNombreCliente("Alfredo");
        c1.setSaldo(5000);
        System.out.printf("Nombre del Cliente: %s\nSaldo: %d\n\n", c1.getNombreCliente(), c1.getSaldo());
    }
    
}
