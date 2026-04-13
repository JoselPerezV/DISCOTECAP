
package com.mycompany.discoteca_project;
import com.murcia.utils.ListaEnlazada;

public class PILAPREMIO {
    private ListaEnlazada<String> premios;
    //constructor
    public PILAPREMIO(){
    premios = new ListaEnlazada<>() {};
    }
    
    
    //apilar premio
public void apilar (String premio){
premios.addFirst(premio);
}

//Desapilar premio
public String desapilar(){
if (premios.size() == 0){
    System.out.println("No Hay Premios");
    return null;
}
String premio = premios.getFirst();
premios.remove();
return premio;
}
//Mostrar todos los premios
public void mostrarPremios(){
if(premios.size() == 0){
    System.out.println("No hay premios");
    return;
}
    System.out.println("Premios en la pila: ");
    System.out.println(premios.toString());
}

}
