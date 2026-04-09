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
    //metodos GETTERS y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    public boolean isTienePasaporte() {
        return tienePasaporte;
    }

    public void setTienePasaporte(boolean tienePasaporte) {
        this.tienePasaporte = tienePasaporte;
    }

    public CLIENTE getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(CLIENTE siguiente) {
        this.siguiente = siguiente;
    }
   
    //metodos Importantes
    public void registrarVisita(){
    visitas++;
    }
    
    public boolean esFrecuente(){
    return visitas >= 15;// numero de visitas necesarias para considerar frecuente.
    }
    
    public void asignarPasaporte(){
    if(esFrecuente()){
        tienePasaporte = true;
        System.out.println("Se asigno pasaporte a " + nombre);
    }else {
        System.out.println(nombre+"Aun no es cliente frecuente.");
    }
    }
    public void mostrarCliente(){
        System.out.println((tienePasaporte ? "Si" :"No" )+"Cliente: "+nombre+"| Visitas: "+visitas+  "| Pasaporte: ");
    }

}
    