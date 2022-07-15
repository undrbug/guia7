/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;
import mascotaapp.entidades.Usuario;
import mascotaapp.service.ServiceMascota;

/**
 *
 * @author hGauna
 */
//la clase MascotaApp que contiene el metodo main
public class MascotaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        //Scanner leer = new Scanner(System.in).useDelimiter("\n");        
        
        // declaramos un objeto del tipo mascota
        //Mascota mascota; 
        //Instanciamos un objeto
        //new Mascota(nombre, apodo, tipo, color, 0, true, raza)
        
        //con la creacion del servicio damos vida a una mascota de otra forma
        //Mascota mascotita = new Mascota(leer.next(), leer.next(), leer.next(), leer.next(), leer.nextInt(), leer.nextBoolean() , leer.next());
        //Usuario user = new Usuario();
        
//      mascotita.apodo = "Chiquito";
//      mascotita.apodo = leer.nextLine();
//      mascotita.nombre = "Fernando Chiquito";
//      mascotita.tipo = "Perro";
//      mascotita.edad = 14;
//      mascotita.raza = "Beagle";
//      mascotita.cola = true;
//      mascotita.color = "Tricolor";

        ServiceMascota servicem = new ServiceMascota();
        Mascota mascotita = servicem.crearMascota();
        System.out.println(mascotita);
        mascotita.pasear(150);
        //System.out.println(mascotita.nombre + " " + mascotita.apodo + " " + mascotita.tipo + " " + mascotita.color + " " + mascotita.edad + " " + mascotita.cola + " " + mascotita.raza);
        System.out.println(mascotita);
}

}
