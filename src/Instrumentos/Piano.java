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
public class Piano extends Instrumento1{
    protected String marca;
    protected String modelo;
    
    public Piano(String nombre, String tipo, String marca, String modelo){
        super(nombre, tipo);
        this.marca=marca;
        this.modelo=modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
