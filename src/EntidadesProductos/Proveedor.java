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
public class Proveedor {
    public String Nombre;
    public ArrayList<Proveedor>lProv;
    
    public Proveedor(){}

    public Proveedor(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
