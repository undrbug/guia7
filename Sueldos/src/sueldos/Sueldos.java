/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldos;

import Entidades.Vendedor;
import Service.VendedorService;

/**
 *
 * @author hGauna
 */
public class Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciamos un objeto del tipo Service para pode acceder
        VendedorService vs = new VendedorService();
        Vendedor v1 = vs.altaVendedor();
        vs.suedoMensual(v1);
        vs.vacaciones(v1);
    }
    
}
