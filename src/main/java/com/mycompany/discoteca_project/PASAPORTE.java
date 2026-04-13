
package com.mycompany.discoteca_project;

public class PASAPORTE {
 private String codigo;       // identificador del pasaporte
    private String beneficio;    // descripción de beneficios
 
    //constructor de la clase
    public PASAPORTE (String codigo){
        this.codigo = codigo;
        this.beneficio = "Acceso VIP: No hacer fila y participar por mas premios";
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