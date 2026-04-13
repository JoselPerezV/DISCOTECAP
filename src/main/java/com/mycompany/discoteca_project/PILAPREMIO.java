
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

}
