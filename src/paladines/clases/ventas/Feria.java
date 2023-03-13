
package paladines.clases.ventas;


public class Feria {
    
    private String codigo_fer;
    private String nombre_fer;
    private String fecha_inicio;
    private String fecha_fin;
    private String hora_inicio;
    private String hora_fin;
    private String Ubicacion;
    private double precio_inscripcion;
    private String capacidad;
    private String animales_disponibles;

    public Feria(String codigo_fer, String nombre_fer, String fecha_inicio, String fecha_fin, String hora_inicio, String hora_fin, String Ubicacion, double precio_inscripcion, String capacidad, String animales_disponibles) {
        this.codigo_fer = codigo_fer;
        this.nombre_fer = nombre_fer;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.Ubicacion = Ubicacion;
        this.precio_inscripcion = precio_inscripcion;
        this.capacidad = capacidad;
        this.animales_disponibles = animales_disponibles;
    }

    public Feria() {
        super();
    }

    public String getCodigo_fer() {
        return codigo_fer;
    }

    public void setCodigo_fer(String codigo_fer) {
        this.codigo_fer = codigo_fer;
    }

    public String getNombre_fer() {
        return nombre_fer;
    }

    public void setNombre_fer(String nombre_fer) {
        this.nombre_fer = nombre_fer;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public double getPrecio_inscripcion() {
        return precio_inscripcion;
    }

    public void setPrecio_inscripcion(double precio_inscripcion) {
        this.precio_inscripcion = precio_inscripcion;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getAnimales_disponibles() {
        return animales_disponibles;
    }

    public void setAnimales_disponibles(String animales_disponibles) {
        this.animales_disponibles = animales_disponibles;
    }

    @Override
    public String toString() {
        return "Feria{" + "codigo_fer=" + codigo_fer + ", nombre_fer=" + nombre_fer + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + ", hora_inicio=" + hora_inicio + ", hora_fin=" + hora_fin + ", Ubicacion=" + Ubicacion + ", precio_inscripcion=" + precio_inscripcion + ", capacidad=" + capacidad + ", animales_disponibles=" + animales_disponibles + '}';
    }
    
}
