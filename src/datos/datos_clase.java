package datos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class datos_clase {
    /**
     * Método para verificar o crear un archivo.
     */
    public void verificarOCrearArchivo(String nombreArchivo, String contenidoInicial) {
        File archivo = new File(nombreArchivo);
        File carpeta = archivo.getParentFile(); // Obtener la carpeta del archivo

        // Crear la carpeta si no existe
        if (carpeta != null && !carpeta.exists()) {
            carpeta.mkdirs(); // Crear todas las carpetas necesarias
        }

        // Verificar si el archivo ya existe
        if (!archivo.exists()) {
            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado: " + nombreArchivo);
                    if (contenidoInicial != null && !contenidoInicial.isEmpty()) {
                        try (FileWriter escritor = new FileWriter(archivo)) {
                            escritor.write(contenidoInicial);
                        }
                    }
                }
            } catch (IOException e) {
                System.err.println("Ocurrió un error al crear el archivo: " + nombreArchivo);
                e.printStackTrace();
            }
        } else {
            System.out.println("El archivo ya existe: " + nombreArchivo);
        }
    }
}
