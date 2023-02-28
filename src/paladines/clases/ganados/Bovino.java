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

    public Bovino(double sizeCostilla, int numUbres, String codigo, int edad, char sexo, int apariamientos, double size, double peso, double precio, String raza) {
        super(codigo, edad, sexo, apariamientos, size, peso, precio, raza);
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
