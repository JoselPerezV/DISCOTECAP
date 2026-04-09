//clase modificada por Andres
package com.mycompany.discoteca_project;

public class CLIENTE {
    private String nombre;
    private int visitas;
    private boolean tienePasaporte;
    public CLIENTE siguiente;//referencia al siguiente cliente 
    
    //constructor 
    public CLIENTE(String nombre, int visitas){
    this.nombre = nombre;
    this.visitas = visitas;
    this.tienePasaporte = false;
    this.siguiente = null;
    }
    
    

}
    