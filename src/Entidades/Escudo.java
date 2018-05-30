/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *Clase abstracta para manejar los escudos
 * @author deivid
 */
public abstract class Escudo {
    private String nombre;
    private int vida;

    /**
     *Constructor por defecto de la clase abstracta
     */
    public Escudo() {
    }

    /**
     *Constructor parametrizable de la clase abstracta
     * @param nombre
     * @param vida
     */
    public Escudo(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }
    
    /**
     *Metodo el cual se usa para simular el daño en un escudo
     * @param daño
     */
    public abstract void disminuirEscudo(int daño);

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
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }
}
