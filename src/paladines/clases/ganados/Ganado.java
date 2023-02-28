package paladines.clases.ganados;

/**
 *
 * @author Zhunio MIguel
 */
class Ganado {
    private String codigo;
    private int edad;
    private char sexo;
    private int apariamientos;
    private double size;
    private double peso;
    private double precio;
    private String raza;

    public Ganado() {
        
    }

    public Ganado(String codigo, int edad, char sexo, int apariamientos, double size, double peso, double precio, String raza) {
        this.codigo = codigo;
        this.edad = edad;
        this.sexo = sexo;
        this.apariamientos = apariamientos;
        this.size = size;
        this.peso = peso;
        this.precio = precio;
        this.raza = raza;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getApariamientos() {
        return apariamientos;
    }

    public void setApariamientos(int apariamientos) {
        this.apariamientos = apariamientos;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Ganado{" + "codigo=" + codigo + ", edad=" + edad + ", sexo=" + sexo + ", apariamientos=" + apariamientos + ", size=" + size + ", peso=" + peso + ", precio=" + precio + ", raza=" + raza + '}';
    }
    
    
    
}
