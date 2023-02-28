package paladines.clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Comprador extends Persona{
    private int Compras;
    private double saldo;
    private double descuento;

    public Comprador() {
        super();
    }

    public Comprador(int Compras, double saldo, double descuento) {
        this.Compras = Compras;
        this.saldo = saldo;
        this.descuento = descuento;
    }

    public Comprador(int Compras, double saldo, double descuento, String cedula, String nombre, String apellido, String telefono, char Sexo, String correo, int edad, String password) {
        super(cedula, nombre, apellido, telefono, Sexo, correo, edad, password);
        this.Compras = Compras;
        this.saldo = saldo;
        this.descuento = descuento;
    }

    public int getCompras() {
        return Compras;
    }

    public void setCompras(int Compras) {
        this.Compras = Compras;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Comprador{" + "Compras=" + Compras + ", saldo=" + saldo + ", descuento=" + descuento + '}';
    }
 
}
