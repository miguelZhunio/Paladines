package paladines.clases;

import paladines.clases.usuarios.Vendedor;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Zhunio Miguel
 */
public class Granja {
    private String id_granja;
    private Vendedor owner_granja;
    private String nombre_granja;
    private Map<String, String> direccion_granja =  Stream.of(new Object[][]{
        {"Calle", ""},
        {"Codigo_Postal", ""},
        {"Ciudad", ""} 
        }).collect(Collectors.toMap(p -> (String)p[0], p -> (String)p[1]));
    private String contacto_granja;

    public Granja() {
        
    }

    public Granja(String id_granja, Vendedor owner_granja, String nombre_granja, String contacto_granja) {
        this.id_granja = id_granja;
        this.owner_granja = owner_granja;
        this.nombre_granja = nombre_granja;
        this.contacto_granja = contacto_granja;
    }

    public String getId_granja() {
        return id_granja;
    }

    public void setId_granja(String id_granja) {
        this.id_granja = id_granja;
    }

    public Vendedor getOwner_granja() {
        return owner_granja;
    }

    public void setOwner_granja(Vendedor owner_granja) {
        this.owner_granja = owner_granja;
    }

    public String getNombre_granja() {
        return nombre_granja;
    }

    public void setNombre_granja(String nombre_granja) {
        this.nombre_granja = nombre_granja;
    }

    public Map<String, String> getDireccion_granja() {
        return direccion_granja;
    }

    public void setDireccion_granja(Map<String, String> direccion_granja) {
        this.direccion_granja = direccion_granja;
    }

    public String getContacto_granja() {
        return contacto_granja;
    }

    public void setContacto_granja(String contacto_granja) {
        this.contacto_granja = contacto_granja;
    }

    @Override
    public String toString() {
        return "Granja{" + "id_granja=" + id_granja + ", owner_granja=" + owner_granja + ", nombre_granja=" + nombre_granja + ", direccion_granja=" + direccion_granja + ", contacto_granja=" + contacto_granja + '}';
    }
    
    
    
}
