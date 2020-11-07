/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.los3cerditos.modelo;

/**
 *
 * @author Usuario
 */
public class Lobo extends Animal {

    public String soplar(Casa casaIn) {
        return this.getNombre() + "  Soploooooooooooo y soploooooo " + casaIn.getMaterial();
    }

    public String enganiar(Cerdo cerdoIn) {
        return this.getNombre() + "  engaña a " + cerdoIn.getNombre();
    }
    
      public String empujar(Casa casaIn) {
        return this.getNombre() + "  empuja la puerta de la casa " + casaIn.getMaterial();
    }

}
