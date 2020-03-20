/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author Clarissa
 */
public class Empleado1{
    protected String DUI;
    protected String Nombre;
    protected int Edad;

    public Empleado1(){}
    public Empleado1(String DUI, String Nombre, int Edad) {
        this.DUI = DUI;
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    

}
