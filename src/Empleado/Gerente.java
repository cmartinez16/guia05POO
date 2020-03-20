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
public class Gerente extends Empleado1{
    protected String Cargo;
    protected double Salario;
    
    public Gerente(){}
    public Gerente(String dui, String nombre, int edad, String cargo, double salario){
        super(dui, nombre, edad);
        this.Cargo=cargo;
        this.Salario=salario;
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
