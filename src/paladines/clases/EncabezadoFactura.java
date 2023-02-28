package paladines.clases;

import java.util.Date;

/**
 *
 * @author Zhunio Miguel
 */
public class EncabezadoFactura {
    private String codigo_fac;
    private Comprador comprador;
    private Date Fecha_emision;
    private double total;
    private double subtotal;
    private double iva;

    public EncabezadoFactura() {
        
    }

    public EncabezadoFactura(String codigo_fac, Comprador comprador, Date Fecha_emision, double total, double subtotal, double iva) {
        this.codigo_fac = codigo_fac;
        this.comprador = comprador;
        this.Fecha_emision = Fecha_emision;
        this.total = total;
        this.subtotal = subtotal;
        this.iva = iva;
    }

    public String getCodigo_fac() {
        return codigo_fac;
    }

    public void setCodigo_fac(String codigo_fac) {
        this.codigo_fac = codigo_fac;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Date getFecha_emision() {
        return Fecha_emision;
    }

    public void setFecha_emision(Date Fecha_emision) {
        this.Fecha_emision = Fecha_emision;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "EncabezadoFactura{" + "codigo_fac=" + codigo_fac + ", comprador=" + comprador + ", Fecha_emision=" + Fecha_emision + ", total=" + total + ", subtotal=" + subtotal + ", iva=" + iva + '}';
    }
    
    
}
