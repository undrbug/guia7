/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes. 
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package guia7.ej.pkg4;

import Entidades.Rectangulo;

/**
 *
 * @author hGauna
 */
public class Guia7Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo newRect = new Rectangulo().crearRectangulo();
        System.out.println(newRect);
        System.out.println(newRect.calcularPer());
        System.out.println(newRect.calcularSup());
        newRect.dibujaRectangulo();
        }
}
