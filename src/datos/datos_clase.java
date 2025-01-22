package datos;

import clases.bus;
import clases.venta;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class datos_clase {
    /**
     * Método para verificar o crear un archivo.
     */
    public void verificarOCrearArchivo(String nombreArchivo) {
        File archivo = new File("datos/"+nombreArchivo+".csv");
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
                }
            } catch (IOException e) {
                System.err.println("Ocurrió un error al crear el archivo: " + nombreArchivo);
                e.printStackTrace();
            }
        } else {
            System.out.println("El archivo ya existe: " + nombreArchivo);
        }
    }
    
    public boolean guardarVentaBusCSV(bus bus) {
        
        if (existeBusEnArchivo(bus.getNumero(), "datos/buses.csv")) {
            return false; // Evita la duplicación
        }
        
        // Definir el archivo CSV donde se guardarán las ventas
        String archivo = "datos/buses.csv";
        
        try {
            // Crear un objeto FileWriter para abrir el archivo en modo de adición
            FileWriter writer = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(writer);
            
            // Escribir los datos de la venta en formato CSV (sin comillas)
            String linea = bus.getNumero() + "," +
                           bus.getEstado();
            
            // Escribir la línea en el archivo
            buffer.write(linea);
            buffer.newLine();  // Nueva línea para la siguiente venta
            
            // Cerrar el buffer y el escritor
            buffer.close();
            
            try {
                // Crear un objeto FileWriter para abrir el archivo en modo de adición
                FileWriter writerB = new FileWriter("datos/boletos.csv", true);
                BufferedWriter bufferB = new BufferedWriter(writerB);
                System.out.println(bus.getAsientos().length);
                for(int i = 0; i < bus.getAsientos().length ; i++ ) {
                    String lineaB = bus.getNumero() + "," +
                               bus.getAsientos()[i].getAsiento() + ","+
                                bus.getAsientos()[i].getDisponible();
                    bufferB.write(lineaB);
                    bufferB.newLine();  // Nueva línea para la siguiente venta

                }

                bufferB.close();
                
                return true;

            } catch (IOException e) {
                // Manejar errores al escribir en el archivo
                return false;
            }
            
        } catch (IOException e) {
            // Manejar errores al escribir en el archivo
            return false;
        }
    } 
    
    private boolean existeBusEnArchivo(int numeroBus, String archivo) {
    try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(","); // Suponiendo que el número de bus es la primera columna
            if (datos.length > 0 && Integer.parseInt(datos[0]) == numeroBus) {
                return true; // Ya existe el bus
            }
        }
    } catch (IOException e) {
        System.err.println("Error al leer el archivo: " + e.getMessage());
    }
    return false; // No se encontró el bus
}
}
