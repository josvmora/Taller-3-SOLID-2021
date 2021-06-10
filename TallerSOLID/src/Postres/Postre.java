/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author Viviana Vera Falconi
 */
public class Postre{
    
    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;
    
    public Postre(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
        this.precioParcial = 0;
    }
    
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    
    public double getPrecioParcial() {
    	return precioParcial;
    }
    public void anadirAderezo(Aderezo aderezo){
        this.getAderezos().add(aderezo);
    }
    
    public void quitarAderezo(Aderezo aderezo){
        if(aderezos.contains(aderezo)){
            aderezos.remove(aderezo);
        }
    }

    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    
}
