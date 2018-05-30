/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *Clase abstracta para manejar las posiciones en la interfaz grafica
 * @author deivid
 */
public abstract class Posicion {
    private int x;
    private int y;
    private Image icono;

    /**
     *Constructor por defecto de la clase abstracta
     */
    public Posicion() {
    }

    /**
     *Constructor parametrizado de la clase abstracta
     * @param x
     * @param y
     * @param ruta
     */
    public Posicion(int x, int y, String ruta) {
        this.x = x;
        this.y = y;
        this.icono = new ImageIcon(getClass().getResource(ruta)).getImage();
    }
    
    /**
     *Permite cambiar los valores de x y y para mover el objeto que implemente esta clase 
     * @param x
     * @param y
     */
    public abstract void mover(int x, int y);

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
}
