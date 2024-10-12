import java.io.File;
public class Modelo { //MODELO --> logica de los datos
    //https://oregoom.com/java/archivos/
    //https://docs.oracle.com/javase/8/docs/api/java/io/File.html

    public boolean moverArchivo (File archivo, File carpeta){
        if (carpeta.isDirectory()){
            String archivoString = archivo.getName();
            File mover = new File(carpeta, archivoString);
            return archivo.renameTo(mover); // renameTo: rnames the file denoted by this abstract pathname.
                                            // renombra el archivo o directorio representado por el objeto File a la ubicación especificada por el argumento destino
        }
        return false;
        }


    }


    

