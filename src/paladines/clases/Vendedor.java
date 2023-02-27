package paladines.clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Vendedor extends Persona{
    private Granja granja;
    private int calificacion;

    public Vendedor(Granja granja) {
        this.granja = granja;
    }
    public Vendedor() {
        super();
    }

    public Vendedor(Granja granja, int calificacion) {
        this.granja = granja;
        this.calificacion = calificacion;
    }

    public Vendedor(Granja granja, int calificacion, String cedula, String nombre, String apellido, String telefono, char Sexo, String correo, int edad, String password) {
        super(cedula, nombre, apellido, telefono, Sexo, correo, edad, password);
        this.granja = granja;
        this.calificacion = calificacion;
    }

    public Granja getGranja() {
        return granja;
    }

    public void setGranja(Granja granja) {
        this.granja = granja;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "granja=" + granja + ", calificacion=" + calificacion + '}';
    }
    
}
