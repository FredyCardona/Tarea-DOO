package ingrediente;

public class Agua implements Ingrediente {

    private String nombre;
    private int cantidad;

    public Agua(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return this.cantidad;
    }
}