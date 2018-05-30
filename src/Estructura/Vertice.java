/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author AngeyVelez
 */
public class Vertice<T> implements Iterable<T>{
    private T vertice;
    private ArrayList<Arista> incidencias;
    private boolean visitado;

    public Vertice() {
    }

    public Vertice(T vertice) {
        super();
        this.vertice = vertice;
        this.incidencias = new ArrayList<>();
        this.visitado = false;
    }
    
    
    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the vertice
     */
    public T getVertice() {
        return vertice;
    }

    /**
     * @param vertice the vertice to set
     */
    public void setVertice(T vertice) {
        this.vertice = vertice;
    }

    /**
     * @return the incidencias
     */
    public ArrayList<Arista> getIncidencias() {
        return incidencias;
    }

    /**
     * @param incidencias the incidencias to set
     */
    public void setIncidencias(ArrayList<Arista> incidencias) {
        this.incidencias = incidencias;
    }

    /**
     * @return the visitado
     */
    public boolean isVisitado() {
        return visitado;
    }

    /**
     * @param visitado the visitado to set
     */
    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
}
