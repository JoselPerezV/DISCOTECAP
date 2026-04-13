package com.mycompany.discoteca_project;
import com.murcia.utils.ColaEnlazada;

public class COLACLIENTE extends ColaEnlazada<CLIENTE> {
  public COLACLIENTE() {
        super();
    }

    // Método para agregar clientes a la cola
    public void agregarCliente(CLIENTE cliente) {
        encolar(cliente); // usa el método de la librería
        System.out.println("Se agregó a la cola el cliente: " + cliente.getNombre());
    }

    // Mostrar todos los clientes en la cola
    public void mostrarCola() {
        if (size() == 0) {
            System.out.println("No hay clientes en la cola.");
            return;
        }
        System.out.println("Clientes en la cola:");
        for (int i = 0; i < size(); i++) {
            CLIENTE cliente = get(i);
            cliente.mostrarCliente();
        }
    }

    // Atiende (desencola) al primer cliente
    public CLIENTE atenderCliente() {
        if (size() == 0) {
            System.out.println("No hay clientes en la cola.");
            return null;
        }
        CLIENTE atendido = desencolar();
        System.out.println("Cliente atendido: " + atendido.getNombre());
        return atendido;
    }

    // Método especial: atender primero a clientes con pasaporte VIP
    public CLIENTE atenderClienteVIP() {
        for (int i = 0; i < size(); i++) {
            CLIENTE cliente = get(i);
            if (cliente.getPasaporte() != null) {
                // quitarlo de la cola y atenderlo
                CLIENTE vip = cliente;
                remove(i);
                System.out.println("Cliente VIP atendido sin hacer fila: " + vip.getNombre());
                return vip;
            }
        }
        // si no hay VIP, atender normalmente
        return atenderCliente();
    }
}