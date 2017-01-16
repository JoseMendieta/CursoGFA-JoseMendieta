package moviles;

public abstract class Vehiculo {

    private String marca;
    private int id,tipo,modelo,ruedas;

    public Vehiculo(int id, int tipo, String marca, int modelo, int ruedas){
        this.id = id;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.ruedas = ruedas;
    }

    public Vehiculo(String completo){
        String[] nC = completo.split(" - ");
        this.id = Integer.parseInt(nC[0]);
        this.tipo = Integer.parseInt(nC[1]);
        this.marca = nC[2];
        this.modelo = Integer.parseInt(nC[3]);
        this.ruedas = Integer.parseInt(nC[4]);
    }

    public void presentar(){
        System.out.println("Metodo Presentar");
    }

    public void rodar(){
        System.out.println("Metodo Rodar");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
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
