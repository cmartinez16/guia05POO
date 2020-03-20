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
public class Empresa1 {
    protected String NombreEmpresa;
    protected int CantidadEmpleados;
    protected int CantidadAños;
    
    public Empresa1(){}

    public Empresa1(String NombreEmpresa, int CantidadEmpleados, int CantidadAños) {
        this.NombreEmpresa = NombreEmpresa;
        this.CantidadEmpleados = CantidadEmpleados;
        this.CantidadAños = CantidadAños;
    }

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setNombreEmpresa(String NombreEmpresa) {
        this.NombreEmpresa = NombreEmpresa;
    }

    public int getCantidadEmpleados() {
        return CantidadEmpleados;
    }

    public void setCantidadEmpleados(int CantidadEmpleados) {
        this.CantidadEmpleados = CantidadEmpleados;
    }

    public int getCantidadAños() {
        return CantidadAños;
    }

    public void setCantidadAños(int CantidadAños) {
        this.CantidadAños = CantidadAños;
    }
    
    
}
