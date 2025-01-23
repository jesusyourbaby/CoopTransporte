
package clases;

public class bus {
    
    public int numero;
    public String ruta;
    public String estado;

    public bus(int numero, String ruta) {
        this.numero = numero;
        this.ruta = ruta;
        this.estado = "disponible";
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
}


