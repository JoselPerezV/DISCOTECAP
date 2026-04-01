
package com.mycompany.discoteca_project;

public class PASAPORTE {
    private String numero;
    private String nombre;
    private String nacionalidad;
    private String fechaExpedicion;
    private String fechaVencimiento;
    
    //constructor
    public PASAPORTE(String numero, String nombre, String nacionalidad,
                     String fechaExpedicion, String fechaVencimiento){
        this.numero = numero;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    
    
  
 
}