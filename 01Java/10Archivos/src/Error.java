import java.io.*;
import java.util.Date;

public class Error implements Escribible{
    private long timestamp;
    private int codigoError;
    private String description;

    public Error(){};

    public Error(int codigoError, String description) {
        this.timestamp = new Date().getTime();
        this.codigoError = codigoError;
        this.description = description;
    }

    @Override
    public String toString() {
        return timestamp + " | " + codigoError + " | " + description + "\n";
    }

    /*@Override
    public void escribir(String url) {
        FileWriter fw;
        try{
            fw = new FileWriter(url, true);
            String linea = timestamp + " | " + codigoError + " | " + description + "\n";
            fw.append(linea);
            fw.close();
        }

        catch (IOException ex){
            System.out.println("El archivo no existe");
        }
    }*/

    @Override
    public void escribir(String url){
        try {
            FileOutputStream fO = new FileOutputStream(url, true);
            OutputStreamWriter oS = new OutputStreamWriter(fO, "UTF-8");
            BufferedWriter bW = new BufferedWriter(oS);

            String linea = timestamp + " - " + codigoError + " - " + description + "\n";
            bW.write(linea);
            bW.close();

        }catch(FileNotFoundException ex){
            System.out.println("Archivo no Encontrado");
        }catch (UnsupportedEncodingException ex){
            System.out.println("Tipo de Codificacion No Soportada");
        } catch (IOException e) {
            System.out.println("Error de IO");
        }catch (Exception ex){
            System.out.println("Otro Error");
        }
    }

    @Override
    public Escribible leer(String url, long timestamp) {
        try{
            FileReader fR = new FileReader(url);
            BufferedReader bR = new BufferedReader(fR);
            String linea;
            while ((linea=bR.readLine())!= null){
                String[] sl = linea.split("-");
                System.out.println(sl[0].trim());
                if(Long.parseLong(sl[0].trim())==timestamp){
                    this.timestamp = timestamp;
                    this.codigoError = Integer.parseInt(sl[1].trim());
                    this.description= sl[2].trim();
                    return this;
                }
            }
        }catch (FileNotFoundException ex){
            System.out.println("Archivo no encontrado");
        }catch(IOException ex){
            System.out.println("Error IO");
        }
        return null;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
