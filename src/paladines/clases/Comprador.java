package paladines.clases;

import java.util.ArrayList;

/**
 *
 * @author Zhunio Miguel
 */
public class Comprador extends Persona{
    private ArrayList<Factura> lista_facturas;

    public Comprador() {
        super();
    }
   
    public Comprador(Granja granja, int calificacion, String cedula, String nombre, String apellido, String telefono, char Sexo, String correo, int edad, String password, ArrayList<Factura> lista_facturas) {
        super(cedula, nombre, apellido, telefono, Sexo, correo, edad, password);
        this.lista_facturas = lista_facturas;
    }
    
    public Comprador(ArrayList<Factura> lista_facturas) {
        this.lista_facturas = lista_facturas;
    }
    
    
    public ArrayList<Factura> getLista_facturas() {
        return lista_facturas;
    }

    public void setLista_facturas(ArrayList<Factura> lista_facturas) {
        this.lista_facturas = lista_facturas;
    }

    @Override
    public String toString() {
        return "Comprador{" + "lista_facturas=" + lista_facturas + '}';
    }
    
    
    
}
