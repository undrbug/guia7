/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private int saldoActual;
    private double interes;

    public Cuenta() {
    }
    
    public Cuenta(int numeroCuenta, long dniCliente, int saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public Cuenta crearCuenta(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el numero de DNI del cliente");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese el saldo actual");
        int saldoActual = leer.nextInt();
        double interes = 0;
        return new Cuenta(numeroCuenta, dniCliente, saldoActual, interes);
    }
    
    public void ingresarDinero(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto que desea depositar");
        this.setSaldoActual(saldoActual + leer.nextInt());
    }
    
    public void retirarDinero(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto que desea retirar");
        int montoRetirar = leer.nextInt();
        if (this.saldoActual < montoRetirar){
            this.setSaldoActual(0);
        } else {
            this.setSaldoActual(saldoActual-montoRetirar);
        }
    }
    
    public void extraccionRapida(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto que desea retirar");
        int montoRetirar = leer.nextInt();
        if (montoRetirar < ((this.saldoActual*20)/100) ){
            this.setSaldoActual(saldoActual-montoRetirar);
        }else{
            System.out.println("Solo se puede retirar un 20% del saldo actual");
        }
    }
    
    public void consultarSaldo(){
        System.out.println("El saldo de la cuenta es: " + this.getSaldoActual());
    }
    public void consultarDatos(){
        System.out.println("El numero de cuenta es: " + this.getNumeroCuenta());
        System.out.println("Pertenecae a: " + this.getDniCliente());
        System.out.println("El saldo de la cuenta es: " + this.getSaldoActual());
    }
}
