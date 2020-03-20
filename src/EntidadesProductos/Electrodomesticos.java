/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesProductos;

import java.util.ArrayList;

/**
 *
 * @author Clarissa
 */
public class Electrodomesticos {
     public int Cantidad;
    public double Precio;
    public ArrayList<Electrodomesticos>lElec;
    
    public Electrodomesticos(){}

    public Electrodomesticos(int Cantidad, double Precio) {
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }
    
}
