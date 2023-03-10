package paladines.clases.ganados;

import paladines.clases.ganados.Ganado;

/**
 *
 * @author Zhunio Miguel
 */
public class Porcino extends Ganado{
    private double sizeCuero;
    private boolean castrado;
    
    public Porcino() {
        
    }

    public Porcino(double sizeCuero, boolean castrado) {
        this.sizeCuero = sizeCuero;
        this.castrado = castrado;
    }

    public Porcino(double sizeCuero, boolean castrado, String CodigoProd, String Tipo, String Peso, String Edad, String Sexo, String Tamaño, String Cabezas, String Apareamiento, String Precio) {
        super(CodigoProd, Tipo, Peso, Edad, Sexo, Tamaño, Cabezas, Apareamiento, Precio);
        this.sizeCuero = sizeCuero;
        this.castrado = castrado;
    }

    

    public double getSizeCuero() {
        return sizeCuero;
    }

    public void setSizeCuero(double sizeCuero) {
        this.sizeCuero = sizeCuero;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    @Override
    public String toString() {
        return "Porcino{" + "sizeCuero=" + sizeCuero + ", castrado=" + castrado + '}';
    }
    
}
