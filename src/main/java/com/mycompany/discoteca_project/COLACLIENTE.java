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
    
  //Mostrar clientes en la cola
  public void mostrarCola(){
  if(size() == 0){
      System.out.println("No hay clientes en la cola");
      return;
  }
      System.out.println("Clientes en la cola: ");
      for(int i = 0; i < size();i++){
          CLIENTE cliente = get(i);
          cliente.mostrarCliente();
      }
  }
  //Atender cliente normal
  public CLIENTE atenderCliente(){
  if(size() == 0){
      System.out.println("NO hay cliente en la fila");
      return null;
  }
  CLIENTE atendido = desencolar();
      System.out.println("Cliente atendido: "+atendido.getNombre());
      return atendido;
  }
  
  //Atender primero a clientes VIP
  public CLIENTE atenderClienteVIP(){
  for(int i = 0;i<size();i++){
  CLIENTE cliente = get(i);
  if(cliente.getPasaporte()!=null){
      CLIENTE vip = cliente;
      remove(i);
      System.out.println("Cliente VIP Atendido sin hacer fila: "+vip.getNombre());
      return vip;
  }
  }
      return atenderCliente();
  }
}