package com.mycompany.discoteca_project;

import com.murcia.utils.ListaEnlazada;

public class PILAPREMIO {
    private ListaEnlazada premios;

    public PILAPREMIO() {
        premios = new ListaEnlazada();
    }

    // Apilar premio 
    public void apilar(String premio) {
        premios.insertarInicio(premio); 
    }

    // Desapilar premio 
    public String desapilar() {
        if (premios.estaVacia()) {
            return null;
        }
        String premio = (String) premios.obtenerInicio();
        premios.eliminarInicio();
        return premio;
    }

    // Mostrar todos los premios
    public void mostrarPremios() {
        System.out.println("Premios en la pila:");
        premios.mostrar();
    }

    // Verificar si la pila está vacía
    public boolean estaVacia() {
        return premios.estaVacia();
    }
}
