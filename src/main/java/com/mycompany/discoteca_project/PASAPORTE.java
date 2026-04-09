
package com.mycompany.discoteca_project;

public class PASAPORTE {
    
 //atributos de la clase
  private String numero;
  private String nombre;
  private String nacionalidad;
  private String fechaExpedicion;
  private String fechaVencimiento;
  
  //constructor MODIFICADo
  public PASAPORTE(String numero, String nombre, String nacionalidad,String fechaExpedicion,String fechaVencimiento ){
  this.numero = numero;
  this.nombre = nombre;
  this.nacionalidad=nacionalidad;
  this.fechaExpedicion= fechaExpedicion;
  this.fechaVencimiento= fechaVencimiento;
  }
  
  
}