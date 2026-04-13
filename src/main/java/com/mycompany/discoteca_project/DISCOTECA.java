//importacion del proyecto
package com.mycompany.discoteca_project;
import java.util.Scanner;
public class DISCOTECA {
    
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear la cola y la pila
        COLACLIENTE cola = new COLACLIENTE();
        PILAPREMIO pilaPremios = new PILAPREMIO();

        // Pedir datos de clientes
        System.out.println("¿Cuántos clientes quieres registrar?");
        int cantidadClientes = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        for (int i = 0; i < cantidadClientes; i++) {
            System.out.println("Digite el nombre del cliente:");
            String nombre = sc.nextLine();

            System.out.println("Digite el número de visitas:");
            int visitas = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            CLIENTE cliente = new CLIENTE(nombre, visitas);
            cola.agregarCliente(cliente);
        }

        // Pedir premios
        System.out.println("¿Cuántos premios quieres registrar?");
        int cantidadPremios = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidadPremios; i++) {
            System.out.println("Digite el nombre del premio:");
            String premio = sc.nextLine();
            pilaPremios.apilar(premio);
        }

        // Crear evento
        System.out.println("Digite el nombre del evento:");
        String nombreEvento = sc.nextLine();

        System.out.println("Digite la fecha del evento (dd-mm-aaaa):");
        String fechaEvento = sc.nextLine();

        System.out.println("Digite el bonus de visitas:");
        int bonus = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite el premio especial:");
        String premioEspecial = sc.nextLine();

        DISCOTECAEVENT evento = new DISCOTECAEVENT(nombreEvento, fechaEvento, bonus, premioEspecial);

        // Mostrar estado inicial
        System.out.println("\n--- Estado inicial ---");
        cola.mostrarCola();
        pilaPremios.mostrarPremios();
        evento.mostrarEvento();

        // Aplicar bonus
        System.out.println("\n--- Aplicando bonus ---");
        for (int i = 0; i < cola.size(); i++) {
            CLIENTE cliente = cola.get(i);
            evento.aplicarBonus(cliente);
            cliente.mostrarCliente();
        }

        // Atender cliente y entregar premio
        System.out.println("\n--- Atendiendo cliente ---");
        CLIENTE atendido = cola.atenderCliente();
        if (atendido != null) {
            String premio = pilaPremios.desapilar();
            if (premio != null) {
                System.out.println("Cliente " + atendido.getNombre() + " recibió: " + premio);
            }
        }

        // Mostrar estado final
        System.out.println("\n--- Estado final ---");
        cola.mostrarCola();
        pilaPremios.mostrarPremios();

        sc.close();
    }
}
    