//importacion del proyecto
package com.mycompany.discoteca_project;
import com.murcia.utils.Input;
public class DISCOTECA {
  public static void main(String[] args) {
      //entrada de datos
   COLACLIENTE cola = new COLACLIENTE();
   int cantidad = Input.nextInt("¿Cuántos clientes quieres registrar?");
   for(int i = 0; i<cantidad;i++){
   String nombre = Input.nextLine("\nDigite el nombre del Cliente:");
   int visitas = Input.nextInt("Digite el numero de sitas que tiene:");
   
   CLIENTE cliente = new CLIENTE(nombre, visitas);
   cola.agregarCliente(cliente);
   
   //verificar las recompensasa automaticamente
   cliente.verificarRecompensas();
   } 

      System.out.println("\n Estado inicial de clientes");   
      cola.mostrarCola();
      
      //simular un evento especial en la discoteca
      DISCOTECAEVENT evento = new DISCOTECAEVENT("Noche Reggaeton","26-04-2024", 2, "Entrada VIP doble");
      System.out.println("\n Evento Activo  ");
      evento.mostrarEvento();
      
      //Aplicar bonus del evento a todos los clientes 
      System.out.println("\n Aplicando Bonus del evento ");
      for(int i = 0; i< cola.size();i++){
          CLIENTE cliente = cola.get(i);
          evento.aplicarBonus(cliente);
      
      }
      
      // pila de premios
      PILAPREMIO pila = new PILAPREMIO();
      pila.apilar("Botella de Aguardiente");
      pila.apilar("Canasta de Cerveza");
      pila.apilar("Entrada VIP Doble");
      System.out.println("\n Premios disponibles");
      pila.mostrarPremios();
    
      //Para que atiendan primero al cliente VIP
      System.out.println("\n Atendiendo a un cliente ");
      CLIENTE atendido= cola.atenderClienteVIP();
      if(atendido !=null && !pila.estaVacia()){
          String premio = pila.desapilar();
          System.out.println("Cliente "+ atendido.getNombre() + "Recibio: "+premio);
          System.out.println("\n Estado final de los clientes ");
          cola.mostrarCola();
          
          System.out.println("\n Premios restanes ");
          pila.mostrarPremios();
      
      }
   
}
}  