/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos: 
a) Método constructor con todos los atributos pasados por parámetro. listo
b) Metodo constructor sin los atributos pasados por parámetro. listo
c) Métodos get y set. listo
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto. LISTO
e) Método sumar(): calcular la suma de los números y devolver el resultado al main. LISTO
f) Método restar(): calcular la resta de los números y devolver el resultado al main LISTO
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main. 
 */
package guia7.ej.pkg3;

import Entidades.Operacion;

/**
 *
 * @author hGauna
 */
public class Guia7Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion nuevaOperacion = new Operacion().crearOperacion();
        System.out.println("el resultado de la resta es: " + nuevaOperacion.restar());
        System.out.println("el resultado de la suma es: " + nuevaOperacion.sumar());
        if (nuevaOperacion.dividir() != 0) {
            System.out.println("El resltado de la division es: " + nuevaOperacion.dividir());
        }
        if (nuevaOperacion.multiplicar() != 0){
            System.out.println("El resltado de la multiplicacion es: " + nuevaOperacion.multiplicar());
        }
        //System.out.println(variable);
        //System.out.println(variable.restar());
    }
    
}
