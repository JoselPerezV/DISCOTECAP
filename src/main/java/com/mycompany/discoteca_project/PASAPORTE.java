
package com.mycompany.discoteca_project;

public class PASAPORTE {
    
 //atributos de la clase
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
  
    //mostrar informacion del pasaporte
    public void mostrarInfo(){
        System.out.println("Pasaporte #: "+ numero);
        System.out.println("Titular: "+nombre);
        System.out.println("Nacionalidad: "+ nacionalidad);
        System.out.println("Expedido: "+fechaExpedicion);
        System.out.println("Vence: "+fechaVencimiento);
    }
  //verificar si esta vigente   
public boolean estaVigente(String fechaActual){
return fechaActual.compareTo(fechaVencimiento) <= 0; 
}
}