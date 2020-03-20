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
public class Instrumento1 {
    protected String Nombre;
    protected String Tipo;

    public Instrumento1(String Nombre, String Tipo) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTipo() {
        return Tipo;
    }
    
    
}
