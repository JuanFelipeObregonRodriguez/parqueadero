/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Modelo.Carro;

/**
 *
 * @author ASUS
 */
public class Parqueadero {

    private Carro[] carros = new Carro[20];

    /**
     *
     * @param carro metodo para parquear carro, el ciclo recorre el arreglo y
     * por medio de la iteracion agrega un carro
     */
    public boolean parquearCarro(Carro carro) {

        for (int i = 0; i < carros.length; i++) {

            if (carros[i] == null) {

                carros[i] = carro;
                return true;

            }

        }

        return false;

    }
     /**
      * 
      * @param placa
      * recore el arreglo
      * y busca el carro por la placa
      * y se retorna nulo
      */
    public boolean sacarCarro(String placa) {

        for (int i = 0; i < carros.length; i++) {

            if (carros[i] != null) {

                if (carros[i].getPlaca().equals(placa)) {

                    carros[i] = null;
                    return true;

                }
            }
        }
        return false;

    }
     /**
      * 
      * SE Busca el carro pot medio de la placa, solo que ya no se inserta en el arreglo de carros
      * @return 
      */
    public Carro buscarCarro(String placa) {
        for (int i = 0; i < carros.length; i++) {

            if (carros[i] != null) {

                if (carros[i].getPlaca().equals(placa)) {

                   

                }

            }

        }

        return null;
    }
    
  
}
