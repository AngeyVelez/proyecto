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
public class Reaper extends Nave {
    String nombre;

    public Reaper() {
    }

    public Reaper(String nombre) {
        this.nombre = nombre;
    }

    public Reaper(String nombre, int vida, List<Escudo> escudos, List<Arma> Armas) {
        super(vida, escudos, Armas);
        this.nombre = nombre;
    }

    public Reaper(String nombre, int vida, List<Escudo> escudos, List<Arma> Armas, int x, int y) {
        super(vida, escudos, Armas, x, y);
        this.nombre = nombre;
    }
    
}
