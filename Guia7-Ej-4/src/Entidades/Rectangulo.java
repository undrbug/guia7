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
public class Rectangulo {
    private double base;
    private double altura;

    //Construnctor
    public Rectangulo() {
    }
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    //Setters & getters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
        
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectaungulo");
        double bas = leer.nextDouble();
        System.out.println("Ingrese la altura del rectaungulo");
        double alt = leer.nextDouble();
        return new Rectangulo(bas, alt);        
    }    
    
    public double calcularSup(){
        return this.base * this.altura;
    }
    
    public double calcularPer(){
        return (this.base + this.altura) * 2;
    }
    
    public void dibujaRectangulo(){
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if (i==0 || i==this.altura-1){
                    System.out.print("B");
                } else {
                    if (j==0 || j==this.base-1){
                        System.out.print("A");
                    } else {
                        System.out.print(" ");
                    }
                    

                  
                }
            }
            System.out.println("");
        }
    }
}
