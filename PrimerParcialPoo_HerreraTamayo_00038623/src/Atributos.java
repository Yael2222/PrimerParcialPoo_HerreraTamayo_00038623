public abstract class Atributos {
    private String nombre;
    private String modelo;
    private String codigo; //codigo lo considero como un atributo personalizado
    private float precio;

    private String descripcion;



    public Atributos(){}

    public Atributos(String nombre, String modelo, String codigo, float precio, String descripcion) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
    }
 public abstract float obtenerPrecioA();
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
