package paladines.clases;

/**
 *
 * @author Zhunio Miguel
 */
public class DetalleFactura {
    private String id_fac;
    private int cantidad;
    private Ganado ganado_vendido;
    private double valor;

    public DetalleFactura() {
        
    }

    public DetalleFactura(String id_fac, int cantidad, Ganado ganado_vendido, double valor) {
        this.id_fac = id_fac;
        this.cantidad = cantidad;
        this.ganado_vendido = ganado_vendido;
        this.valor = valor;
    }

    public String getId_fac() {
        return id_fac;
    }

    public void setId_fac(String id_fac) {
        this.id_fac = id_fac;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Ganado getGanado_vendido() {
        return ganado_vendido;
    }

    public void setGanado_vendido(Ganado ganado_vendido) {
        this.ganado_vendido = ganado_vendido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "id_fac=" + id_fac + ", cantidad=" + cantidad + ", ganado_vendido=" + ganado_vendido + ", valor=" + valor + '}';
    }
    
    
}
