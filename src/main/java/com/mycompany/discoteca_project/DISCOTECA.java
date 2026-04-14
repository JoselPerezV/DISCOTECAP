//importacion del proyecto
package com.mycompany.discoteca_project;
import com.murcia.utils.Input; // Usamos la clase Input del profe

public class DISCOTECA {
    public static void main(String[] args) {
        COLACLIENTE cola = new COLACLIENTE();

       int cantidad = Input.nextInt("\n¿Cuantos clientes quieres registrar? ");
Input.nextLine(""); // limpia el buffer

for (int i = 0; i < cantidad; i++) {
    String nombre = Input.nextLine("\nDigite el nombre del cliente: ");
    int visitas = Input.nextInt("Digite el número de visitas: ");
    Input.nextLine(""); // limpia el buffer

    CLIENTE cliente = new CLIENTE(nombre, visitas);
    cola.agregarCliente(cliente);
    cliente.verificarRecompensas();
}


        System.out.println("\n--- Estado inicial de clientes ---");
        cola.mostrarCola();

        // Simular un evento especial
        DISCOTECAEVENT evento = new DISCOTECAEVENT(
            "Noche de Reggaetón", 
            "14-04-2026", 
            2, 
            "Entrada VIP doble"
        );

        System.out.println("\n--- Evento activo ---");
        evento.mostrarEvento();

        // Aplicar bonus del evento a todos los clientes
        System.out.println("\n--- Aplicando bonus del evento ---");
        for (int i = 0; i < cola.size(); i++) {
            CLIENTE cliente = cola.get(i);
            evento.aplicarBonus(cliente);
        }

        // Crear pila de premios
        PILAPREMIO pila = new PILAPREMIO();
        pila.apilar("Botella de Guaro");
        pila.apilar("Petaco");
        pila.apilar("Entrada VIP doble");

        System.out.println("\n--- Premios disponibles ---");
        pila.mostrarPremios();

        // Atender primero a un cliente VIP
        System.out.println("\n--- Atendiendo cliente ---");
        CLIENTE atendido = cola.atenderClienteVIP();
        if (atendido != null && !pila.estaVacia()) {
            String premio = pila.desapilar();
            System.out.println("Cliente " + atendido.getNombre() + " recibió: " + premio);
        }

        System.out.println("\n--- Estado final de clientes ---");
        cola.mostrarCola();

        System.out.println("\n--- Premios restantes ---");
        pila.mostrarPremios();
    }
}