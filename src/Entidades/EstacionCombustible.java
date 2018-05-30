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
public class EstacionCombustible extends Posicion implements ElementosSistemaPlanetario{
    private Recursos precioCombustible;
    private Recursos precioSondas;

    public EstacionCombustible() {
    }

    public EstacionCombustible(Recursos precioCombustible, Recursos precioSondas) {
        this.precioCombustible = precioCombustible;
        this.precioSondas = precioSondas;
    }

    public EstacionCombustible(Recursos precioCombustible, Recursos precioSondas, int x, int y, String ruta) {
        super(x, y, ruta);
        this.precioCombustible = precioCombustible;
        this.precioSondas = precioSondas;
    }
    
    @Override
    public void mover(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the precioCombustible
     */
    public Recursos getPrecioCombustible() {
        return precioCombustible;
    }

    /**
     * @param precioCombustible the precioCombustible to set
     */
    public void setPrecioCombustible(Recursos precioCombustible) {
        this.precioCombustible = precioCombustible;
    }

    /**
     * @return the precioSondas
     */
    public Recursos getPrecioSondas() {
        return precioSondas;
    }

    /**
     * @param precioSondas the precioSondas to set
     */
    public void setPrecioSondas(Recursos precioSondas) {
        this.precioSondas = precioSondas;
    }
}
