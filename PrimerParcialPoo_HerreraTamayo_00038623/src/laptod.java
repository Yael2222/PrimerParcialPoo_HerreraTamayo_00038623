public class laptod extends Atributos implements Metodos{
    private  String nombreMouse;



    public laptod(String nombre, String modelo, String codigo, float precio, String descripcion, String nombreMouse) {
        super(nombre, modelo, codigo, precio, descripcion);
        this.nombreMouse = nombreMouse;
    }

    public String getNombreMouse() {
        return nombreMouse;
    }

    public void setNombreMouse(String nombreMouse) {
        this.nombreMouse = nombreMouse;
    }


    @Override
    public float obtenerPrecioA() {
        return 0;
    }
}
