/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp.service;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;

/**
 *
 * @author hGauna
 */
public class ServiceMascota {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Mascota crearMascota() {

        System.out.println("Ingresar nombre:");
        String nombre = leer.next();
        System.out.println("Ingresar apodo:");
        String apodo = leer.next();
        System.out.println("Ingresar tipo:");
        String tipo = leer.next();
        return new Mascota(nombre, apodo, tipo);
    }

}
