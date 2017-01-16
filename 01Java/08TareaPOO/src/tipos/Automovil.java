package tipos;

import moviles.Carreras;
import moviles.Vehiculo;

public class Automovil extends Vehiculo implements Carreras {
    public Automovil(int id, int tipo, String marca, int modelo, int ruedas) {
        super(id, tipo, marca, modelo, ruedas);
    }


    public void presentar(String registro) {
        System.out.println("Metodo Presentar");
    }

    @Override
    public void rodar(){
        System.out.println("Metodo Rodar" + super.getRuedas());
    };

    @Override
    public void correr() {
        System.out.println("Metodo Correr");
    }

    @Override
    public void kilometraje() {
        System.out.println("Metodo Kilometraje");
    }


}
