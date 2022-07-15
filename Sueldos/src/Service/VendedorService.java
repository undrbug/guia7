/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class VendedorService {
    
    public Vendedor altaVendedor(){
        
        //Instanciar un objeto de tipo vendedor
        Vendedor v1 = new Vendedor(); //cuando instanciamos un objeto de la clase vendedor estamos usando el constructor vacio o por defecto en la entidad
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //cargamos los atributos
        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(leer.next());
        System.out.println("Ingrese el DNI del vendedor");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese el monto del sueldo basico");
        v1.setSueldoBasico(leer.nextDouble());
        //System.out.println("Ingrese el monto de las comisiones");
        //v1.setComisiones(leer.nextDouble());
        //v1.setSueldoMensual(v1.getSueldoBasico()+v1.getComisiones());
        System.out.println("Ingrese el dia que comenzo a trabajar, solo numeros");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes en que comenzo a trabajar, solo numeros");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año en que comenzo a trabajar, solo numeros");
        int anio = leer.nextInt();
        Date fecha = new Date(anio-1900,mes-1,dia);
        v1.setFechaInicio(fecha);
        return v1;       
    }
    
    public void suedoMensual(Vendedor v1){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese las ventas totales del vendedor");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldoMensual(v1.getSueldoBasico()+v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor: " + v1.getNombre() + " es de $" + v1.getSueldoMensual());
    }
    
    public void vacaciones(Vendedor v1) {
        
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        
        if (antiguedad < 5){
            System.out.println("Le corresponden 15 dias de vacaciones");
        } else if (antiguedad < 10) {
            System.out.println("Le corresponden 21 dias de vacaiones");
        } else if (antiguedad <20) {
            System.out.println("Le corresponden 28 dias de vacaiones");
        } else if (antiguedad > 20) {
            System.out.println("Le corresponden 35 dias");
        } else {
            System.out.println("Tiene vacaciones proporcionales");
        }
    }
}
