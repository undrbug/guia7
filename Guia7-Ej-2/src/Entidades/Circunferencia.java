/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author hGauna
 */
public class Circunferencia {
    private double radio;
    private double pi = 3.1415;
    
    
    //constructor
    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    //Getter and setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //metodo crear circunferencia
    public Circunferencia crearCricunferencia(){
        //Scanner leer = new Scanner(System.in);
        //System.out.println("Ingrese el radio");
        //double radio = leer.nextDouble();
        return new Circunferencia(radio);
    }
    
    //metodo Area
    public double area(){
 
        return this.pi*(this.radio*this.radio);
    }
    
    //metodo perimetro 
    public double perimetro(){
        return 2* this.pi * this.radio;
    }
}
