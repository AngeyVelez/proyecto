/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import java.util.ArrayList;

/**
 *
 * @author AngeyVelez
 */
public class Grafo {

    private ArrayList<Vertice> vertices = new ArrayList<Vertice>();

    public Grafo() {
    }

    public void agregarArista(Vertice inicio, Vertice fin, int peso) {
        Arista arista1 = new Arista(peso, fin);
        Arista arista2 = new Arista(peso, inicio);
        for (int i = 0; i < this.vertices.size(); i++) {
            if (this.vertices.get(i).equals(inicio)) {
                this.vertices.get(i).getIncidencias().add(arista1);
            }
            if (this.vertices.get(i).equals(fin)) {
                this.vertices.get(i).getIncidencias().add(arista2);
            }
        }
    }
    
    public void eliminarArista(Vertice inicio, Vertice fin, int peso){
        for (int i = 0; i < this.vertices.size(); i++) {
            if (this.vertices.get(i).equals(inicio)) {
                for (int j = 0; j < this.vertices.get(i).getIncidencias().size(); j++) {
                    Arista arista = (Arista)this.vertices.get(i).getIncidencias().get(j);
                    if(arista.getPeso() == peso && arista.getDestino().equals(fin)){
                        this.vertices.get(i).getIncidencias().remove(j);
                    }
                }
            }
            if (this.vertices.get(i).equals(fin)) {
                for (int j = 0; j < this.vertices.get(i).getIncidencias().size(); j++) {
                    Arista arista = (Arista)this.vertices.get(i).getIncidencias().get(j);
                    if(arista.getPeso() == peso && arista.getDestino().equals(inicio)){
                        this.vertices.get(i).getIncidencias().remove(j);
                    }
                }
            }
        }
    }
    
    public void agregarVertice(Vertice vertice){
        if(!this.vertices.contains(vertice)){
            this.vertices.add(vertice);
        }
        else{
            System.out.println("El objeto ya pertenece al grafo");
        }
    }
    
    public void eliminarVertice(Vertice vertice){
        if(this.vertices.contains(vertice)){
            this.vertices.remove(vertice);
        }
        else{
            System.out.println("El objeto no pertenece al grafo");
        }
    }
    
}
