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

    public Porcino(double sizeCuero, boolean castrado, String codigo, int edad, char sexo, int apariamientos, double size, double peso, double precio, String raza) {
        super(codigo, edad, sexo, apariamientos, size, peso, precio, raza);
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
