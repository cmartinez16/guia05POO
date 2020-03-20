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
public class Guitarra extends Instrumento1{
    
    protected String Marca;
    protected String Modelo;
    
    public Guitarra(String nombre, String tipo, String marca, String modelo ){
       super(nombre, tipo);
       this.Marca=marca;
       this.Modelo=modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }
    
}
