package clases;


public class boletos {
    
    public int asiento;
    public String disponible;

    public boletos(int numero) {
        this.asiento = numero;
        this.disponible = "disponible";
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "boletos{" + "asiento=" + asiento + ", disponible=" + disponible + '}';
    }
    
}
