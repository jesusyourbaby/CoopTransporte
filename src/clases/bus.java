
package clases;

/**
 *
 * @author user
 */
public class bus {
    
    public int numero;
    boletos[] asientos = new boletos[50];

    public bus(int numero) {
        this.numero = numero;
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
    
    
    
    
}


