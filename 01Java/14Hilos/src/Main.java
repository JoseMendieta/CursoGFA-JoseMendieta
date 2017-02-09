/**
 * Created by ERP06 on 16/01/2017.
 */
public class Main {

    public static void main (String []args){
        for(int i = 0; i<5; i++){
            HiloNuevo h = new HiloNuevo(i+1);
            Thread t = new Thread(h);
            t.start();
        }
    }
}
