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
public class CuentaAhorro extends CuentaBancaria{
    
    private double tipoInteres;

    public CuentaAhorro(double tipoInteres, Persona titular, double saldo, String numCuenta) {
        super(titular, saldo, numCuenta);
        this.tipoInteres = tipoInteres;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    @Override
    public void imprimirDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
