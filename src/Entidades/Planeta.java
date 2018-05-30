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
public class Planeta extends Posicion implements ElementosSistemaPlanetario{
    private Recursos recursos;

    public Planeta() {
    }

    public Planeta(Recursos recursos) {
        this.recursos = recursos;
    }

    public Planeta(Recursos recursos, int x, int y) {
        super(x, y);
        this.recursos = recursos;
    }

    @Override
    public void mover(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
}
