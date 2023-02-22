/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uk.isc.poo;

/**
 *
 * @author jfmg6
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private String nombreCliente;
    private int saldo;
    
    public CuentaBancaria(int numeroDeCuenta, String nombreDelCliente, int saldo) {
        numeroCuenta = numeroDeCuenta;
        nombreCliente = nombreDelCliente;
        this.saldo = saldo;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
}
