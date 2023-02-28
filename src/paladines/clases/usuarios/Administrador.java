package paladines.clases.usuarios;

/**
 *
 * @author Zhunio Miguel
 */
public final class Administrador extends Persona{
    private String rol;

    public Administrador() {
        
    }
    public Administrador(String rol) {
        this.rol = rol;
    }

    public Administrador(String rol, String cedula, String nombre, String apellido, String telefono, char Sexo, String correo, int edad, String password) {
        super(cedula, nombre, apellido, telefono, Sexo, correo, edad, password);
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Administrador{" + "rol=" + rol + '}';
    }
    
}
