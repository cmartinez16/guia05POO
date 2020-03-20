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
public class Presidente extends Empleado1{
    protected String Cargo;
    protected double Salario;
    
    public Presidente(){}
    public Presidente(String dui, String Nombre, int Edad, String Cargo, double Salario){
        super(dui, Nombre, Edad);
        this.Cargo=Cargo;
        this.Salario=Salario;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
}
