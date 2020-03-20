/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instrumentos;

/**
 *
 * @author Clarissa
 */
public class Class {
     public static void main(String[] args){
        Guitarra g1 = new Guitarra("Guitarra", "Cuerda", "Gibson", "LesPaul");
        System.out.print("Nombre: "+g1.Nombre
        +"\nTipo: "+g1.Tipo+"\nMarca: "+g1.Marca+"\nModelo: "+g1.Modelo);
        System.out.println("");
        Piano p1 = new Piano("Piano", "Cuerdas", "Steinway & Sons", "");
        System.out.print("Nombre: "+p1.Nombre
        +"\nTipo: "+p1.Tipo+"\nMarca: "+p1.marca+"\nModelo: "+p1.modelo);
        System.out.println("");
        Trompeta t1 = new Trompeta("Trompeta", "Viento", "");
        System.out.print("Nombre: "+t1.Nombre
        +"\nTipo: "+t1.Tipo+"\nMarca: "+t1.marca);
    }
    
}
