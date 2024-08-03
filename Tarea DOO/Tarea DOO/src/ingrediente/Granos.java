package ingrediente;

public class Granos  implements Ingrediente {

    private String nombre;
    private String tipo;
    private int cantidad;

    public Granos(String nombre, String tipo, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getCantidad() {
        return this.getCantidad();
    }
}