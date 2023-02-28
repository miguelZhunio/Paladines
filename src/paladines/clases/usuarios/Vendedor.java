package paladines.clases.usuarios;

import paladines.clases.Granja;
import paladines.clases.usuarios.Persona;

/**
 *
 * @author Zhunio Miguel
 */
public class Vendedor extends Persona{
    private String nombreComercial;
    private Granja granja;
    
    public Vendedor() {
        super();
    }

    public Vendedor(String nombreComercial, Granja granja, int calificacion) {
        this.nombreComercial = nombreComercial;
        this.granja = granja;
    }

    public Vendedor(String nombreComercial, Granja granja, int calificacion, String cedula, String nombre, String apellido, String telefono, char Sexo, String correo, int edad, String password) {
        super(cedula, nombre, apellido, telefono, Sexo, correo, edad, password);
        this.nombreComercial = nombreComercial;
        this.granja = granja;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public Granja getGranja() {
        return granja;
    }

    public void setGranja(Granja granja) {
        this.granja = granja;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nombreComercial=" + nombreComercial + ", granja=" + granja + '}';
    }
   
}
