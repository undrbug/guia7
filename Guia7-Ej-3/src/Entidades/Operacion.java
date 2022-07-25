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
public class Operacion {
    private double numero1;
    private double numero2;

    //CONSTRUNCTORES
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    //GETTERS Y SETTERS
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double num2 = leer.nextDouble();
        return new Operacion(num1, num2);
    }
    
    public double restar(){
        return this.numero1 - this.numero2;
    }

    public double sumar(){
        return this.numero1 + this.numero2;
    }
    
    public double dividir(){
        if (this.numero2 == 0 || this.numero1 == 0){
           System.out.println("Esta intentando dividir un numero por CERO");
           return 0;
        } else {
            return this.numero1 / this.numero2;
        }         
    }
    
    public double multiplicar(){
        if (this.numero2 == 0 || this.numero1 == 0){
           System.out.println("Esta intentando dividir un numero por CERO");
           return 0;
        } else {
            return this.numero1 / this.numero2;
        }         
    }
}


