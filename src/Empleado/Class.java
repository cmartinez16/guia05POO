/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import javax.swing.JOptionPane;

/**
 *
 * @author Clarissa
 */
public class Class {
     public static void main(String[] args){
         int contador = 0;
         for (int i = 0; i <=0; i++) {
             Presidente presi = new Presidente();
             presi.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del Presidente"));
             presi.setDUI(JOptionPane.showInputDialog("Ingrese el DUI del Presidente "+presi.getNombre()));
             presi.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Presidente "+presi.getNombre())));
             presi.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del Presidente")));
             System.out.print("DATOS DEL PRESIDENTE:\n"
                     + "Nombre: "+presi.getNombre()+"\nDUI: "+presi.getDUI()+"\nEdad: "+presi.getEdad()+"\nSalario: $"+presi.getSalario());
             for (int j = 0; j < 1; j++) {
                 Gerente ger = new Gerente();
                 ger.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del Gerente #"+(i+1)));
                 ger.setDUI("Ingrese el DUI de "+ger.getNombre());
                 ger.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de "+ger.getNombre())));
                 ger.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario de "+ger.getNombre())));
                 System.out.println("DATOS DEL GERENTE #"+(i+1)
                 +"Nombre: "+ger.getNombre()+"\nDUI: "+ger.getDUI()+"\nEdad: "+ger.getEdad()+"\nSalario: $"+ger.getSalario());
                 for (int k = 0; k < 2; k++) {
                     Empleado1 emp = new Empleado1();
                     emp.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del Empleado1 #"+(i+1)));
                     emp.setDUI(JOptionPane.showInputDialog("Ingrese el DUI de "+emp.getNombre()));
                     emp.setEdad(Integer.parseInt("Ingrese la edad de "+emp.getNombre()));
                     System.out.println("DATOS DEL EMPLEADO #"+(i+1)
                     +"Nombre: "+emp.getNombre()+"\nDUI: "+emp.getDUI()+"\nEdad: "+emp.getEdad());
                 }
             }
         }
         
     }
    
}
