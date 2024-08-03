package cafe;

import ingrediente.Ingrediente;

import java.util.List;

public class CafeColombiano extends Cafe {

    private String tipoGrano;

    public CafeColombiano(String nombre, int tamano, int precio, String tipoGrano , List<Ingrediente> ingredientes) {
        super(nombre, tamano, precio, ingredientes);
        this.tipoGrano = tipoGrano;
    }

    public String getTipoGrano() {
        return tipoGrano;
    }

    public void setTipoGrano(String tipoGrano) {
        this.tipoGrano = tipoGrano;
    }

    @Override
    public void preparar() {
        System.out.println("Se prepara un Cafe Colombiano");

    }



    @Override
    public void servir() {
        System.out.println("Se sirve un  Cafe Colombiano");
    }
}