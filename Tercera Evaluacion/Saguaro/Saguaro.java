import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;


public class Saguaro {
    
    public static void main(String[] args) {
        //archivos que vamos a usar
        File archivo = new File("SAC_DeepSky_Ver81_QCQ.TXT");
        File binario = new File("SAC.bin");
        
        try {

            String[] array;

            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();

            FileOutputStream fos = new FileOutputStream(binario);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            while(linea != null) {
                String lineas = linea.replaceAll("\"", "");
                array = lineas.split(",");

                if (lineas.contains("GALXY") ) {

                    String test = array[0].replaceAll(" ", "");
                    Datos a = new Datos(test, array[3], array[4], array[5], array[6]);

                    oos.writeObject(a);
                }
                linea = br.readLine();
            }
            fr.close();
            br.close();

            fos.close();
            oos.close();

            } catch(IOException e) {
            e.printStackTrace();
        }
    }
}