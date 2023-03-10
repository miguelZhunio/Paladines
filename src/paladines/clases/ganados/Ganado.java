package paladines.clases.ganados;

import java.util.ArrayList;

/**
 *
 * @author Zhunio MIguel
 */
class Ganado { 
  private String CodigoProd;
   private String Tipo;
   private String Peso;
   private String Edad;
   private String Sexo;
   private String Tamaño;
   private String Cabezas;
   private String Apareamiento;
   private String Precio;
   
   ArrayList<String>listTipo= new ArrayList<>();
    public Ganado() {
    }

    public Ganado(String CodigoProd, String Tipo, String Peso, String Edad, String Sexo, String Tamaño, String Cabezas, String Apareamiento, String Precio) {
        this.CodigoProd = CodigoProd;
        this.Tipo = Tipo;
        this.Peso = Peso;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Tamaño = Tamaño;
        this.Cabezas = Cabezas;
        this.Apareamiento = Apareamiento;
        this.Precio = Precio;
    }

    /**
     * @return the CodigoProd
     */
    public String getCodigoProd() {
        return CodigoProd;
    }

    /**
     * @param CodigoProd the CodigoProd to set
     */
    public void setCodigoProd(String CodigoProd) {
        this.CodigoProd = CodigoProd;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the Peso
     */
    public String getPeso() {
        return Peso;
    }

    /**
     * @param Peso the Peso to set
     */
    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    /**
     * @return the Edad
     */
    public String getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    /**
     * @return the Sexo
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    /**
     * @return the Tamaño
     */
    public String getTamaño() {
        return Tamaño;
    }

    /**
     * @param Tamaño the Tamaño to set
     */
    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    /**
     * @return the Cabezas
     */
    public String getCabezas() {
        return Cabezas;
    }

    /**
     * @param Cabezas the Cabezas to set
     */
    public void setCabezas(String Cabezas) {
        this.Cabezas = Cabezas;
    }

    /**
     * @return the Apareamiento
     */
    public String getApareamiento() {
        return Apareamiento;
    }

    /**
     * @param Apareamiento the Apareamiento to set
     */
    public void setApareamiento(String Apareamiento) {
        this.Apareamiento = Apareamiento;
    }

    /**
     * @return the Precio
     */
    public String getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Caracteristicas{" + "CodigoProd=" + CodigoProd + ", Tipo=" + Tipo + ", Peso=" + Peso + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Tama\u00f1o=" + Tamaño + ", Cabezas=" + Cabezas + ", Apareamiento=" + Apareamiento + ", Precio=" + Precio + '}';
    }
   public void Tipo(){
       listTipo.add("BOVINO"+
               "CAPRINO"+
               "EQUINO"+
               "OVINO"+
               "PORCINO");
   }  
}