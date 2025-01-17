/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Jesus
 */
import java.io.FileWriter;
import java.io.IOException;

public class venta {
    // Atributos
    private String nombrePasajero;
    private int numeroAsiento;
    private String rutaDestino;
    private String fechaHoraViaje;
    private double precioBoleto;
    private int numeroBus;

    // Constructor
    public venta(String nombrePasajero, int numeroAsiento, String rutaDestino, String fechaHoraViaje, double precioBoleto, int numeroBus) {
        this.nombrePasajero = nombrePasajero;
        this.numeroAsiento = numeroAsiento;
        this.rutaDestino = rutaDestino;
        this.fechaHoraViaje = fechaHoraViaje;
        this.precioBoleto = precioBoleto;
        this.numeroBus = numeroBus;
    }

    // Getters y Setters
    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getRutaDestino() {
        return rutaDestino;
    }

    public void setRutaDestino(String rutaDestino) {
        this.rutaDestino = rutaDestino;
    }

    public String getFechaHoraViaje() {
        return fechaHoraViaje;
    }

    public void setFechaHoraViaje(String fechaHoraViaje) {
        this.fechaHoraViaje = fechaHoraViaje;
    }

    public double getPrecioBoleto() {
        return precioBoleto;
    }

    public void setPrecioBoleto(double precioBoleto) {
        this.precioBoleto = precioBoleto;
    }

    public int getNumeroBus() {
        return numeroBus;
    }

    public void setNumeroBus(int numeroBus) {
        this.numeroBus = numeroBus;
    }

    /**
     * Método para guardar los datos de la venta en un archivo.
     */
    public void guardarVentaEnArchivo(String nombreArchivo) {
        try (FileWriter escritor = new FileWriter(nombreArchivo, true)) {
            // Crear el registro de la venta
            String registro = String.format(
                "Nombre: %s, Asiento: %d, Ruta: %s, Fecha y Hora: %s, Precio: %.2f, Bus: %d\n",
                nombrePasajero, numeroAsiento, rutaDestino, fechaHoraViaje, precioBoleto, numeroBus
            );

            // Escribir el registro en el archivo
            escritor.write(registro);
            System.out.println("Venta guardada en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar la venta en el archivo: " + nombreArchivo);
            e.printStackTrace();
        }
    }
}
