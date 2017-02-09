package model;


public class Vehiculo {
    private int id;
    private String tipo;
    private String marca;
    private int modelo;
    private int ruedas;

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", ruedas=" + ruedas +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
}
