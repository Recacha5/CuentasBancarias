/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasbancarias;

import java.util.LinkedList;

/**
 *
 * @author Alex Recacha
 */
public class CuentaCorrienteEmpresa extends CuentaCorriente{
    
    private double interesDescubierto;
    private double maxDescubierto;

    public CuentaCorrienteEmpresa(double interesDescubierto, double maxDescubierto, LinkedList<String> entidades, Persona titular, double saldo, String numCuenta) {
        super(entidades, titular, saldo, numCuenta);
        this.interesDescubierto = interesDescubierto;
        this.maxDescubierto = maxDescubierto;
    }

    /**
     * @return the interesDescubierto
     */
    public double getInteresDescubierto() {
        return interesDescubierto;
    }

    /**
     * @param interesDescubierto the interesDescubierto to set
     */
    public void setInteresDescubierto(double interesDescubierto) {
        this.interesDescubierto = interesDescubierto;
    }

    /**
     * @return the maxDescubierto
     */
    public double getMaxDescubierto() {
        return maxDescubierto;
    }

    /**
     * @param maxDescubierto the maxDescubierto to set
     */
    public void setMaxDescubierto(double maxDescubierto) {
        this.maxDescubierto = maxDescubierto;
    }
    
    
    
}
