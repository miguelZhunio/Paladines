package paladines.clases.ganados;

import paladines.clases.ganados.Ganado;

/**
 *
 * @author Zhunio Miguel
 */
public class Ovino extends Ganado{
    private int numero_esquilado;
    private String calidad_lana;
    
    public Ovino() {
        super();
    }

    public Ovino(int numero_esquilado, String calidad_lana) {
        this.numero_esquilado = numero_esquilado;
        this.calidad_lana = calidad_lana;
    }

    

    public int getNumero_esquilado() {
        return numero_esquilado;
    }

    public void setNumero_esquilado(int numero_esquilado) {
        this.numero_esquilado = numero_esquilado;
    }

    public String getCalidad_lana() {
        return calidad_lana;
    }

    public void setCalidad_lana(String calidad_lana) {
        this.calidad_lana = calidad_lana;
    }

    @Override
    public String toString() {
        return "Ovino{" + "numero_esquilado=" + numero_esquilado + ", calidad_lana=" + calidad_lana + '}';
    }
    
}
