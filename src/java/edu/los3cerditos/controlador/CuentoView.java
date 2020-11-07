/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.los3cerditos.controlador;

import edu.los3cerditos.modelo.Casa;
import edu.los3cerditos.modelo.Cerdo;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Usuario
 */
@Named(value = "cuentoView")
@ViewScoped
public class CuentoView implements Serializable {

    private Casa registroCasa = new Casa();
    private ArrayList<Casa> listaCasas = new ArrayList<>();

    private Cerdo registroCerdo = new Cerdo();
    private ArrayList<Cerdo> listaCerdos = new ArrayList<>();

    private String material ="";
    
    
    
    /**
     * Creates a new instance of CuentoView
     */
    public CuentoView() {
    }

    public void guardarCasaNueva() {
        listaCasas.add(new Casa(registroCasa.getColor(), registroCasa.getTamanio(), registroCasa.getMaterial()));
        registroCasa = new Casa();
    }

    public void registrarNuevoCerdo() {
        
        Casa casaSeleccionada = new Casa();
        
        for (Casa objCasa : listaCasas) {
            if(objCasa.getMaterial().endsWith(material)){
            casaSeleccionada = objCasa;
            break;
            }
        }
               
        
        listaCerdos.add(new Cerdo(registroCerdo.getColor(), 
                                   registroCerdo.getTamanio(), 
                                   registroCerdo.getVestimenta(),
                                   registroCerdo.getPersonalidad(), 
                                   registroCerdo.getNombre(), 
                                   registroCerdo.getInstrumento(),
                                   casaSeleccionada));
        registroCerdo = new Cerdo();
    }


    public void cantar(Cerdo cCanta){
        System.out.println(cCanta.cantar("Vallenato"));
        
    }
    
    
    public void bailar(Cerdo cBaila){
        System.out.println(cBaila.bailar("Champeta"));
    }
    
    
    
    
    public void tocar(Cerdo cToca){
        System.out.println(cToca.tocarInstrumento());
    }
    
    
    
    public Casa getRegistroCasa() {
        return registroCasa;
    }

    public void setRegistroCasa(Casa registroCasa) {
        this.registroCasa = registroCasa;
    }

    public ArrayList<Casa> getListaCasas() {
        return listaCasas;
    }

    public void setListaCasas(ArrayList<Casa> listaCasas) {
        this.listaCasas = listaCasas;
    }

    public Cerdo getRegistroCerdo() {
        return registroCerdo;
    }

    public void setRegistroCerdo(Cerdo registroCerdo) {
        this.registroCerdo = registroCerdo;
    }

    public ArrayList<Cerdo> getListaCerdos() {
        return listaCerdos;
    }

    public void setListaCerdos(ArrayList<Cerdo> listaCerdos) {
        this.listaCerdos = listaCerdos;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    
}
