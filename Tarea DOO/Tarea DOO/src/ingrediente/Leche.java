package ingrediente;

public class Leche  implements Ingrediente {
    private String nombre;
    private String tipo;
    private int cantidad;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Leche(String nombre, String tipo, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String getNombre() {
        return this.getNombre();
    }

    @Override
    public int getCantidad() {
        return this.getCantidad();
    }

}