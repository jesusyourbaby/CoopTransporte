
package clases;

public class bus {
    
    public int numero;
    public String estado;
    boletos[] asientos = new boletos[50];

    public bus(int numero) {
        this.numero = numero;
        this.estado = "disponible";
        for (int i = 0; i < asientos.length; i++) {
            asientos[i] = new boletos(i+1);
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boletos[] getAsientos() {
        return asientos;
    }

    public void setAsientos(boletos[] asientos) {
        this.asientos = asientos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
}


