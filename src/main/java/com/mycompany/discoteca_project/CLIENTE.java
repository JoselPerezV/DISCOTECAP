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
public String getNombre() { return nombre; }
    public int getVisitas() { return visitas; }
    public PASAPORTE getPasaporte() { return pasaporte; }

    public void sumarVisitas(int cantidad) {
        this.visitas += cantidad;
    }

    // Recompensas escalonadas
    public void verificarRecompensas() {
        if (visitas >= 20 && pasaporte == null) {
            pasaporte = new PASAPORTE(
                "P-" + nombre,
                nombre,
                "Colombiana",
                "12-04-2026",
                "12-04-2031"
            );
            System.out.println("🎉 Cliente fiel: " + nombre + " recibió PASAPORTE VIP");
        } else if (visitas >= 15) {
            System.out.println("🎁 Cliente " + nombre + " recibió un PETACO");
        } else if (visitas >= 10) {
            System.out.println("🍾 Cliente " + nombre + " recibió una BOTELLA DE GUARO");
        }
    }

    public void mostrarCliente() {
        System.out.println("Cliente: " + nombre + " | Visitas: " + visitas);
        if (pasaporte != null) {
            pasaporte.mostrarInfo();
        } else {
            System.out.println("Pasaporte: No tiene");
        }
    }

    void setVisitas(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    