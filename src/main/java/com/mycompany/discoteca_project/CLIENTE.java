//clase modificada por Andres
package com.mycompany.discoteca_project;

public class CLIENTE {
    private String nombre;
    private int visitas;
    private PASAPORTE pasaporte;
    
   //cONSTRUCTOR
    public CLIENTE(String nombre, int visitas) {
    this.nombre = nombre;
    this.visitas = visitas;
    this.pasaporte = null;
    }
// Getters
    public String getNombre() { return nombre; }
    public int getVisitas() { return visitas; }
    public PASAPORTE getPasaporte() { return pasaporte; }

    // Incrementar visitas
    public void sumarVisitas(int cantidad) {
        this.visitas += cantidad;
    }

    // Verificar recompensas según visitas
    public void verificarRecompensas() {
        if (visitas >= 20 && pasaporte == null) {
            pasaporte = new PASAPORTE("P-" + nombre);
            System.out.println("🎉 Cliente fiel: " + nombre + " recibió PASAPORTE VIP");
            pasaporte.mostrarInfo();
        } else if (visitas >= 15) {
            System.out.println("🎁 Cliente " + nombre + " recibió un PETACO");
        } else if (visitas >= 10) {
            System.out.println("🍾 Cliente " + nombre + " recibió una BOTELLA DE GUARO");
        } else {
            System.out.println("Cliente " + nombre + " aún no tiene recompensas.");
        }
    }

    // Mostrar información del cliente
    public void mostrarCliente() {
        System.out.println("Cliente: " + nombre + " | Visitas: " + visitas);
        if (pasaporte != null) {
            pasaporte.mostrarInfo();
        } else {
            System.out.println("Pasaporte: No tiene");
        }
    }
}
    