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
public class Casa {
    private String color = "";
    private String tamanio = "";
    private String material = "";
   

    public Casa() {
    }

    public Casa(String color, String tamanio, String material ) {
    this.color = color;
    this.tamanio = tamanio;
    this.material = material;  
    }
    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

   
    
    
    
}
