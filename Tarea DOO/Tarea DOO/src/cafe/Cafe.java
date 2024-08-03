package cafe;

import ingrediente.Ingrediente;

import java.util.List;

public abstract class Cafe {
    private String nombre;
    private int tamano;
    private double precio;

    List<Ingrediente> ingredientes;


    public Cafe(String nombre, int tamano, int precio, List<Ingrediente> ingredientes){
        this.ingredientes = ingredientes;
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract void    preparar();

    public abstract void servir();


}