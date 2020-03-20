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
public class Restaurante extends Empresa1{
    protected String NumeroIVA;
    protected String Ubicacion;
    protected String TipoRestaurant;
    
    public Restaurante(){}

    public Restaurante(String NumeroIVA, String Ubicacion, String TipoRestaurant, String NombreEmpresa, int CantidadEmpleados, int CantidadAños) {
        super(NombreEmpresa, CantidadEmpleados, CantidadAños);
        this.NumeroIVA = NumeroIVA;
        this.Ubicacion = Ubicacion;
        this.TipoRestaurant = TipoRestaurant;
    }

    public String getNumeroIVA() {
        return NumeroIVA;
    }

    public void setNumeroIVA(String NumeroIVA) {
        this.NumeroIVA = NumeroIVA;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getTipoRestaurant() {
        return TipoRestaurant;
    }

    public void setTipoRestaurant(String TipoRestaurant) {
        this.TipoRestaurant = TipoRestaurant;
    }
    
}