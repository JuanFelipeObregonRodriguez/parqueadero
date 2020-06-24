/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Juan Obregon
 */
public class Carro {
    
    
    private String  placa;
    private int  modelo;
    private String marca;

    public Carro() {
    }

  


    public Carro(String placa, int modelo, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String  getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

  
  
   
}
