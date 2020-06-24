/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Juan Obregon
 */
public class Tiempo {
    private int horaDeEntrada;
    private int horaDeSalida;

    public Tiempo() {
    }

    public Tiempo(int horaDeEntrada, int horaDeSalida) {
        this.horaDeEntrada = horaDeEntrada;
        this.horaDeSalida = horaDeSalida;
    }

    public int getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(int horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public int getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(int horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

 public int calcularPago(){
 
        int pago = 0;
        int horadeestadia=horaDeSalida-horaDeEntrada;
        int fraccion=horadeestadia;
        int horarestante=horadeestadia-1;
        
        
        if(horadeestadia>1){
            
            pago=1000+(horarestante*600);
            
            
              
        }else{
          pago=1000;
        }
        System.out.println("el pago por la fraccion es "+pago);
        return pago;
    }
}
