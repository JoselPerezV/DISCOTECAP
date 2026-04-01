package com.mycompany.discoteca_project;

import com.murcia.utils.ListaEnlazada;

import com.murcia.utils.ListaEnlazada;

public class PILAPREMIO {
    private ListaEnlazada<String> premios;

    public PILAPREMIO() {
        premios = new ListaEnlazada<>();
    }

    // Apilar premio
    public void apilar(String premio) {
        premios.addFirst(premio); // método correcto
    }

    // Desapilar premio
    public String desapilar() {
        if (premios.size() == 0) {
            return null;
        }
        String premio = premios.getFirst(); 
        premios.remove(); 
        return premio;
    }

    // Mostrar todos los premios
    public void mostrarPremios() {
        System.out.println("Premios en la pila:");
        System.out.println(premios.toString()); 
    }

    // Verificar si la pila está vacía
    public boolean estaVacia() {
        return premios.size() == 0;
    }
}

