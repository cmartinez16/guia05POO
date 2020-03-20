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
public class Trompeta extends Instrumento1{
    protected String marca;
    
    public Trompeta(String nombre, String tipo, String marca){
        super(nombre, tipo);
        this.marca=marca;
    }

    public String getMarca() {
        return marca;
    }
}