/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp.entidades;

/**
 *
 * @author hGauna
 */
public class Mascota {
    
    //con public se podia tener acceso desde variable.nombre, variable.apodo etc...
//    public String nombre;
//    public String apodo;
//    //Conejo, Gato, Perro, Loro, Carpincho
//    public String tipo;
//    public String color;
//    public int edad;
//    public boolean cola;
//    public String raza;
    
    //Ahora con private si o si se hace uso de setters
    private String nombre;
    private String apodo;
    //Conejo, Gato, Perro, Loro, Carpincho
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    private int energia;
    //creamos el constructor 
    
    
    
    public Mascota() { //no recibe nada
        energia = 1000;
    }
    
    public Mascota(String nombre, String apodo, String tipo){ //algunos atributos
        this.nombre = nombre;
        this.apodo = apodo;
        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo") || tipo.equals("Carpincho")){
            this.tipo = tipo;
        }
            this.energia = 1000;        
        
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) { //todos los atributos
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }
    
    public void setNombre(String nombre){ //set es un metodo pero usamos camelCase 
        this.nombre = nombre;               //Los setters pueden tener logica 
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }
    
    public int pasear(int energiaRestar){
        energia -= energiaRestar;
        return energia;
    }
    //Se denomina sobreCarga cuando un mismo metodo o funcion recibe distinta cantidad de parametros
    /**
     * SobreCarga de pasear. 
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energiaRestar, int vueltas){
        energia -= energiaRestar * vueltas;
        return energia;
    }
    

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
    
    
    
    
}
