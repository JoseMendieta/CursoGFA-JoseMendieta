
public class HiloNuevo implements Runnable {
    int id;
    public HiloNuevo(int id){
        this.id=id;
    }

    @Override
    public void run() {
        System.out.println("Inicio del Hilo 3 Seg. ID: " + id);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin del Hilo 3 Seg. ID: " + id);
    }
}
