/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos: 
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (area = pi*(radio*radio))
).
e) Método perimetro(): para calcular el perímetro (perimetro = 2 ∗ pi ∗ radio). 
 */
package guia7.ej.pkg2;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Guia7Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        double radio = leer.nextDouble();
        Circunferencia variable = new Circunferencia(radio);
        System.out.println(variable.crearCricunferencia());
        System.out.println(variable.perimetro());
        System.out.println(variable.area());
    }
}
