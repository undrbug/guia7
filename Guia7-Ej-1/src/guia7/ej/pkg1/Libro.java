/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ej.pkg1;

import java.util.Scanner;

/**
 *
 * @author hGauna
 */
public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int n_paginas;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int n_paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.n_paginas = n_paginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getN_paginas() {
        return n_paginas;
    }

    public void setN_paginas(int n_paginas) {
        this.n_paginas = n_paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", n_paginas=" + n_paginas + '}';
    }
    
    public Libro cargarLibro(Libro newBook){
        //Libro newBook = new Libro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los datos del libro");
        System.out.print("ISBN: ");
        newBook.setIsbn(leer.nextInt());
        System.out.print("Titulo: ");
        newBook.setTitulo(leer.next());
        System.out.print("Autor: ");
        newBook.setAutor(leer.next());
        System.out.print("Cantidad de paginas: ");
        newBook.setN_paginas(leer.nextInt());
        return newBook;
    }
    
    public void imprimirLibro(Libro newBook){
        System.out.println(newBook);
    }
    
}
