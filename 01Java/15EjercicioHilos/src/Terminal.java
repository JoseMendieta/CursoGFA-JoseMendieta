/**
 * Created by ERP06 on 17/01/2017.
 */
public class Terminal implements Runnable {

    private Autobus autobus;
    private long tiempoInicial;
    private static String [] mensajes = {"Ascenso", "Espera", "Descenso"};

    public Terminal(Autobus autobus, long tiempoInicial) {
        this.autobus = autobus;
        this.tiempoInicial = tiempoInicial;
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public long getTiempoInicial() {
        return tiempoInicial;
    }

    public void setTiempoInicial(long tiempoInicial) {
        this.tiempoInicial = tiempoInicial;
    }

    @Override
    public void run() {
        System.out.println("Autobus con el numero: "
        + autobus.getNumero()+ " se comenzó en el tiempo: "
        + ((System.currentTimeMillis()-tiempoInicial)/1000));

        for (int i = 0; i<autobus.getTiempos().length;i++){
            esperarSegundos(autobus.getTiempos()[i]);
            System.out.println(mensajes[i] + " : " + autobus.getNumero() + " | tiempo: " +
                    ((System.currentTimeMillis() - tiempoInicial)/1000));
        }

        System.out.println("El autobus con el numero " + autobus.getNumero()
        + " partió a su destino " + autobus.getDestino());
    }

    private void esperarSegundos(int seg){
        try {
            Thread.sleep(seg*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
