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
public abstract class CuentaCorriente extends CuentaBancaria{
    
    private LinkedList<String> entidades;

    public CuentaCorriente(LinkedList<String> entidades, Persona titular, double saldo, String numCuenta) {
        super(titular, saldo, numCuenta);
        this.entidades = new LinkedList<>();
    }

    /**
     * @return the entidades
     */
    public LinkedList<String> getEntidades() {
        return entidades;
    }

    /**
     * @param entidades the entidades to set
     */
    public void setEntidades(LinkedList<String> entidades) {
        this.entidades = entidades;
    }
    
    
    
}
