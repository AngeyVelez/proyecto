/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

/**
 *
 * @author AngeyVelez
 */
public class Arista {

    private int peso;
    private Vertice destino;

    public Arista() {
    }

    public Arista(int peso, Vertice destino) {
        this.peso = peso;
        this.destino = destino; 
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the destino
     */
    public Vertice getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(Vertice destino) {
        this.destino = destino;
    }
    
}
