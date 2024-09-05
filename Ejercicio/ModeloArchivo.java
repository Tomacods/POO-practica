// package Ejercicio;



// import java.io.File;
// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.StandardCopyOption;

// public class ModeloArchivo {
// 	private File archivoSeleccionado;
// 	private File ubicacionDestino;

// 	public void seleccionarArchivo(File archivo) {
// 		this.archivoSeleccionado = archivo;
// 	}

// 	public void seleccionarUbicacionDestino(File ubicacion) {
// 		this.ubicacionDestino = ubicacion;
// 	}

// 	public void copiarArchivo() throws IOException {
// 		if (archivoSeleccionado != null && ubicacionDestino != null) {
// 			Path destino = new File(ubicacionDestino, archivoSeleccionado.getName()).toPath();
// 			Files.copy(archivoSeleccionado.toPath(), destino, StandardCopyOption.REPLACE_EXISTING);
// 		} else {
// 			throw new IOException("Archivo o ubicación de destino no seleccionados");
// 		}
// 	}
// }
