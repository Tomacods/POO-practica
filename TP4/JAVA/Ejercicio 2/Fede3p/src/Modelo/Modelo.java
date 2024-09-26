package Modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Modelo{

    public void copiarArchivo(File origen, File destino) throws IOException{
        try (FileInputStream fis = new FileInputStream(origen);
            FileOutputStream fos = new FileOutputStream(destino)) {
                byte[] buffer = new byte[1024];
                Integer longitud;
                while ((longitud = fis.read(buffer)) > 0){
                    fos.write(buffer, 0, longitud);
                }
            }
    }
}