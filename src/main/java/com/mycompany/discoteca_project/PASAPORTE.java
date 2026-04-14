
package com.mycompany.discoteca_project;

public class PASAPORTE {
 private String codigo;       // identificador del pasaporte
    private String beneficio;    // descripción de beneficios
 
    //constructor de la clase
    public PASAPORTE (String codigo){
        this.codigo = codigo;
        this.beneficio = "Acceso VIP: No hacer fila y participar por mas premios";
    }

    PASAPORTE(String string, String nombre, String colombiana, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
//metodos GET
    public String getCodigo() {
        return codigo;
    }

    public String getBeneficio() {
        return beneficio;
    }
   
   public void mostrarInfo(){
       System.out.println("Pasaporte VIP Entregado al cliente");
       System.out.println("Codigo: "+codigo);
       System.out.println("Beneficios: "+ beneficio);
   }
}