/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Jesus
 */
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
}