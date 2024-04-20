public class telefono extends Atributos implements  Metodos{
    private String numTelefono;

   public telefono(){}

    @Override
    public float obtenerPrecioA() {
        return 0;
    }


    public telefono(String nombre, String modelo, String codigo, float precio, String descripcion, String numTelefono) {
        super(nombre, modelo, codigo, precio, descripcion);
        this.numTelefono = numTelefono;
    }


    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;

    }
}
