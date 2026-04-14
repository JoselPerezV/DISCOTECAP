//clase modificada por Andres y resultado final de esta
package com.mycompany.discoteca_project;

public class DISCOTECAEVENT {
    private String nombre;
    private String fecha;
    private int bonusVisitas;
    private String premioEspecial;

    // Constructor
    public DISCOTECAEVENT(String nombre, String fecha, int bonusVisitas, String premioEspecial) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.bonusVisitas = bonusVisitas;
        this.premioEspecial = premioEspecial;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getFecha() { return fecha; }
    public int getBonusVisitas() { return bonusVisitas; }
    public String getPremioEspecial() { return premioEspecial; }

    // Aplicar bonus de visitas a un cliente
    public void aplicarBonus(CLIENTE cliente) {
        cliente.sumarVisitas(bonusVisitas);
        System.out.println("Evento '" + nombre + "' aplicado: +" + bonusVisitas + " visitas a " + cliente.getNombre());
        cliente.verificarRecompensas();
    }

    // Mostrar información del evento
 public void mostrarEvento() {
        
    System.out.println("Evento: " + nombre + " | Fecha: " + fecha +
                           " | Bonus: " + bonusVisitas +
                           " | Premio especial: " + premioEspecial);
    }
}