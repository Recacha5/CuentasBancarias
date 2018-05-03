/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasbancarias;

/**
 *
 * @author Alex Recacha
 */
public abstract class CuentaBancaria {
    
    protected Persona titular;
    protected double saldo;
    protected String numCuenta;

    public CuentaBancaria(Persona titular, double saldo, String numCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numCuenta = numCuenta;
    }

    /**
     * @return the titular
     */
    public Persona getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the numCuenta
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * @param numCuenta the numCuenta to set
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    
}
