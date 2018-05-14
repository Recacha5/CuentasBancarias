/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import java.util.Scanner;

/**
 *
 * @author Alex Recacha
 */
public class Menu {
    
    public static int menu1(){
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        
        while (opcion<1 || opcion>7) {            
        System.out.println("-------------------------------------------");
        System.out.println("1.- Abrir una nueva cuenta.");
        System.out.println("2.- Ver listado de cuentas.");
        System.out.println("3.- Obtener datos de una cuenta.");
        System.out.println("4.- Realizar un ingreso en una cuenta.");
        System.out.println("5.- Retirar efectivo de una cuenta.");
        System.out.println("6.- Consultar el saldo actual de una cuenta");
        System.out.println("7.- Salir.");
        System.out.println("-------------------------------------------");
        System.out.println("Dime qué quieres hacer...");
        opcion = sc.nextInt();
        }
        return opcion;
    }
    
    public static int menuTipoCuenta(){
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        
        while (opcion<1 || opcion>4) {            
        System.out.println("-------------------------------------------");
        System.out.println("1.- Cuenta de Ahorro.");
        System.out.println("2.- Cuenta Corriente Personal.");
        System.out.println("3.- Cuenta Corriente Empresa.");
        System.out.println("4.- Salir.");
        System.out.println("-------------------------------------------");
        System.out.println("Elige el tipo de cuenta.");
        opcion = sc.nextInt();
        }
        return opcion;
    }
    
}
