package paladines.clases.usuarios;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private char Sexo;
    private Map<String, String> direccion =  Stream.of(new Object[][]{
        {"Calle", ""},
        {"Codigo_Postal", ""},
        {"Ciudad", ""} 
        }).collect(Collectors.toMap(p -> (String)p[0], p -> (String)p[1]));
    private String correo;
    private int edad;
    private String password;

    public Persona() {
        
    }

    public Persona(String cedula, String nombre, String apellido, String telefono, char Sexo, String correo, int edad, String password) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.Sexo = Sexo;
        this.correo = correo;
        this.edad = edad;
        this.password = password;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public Map<String, String> getDireccion() {
        return direccion;
    }

    public void setDireccion(Map<String, String> direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", Sexo=" + Sexo + ", direccion=" + direccion + ", correo=" + correo + ", edad=" + edad + ", password=" + password + '}';
    }
    
    
}
