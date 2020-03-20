/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author Clarissa
 */
public class Farmacia extends Empresa1{
    protected String NumeroIVA;
    protected String Horarios;
    
    public Farmacia(){}

    public Farmacia(String NombreEmpresa, int CantidadEmpleados, int CantidadAños,String NumeroIVA, String Horarios) {
        super(NombreEmpresa, CantidadEmpleados, CantidadAños);
        this.NumeroIVA = NumeroIVA;
        this.Horarios = Horarios;
    }

    public String getNumeroIVA() {
        return NumeroIVA;
    }

    public void setNumeroIVA(String NumeroIVA) {
        this.NumeroIVA = NumeroIVA;
    }

    public String getHorarios() {
        return Horarios;
    }

    public void setHorarios(String Horarios) {
        this.Horarios = Horarios;
    }
}
    
