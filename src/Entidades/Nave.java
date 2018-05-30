/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.List;

/**
 *
 * @author deivid
 */
public class Nave extends Posicion{
    private int vida;
    private List<Escudo> escudos;
    private List<Arma> Armas;

    public Nave() {
    }

    public Nave(int vida, List<Escudo> escudos, List<Arma> Armas) {
        this.vida = vida;
        this.escudos = escudos;
        this.Armas = Armas;
    }

    public Nave(int vida, List<Escudo> escudos, List<Arma> Armas, int x, int y) {
        super(x, y);
        this.vida = vida;
        this.escudos = escudos;
        this.Armas = Armas;
    }
    
    @Override
    public void mover(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    /**
     * @return the escudos
     */
    public List<Escudo> getEscudos() {
        return escudos;
    }

    /**
     * @param escudos the escudos to set
     */
    public void setEscudos(List<Escudo> escudos) {
        this.escudos = escudos;
    }

    /**
     * @return the Armas
     */
    public List<Arma> getArmas() {
        return Armas;
    }

    /**
     * @param Armas the Armas to set
     */
    public void setArmas(List<Arma> Armas) {
        this.Armas = Armas;
    }
}
