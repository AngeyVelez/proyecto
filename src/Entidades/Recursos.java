/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author deivid
 */
public class Recursos {
    private float iridio;
    private float platino;
    private float paladio;
    private float elementoZero;

    public Recursos() {
    }

    public Recursos(float iridio, float platino, float paladio, float elementoZero) {
        this.iridio = iridio;
        this.platino = platino;
        this.paladio = paladio;
        this.elementoZero = elementoZero;
    }

    /**
     * @return the iridio
     */
    public float getIridio() {
        return iridio;
    }

    /**
     * @param iridio the iridio to set
     */
    public void setIridio(float iridio) {
        this.iridio = iridio;
    }

    /**
     * @return the platino
     */
    public float getPlatino() {
        return platino;
    }

    /**
     * @param platino the platino to set
     */
    public void setPlatino(float platino) {
        this.platino = platino;
    }

    /**
     * @return the paladio
     */
    public float getPaladio() {
        return paladio;
    }

    /**
     * @param paladio the paladio to set
     */
    public void setPaladio(float paladio) {
        this.paladio = paladio;
    }

    /**
     * @return the elementoZero
     */
    public float getElementoZero() {
        return elementoZero;
    }

    /**
     * @param elementoZero the elementoZero to set
     */
    public void setElementoZero(float elementoZero) {
        this.elementoZero = elementoZero;
    }
    
    
}
