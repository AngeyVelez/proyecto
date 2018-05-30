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
public abstract class Arma {
    private String nombre;
    private int poder;

    public Arma() {
    }

    public Arma(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }
    
    public abstract void disparar();

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the poder
     */
    public int getPoder() {
        return poder;
    }

    /**
     * @param poder the poder to set
     */
    public void setPoder(int poder) {
        this.poder = poder;
    }
}
