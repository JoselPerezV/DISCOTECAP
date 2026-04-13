package com.mycompany.discoteca_project;
import com.murcia.utils.ColaEnlazada;
//clase heredada de cliente y colaenlazada
public class COLACLIENTE extends ColaEnlazada<CLIENTE> {
  public COLACLIENTE() {
        super();
    }

  //Agregar Un cliente a la cola
  public void agregarCliente(CLIENTE cliente){
      encolar(cliente);
      System.out.println("Se agrego a la cola el cliente: "+ cliente.getNombre());
  }
    
}