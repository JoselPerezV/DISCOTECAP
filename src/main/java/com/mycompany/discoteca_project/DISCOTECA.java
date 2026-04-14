//importacion del proyecto
package com.mycompany.discoteca_project;
import com.murcia.utils.Input;
public class DISCOTECA {
  public static void main(String[] args) {
      //entrada de datos
   COLACLIENTE cola = new COLACLIENTE();
   int cantidad = Input.nextInt("¿Cuántos clientes quieres registrar?");
   for(int i = 0; i<cantidad;i++){
   String nombre = Input.nextLine("Digite el nombre del Cliente: ");
   int visitas = Input.nextInt("Digite el numero de sitas que tiene: ");
   
   CLIENTE cliente = new CLIENTE(nombre, visitas);
   cola.agregarCliente(cliente);
   
   //verificar las recompensasa automaticamente
   cliente.verificarRecompensas();
   } 
   
   
}
}  