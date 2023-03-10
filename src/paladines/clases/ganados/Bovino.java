package paladines.clases.ganados;

import paladines.clases.ganados.Ganado;

/**
 *
 * @author Zhunio Miguel
 */
public class Bovino extends Ganado{
    private double sizeCostilla;
    private int numUbres;
    
    public Bovino() {
        super();
    }

    public Bovino(double sizeCostilla, int numUbres) {
        this.sizeCostilla = sizeCostilla;
        this.numUbres = numUbres;
    }

    public Bovino(double sizeCostilla, int numUbres, String CodigoProd, String Tipo, String Peso, String Edad, String Sexo, String Tamaño, String Cabezas, String Apareamiento, String Precio) {
        super(CodigoProd, Tipo, Peso, Edad, Sexo, Tamaño, Cabezas, Apareamiento, Precio);
        this.sizeCostilla = sizeCostilla;
        this.numUbres = numUbres;
    }

    

    public double getSizeCostilla() {
        return sizeCostilla;
    }

    public void setSizeCostilla(double sizeCostilla) {
        this.sizeCostilla = sizeCostilla;
    }

    public int getNumUbres() {
        return numUbres;
    }

    public void setNumUbres(int numUbres) {
        this.numUbres = numUbres;
    }

    @Override
    public String toString() {
        return "Bovino{" + "sizeCostilla=" + sizeCostilla + ", numUbres=" + numUbres + '}';
    }

}
