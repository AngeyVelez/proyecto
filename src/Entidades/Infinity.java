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
public class Infinity extends Nave{
    private Recursos recursos;
    private float capacidadCombustible;
    private float combustible;
    private float capacidadRecursos;
    private int cantidadSondas;
    private float kilometrosPorLitroGasolina;

    public Infinity() {
    }

    public Infinity(Recursos recursos, float capacidadCombustible, float combustible, float capacidadRecursos, int cantidadSondas, float kilometrosPorLitroGasolina) {
        this.recursos = recursos;
        this.capacidadCombustible = capacidadCombustible;
        this.combustible = combustible;
        this.capacidadRecursos = capacidadRecursos;
        this.cantidadSondas = cantidadSondas;
        this.kilometrosPorLitroGasolina = kilometrosPorLitroGasolina;
    }

    public Infinity(Recursos recursos, float capacidadCombustible, float combustible, float capacidadRecursos, int cantidadSondas, float kilometrosPorLitroGasolina, int vida, List<Escudo> escudos, List<Arma> Armas) {
        super(vida, escudos, Armas);
        this.recursos = recursos;
        this.capacidadCombustible = capacidadCombustible;
        this.combustible = combustible;
        this.capacidadRecursos = capacidadRecursos;
        this.cantidadSondas = cantidadSondas;
        this.kilometrosPorLitroGasolina = kilometrosPorLitroGasolina;
    }

    public Infinity(Recursos recursos, float capacidadCombustible, float combustible, float capacidadRecursos, int cantidadSondas, float kilometrosPorLitroGasolina, int vida, List<Escudo> escudos, List<Arma> Armas, int x, int y) {
        super(vida, escudos, Armas, x, y);
        this.recursos = recursos;
        this.capacidadCombustible = capacidadCombustible;
        this.combustible = combustible;
        this.capacidadRecursos = capacidadRecursos;
        this.cantidadSondas = cantidadSondas;
        this.kilometrosPorLitroGasolina = kilometrosPorLitroGasolina;
    }

    /**
     * @return the recursos
     */
    public Recursos getRecursos() {
        return recursos;
    }

    /**
     * @param recursos the recursos to set
     */
    public void setRecursos(Recursos recursos) {
        this.recursos = recursos;
    }

    /**
     * @return the capacidadCombustible
     */
    public float getCapacidadCombustible() {
        return capacidadCombustible;
    }

    /**
     * @param capacidadCombustible the capacidadCombustible to set
     */
    public void setCapacidadCombustible(float capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    /**
     * @return the combustible
     */
    public float getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(float combustible) {
        this.combustible = combustible;
    }

    /**
     * @return the capacidadRecursos
     */
    public float getCapacidadRecursos() {
        return capacidadRecursos;
    }

    /**
     * @param capacidadRecursos the capacidadRecursos to set
     */
    public void setCapacidadRecursos(float capacidadRecursos) {
        this.capacidadRecursos = capacidadRecursos;
    }

    /**
     * @return the cantidadSondas
     */
    public int getCantidadSondas() {
        return cantidadSondas;
    }

    /**
     * @param cantidadSondas the cantidadSondas to set
     */
    public void setCantidadSondas(int cantidadSondas) {
        this.cantidadSondas = cantidadSondas;
    }

    /**
     * @return the kilometrosPorLitroGasolina
     */
    public float getKilometrosPorLitroGasolina() {
        return kilometrosPorLitroGasolina;
    }

    /**
     * @param kilometrosPorLitroGasolina the kilometrosPorLitroGasolina to set
     */
    public void setKilometrosPorLitroGasolina(float kilometrosPorLitroGasolina) {
        this.kilometrosPorLitroGasolina = kilometrosPorLitroGasolina;
    }
    
    
}
