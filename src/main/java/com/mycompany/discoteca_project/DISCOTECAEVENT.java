//clase modificada por Andres
package com.mycompany.discoteca_project;

public class DISCOTECAEVENT {
    private String nombreEvento;
    private String fecha;
    private int bonusVisitas;         
    private String premioEspecial;     

    // Constructor
    public DISCOTECAEVENT(String nombreEvento, String fecha, int bonusVisitas, String premioEspecial) {
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.premioEspecial = premioEspecial;
        this.bonusVisitas = bonusVisitas;
    }

    // Aplica el bonus de visitas al cliente
    public void aplicarBonus(CLIENTE cliente) {
        int visitasActuales = cliente.getVisitas();
        cliente.setVisitas(visitasActuales + bonusVisitas);
        System.out.println("Se aplicó bonus de " + bonusVisitas + " visitas a " + cliente.getNombre());
    }

    // Agrega el premio especial a la pila de premios
    public void agregarPremioEspecial(PILAPREMIO pila) {
        pila.apilar(premioEspecial);
        System.out.println("Se agregó el premio especial '" + premioEspecial + "' a la pila.");
    }

    // Muestra la información del evento
    public void mostrarEvento() {
        System.out.println(" Evento: " + nombreEvento);
        System.out.println(" Fecha: " + fecha);
        System.out.println(" Premio especial: " + premioEspecial);
        System.out.println(" Bonus de visitas: " + bonusVisitas);
    }
}
