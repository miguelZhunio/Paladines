package paladines.clases.ganados;

/**
 *
 * @author Zhunio Miguel
 */
public class Equino extends Ganado{
   private String comportamiento;
   private double velocidad;
   private boolean herraduras;

    public Equino() {
        super();
    }

    public Equino(String comportamiento, double velocidad, boolean herraduras, String codigo, int edad, char sexo, int apariamientos, double size, double peso, double precio, String raza) {
        super(codigo, edad, sexo, apariamientos, size, peso, precio, raza);
        this.comportamiento = comportamiento;
        this.velocidad = velocidad;
        this.herraduras = herraduras;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isHerraduras() {
        return herraduras;
    }

    public void setHerraduras(boolean herraduras) {
        this.herraduras = herraduras;
    }

    @Override
    public String toString() {
        return "Equino{" + "comportamiento=" + comportamiento + ", velocidad=" + velocidad + ", herraduras=" + herraduras + '}';
    }
    
}
