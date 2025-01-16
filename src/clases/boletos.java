
package clases;


public class boletos {
    
    public int asiento;
    public boolean disponible;

    public boletos(int numero) {
        this.asiento = numero;
        this.disponible = true;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "boletos{" + "asiento=" + asiento + ", disponible=" + disponible + '}';
    }
    
}
