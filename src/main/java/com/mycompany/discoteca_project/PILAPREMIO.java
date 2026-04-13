
package com.mycompany.discoteca_project;
import com.murcia.utils.ListaEnlazada;

public class PILAPREMIO {
  private ListaEnlazada<String> premios;
  public PILAPREMIO(){
  premios = new ListaEnlazada<>() {};
  }

  //apilar premio
  public void apilar (String premio){
  premios.addFirst(premio);
  }
  
  //Desapilar premio
  public String desapilar(){
  if(premios.size()==0){
      System.out.println("No hay premios en la pila");
      return null;
  }
  String premio = premios.getFirst();
  premios.remove();
  return premio;
  }
  
  
}
