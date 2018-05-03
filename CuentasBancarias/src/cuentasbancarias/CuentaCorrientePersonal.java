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
public class CuentaCorrientePersonal extends CuentaCorriente{
    
    private double comisionMantenimiento;

    public CuentaCorrientePersonal(double comisionMantenimiento, LinkedList<String> entidades, Persona titular, double saldo, String numCuenta) {
        super(entidades, titular, saldo, numCuenta);
        this.comisionMantenimiento = comisionMantenimiento;
    }

    /**
     * @return the comisionMantenimiento
     */
    public double getComisionMantenimiento() {
        return comisionMantenimiento;
    }

    /**
     * @param comisionMantenimiento the comisionMantenimiento to set
     */
    public void setComisionMantenimiento(double comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }
    
    
    
}
