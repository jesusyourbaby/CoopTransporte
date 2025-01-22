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
    private String apellidoPasajero;
    private String rutaDestino;
    private String numeroAsiento;
    private String numeroBus;
    private String fechaViaje;
    private String horaViaje;
    private String precioBoleto;

    public venta(String nombrePasajero, String apellidoPasajero, String rutaDestino, String numeroAsiento, String numeroBus, String fechaViaje, String horaViaje, String precioBoleto) {
        this.nombrePasajero = nombrePasajero;
        this.apellidoPasajero = apellidoPasajero;
        this.rutaDestino = rutaDestino;
        this.numeroAsiento = numeroAsiento;
        this.numeroBus = numeroBus;
        this.fechaViaje = fechaViaje;
        this.horaViaje = horaViaje;
        this.precioBoleto = precioBoleto;
    }

    
    
    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public String getApellidoPasajero() {
        return apellidoPasajero;
    }

    public void setApellidoPasajero(String apellidoPasajero) {
        this.apellidoPasajero = apellidoPasajero;
    }

    public String getRutaDestino() {
        return rutaDestino;
    }

    public void setRutaDestino(String rutaDestino) {
        this.rutaDestino = rutaDestino;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getNumeroBus() {
        return numeroBus;
    }

    public void setNumeroBus(String numeroBus) {
        this.numeroBus = numeroBus;
    }

    public String getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(String fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public String getHoraViaje() {
        return horaViaje;
    }

    public void setHoraViaje(String horaViaje) {
        this.horaViaje = horaViaje;
    }

    public String getPrecioBoleto() {
        return precioBoleto;
    }

    public void setPrecioBoleto(String precioBoleto) {
        this.precioBoleto = precioBoleto;
    }

    
    /**
     * Método para guardar los datos de la venta en un archivo.
     */
}
