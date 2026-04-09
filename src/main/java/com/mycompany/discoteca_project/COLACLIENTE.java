package com.mycompany.discoteca_project;
import com.murcia.utils.ColaEnlazada;

public class COLACLIENTE extends ColaEnlazada<CLIENTE> {
    //Constructor
    public COLACLIENTE(){
    super ();// llama al constructor de ColaEnlazada
    } 
    
    //Mostrar todos los clientes en la cola
    public void mostrarCola(){
        System.out.println("Clientes en la cola: ");
    for(int i = 0; i<size(); i++){
        CLIENTE cliente = get(i);
        System.out.println("-"+cliente.getNombre()+"|Visitas: "+cliente.getVisitas());
    }
    if(size() == 0){
        System.out.println("No hay clientes en la cola.");
    }
    }
 
    //atiende (desencola) al primer cliente
    public CLIENTE atenderCliente(){
    if(size() == 0){
        System.out.println("No hay clientes en la cola.");
        return null;
    }
    CLIENTE atendido = desencolar();
        System.out.println("Cliente atendido"+ atendido.getNombre());
    return atendido;
    }
    
}
