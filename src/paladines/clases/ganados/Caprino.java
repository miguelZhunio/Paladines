package paladines.clases.ganados;

/**
 *
 * @author Zhunio Miguel
 * 
 */
public class Caprino extends Ganado{
    private double cant_leche;
    private boolean presencia_cuernos;
    
    public Caprino() {
        super();
    }

    public Caprino(double cant_leche, boolean presencia_cuernos) {
        this.cant_leche = cant_leche;
        this.presencia_cuernos = presencia_cuernos;
    }

   

    public double getCant_leche() {
        return cant_leche;
    }

    public void setCant_leche(double cant_leche) {
        this.cant_leche = cant_leche;
    }

    public boolean isPresencia_cuernos() {
        return presencia_cuernos;
    }

    public void setPresencia_cuernos(boolean presencia_cuernos) {
        this.presencia_cuernos = presencia_cuernos;
    }

    @Override
    public String toString() {
        return "Caprino{" + "cant_leche=" + cant_leche + ", presencia_cuernos=" + presencia_cuernos + '}';
    }
    
}
