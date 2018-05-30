/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Estructura.Grafo;

/**
 *
 * @author deivid
 */
public class Nebulosa extends Posicion{
    Grafo sistemasPlanetarios;

    public Nebulosa() {
        this.sistemasPlanetarios = new Grafo();
    }
    
    @Override
    public void mover(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
