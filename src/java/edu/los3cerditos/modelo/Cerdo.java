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
public class Cerdo extends Animal {

    private String instrumento = "";
    private Casa casa = new Casa();

    public Cerdo() {
    }

    public Cerdo(String color, String tamanio, String vestimenta, String personalidad, String nombre) {
        super(color, tamanio, vestimenta, personalidad, nombre);
    }

    public Cerdo(String color, String tamanio, String vestimenta, String personalidad, String instrumento, String nombre) {
        super(color, tamanio, vestimenta, personalidad, nombre);
        this.instrumento = instrumento;
    }

    public Cerdo(String color, String tamanio, String vestimenta, String personalidad, String nombre, String instrumento, Casa casa) {
        super(color, tamanio, vestimenta, personalidad, nombre);
        this.instrumento = instrumento;
        this.casa = casa;
    }

    public String cantar(String melodia) {
        return this.getNombre() + " Canta " + melodia + " = Quien teme al lobo Feroz ....";
    }

    public String bailar(String ritmo) {
        return this.getNombre() + " Baila " + ritmo;
    }

    public String contruir() {
        return this.getNombre() + " Contruir casa de color : " + this.casa.getColor()
                + ",material " + this.casa.getMaterial() + " y tamaño " + this.casa.getTamanio();
    }
    
    
     public String tocarInstrumento() {
        return this.getNombre() + " toca el  : " + this.instrumento;                
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

}
