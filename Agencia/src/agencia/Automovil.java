package agencia;

/**
 *
 * @author Hugo
 */
public class Automovil extends Auto {
    protected int CPasajeros;
    
    public Automovil(int CPasajeros, int NoSerie, String Marca, int Año, double Precio) {
        super(NoSerie, Marca, Año, Precio);
        this.CPasajeros = CPasajeros;
    }

    public int getCPasajeros() {
        return CPasajeros;
    }

    public void setCPasajeros(int CPasajeros) {
        this.CPasajeros = CPasajeros;
    }

    @Override
    public String toString() {
        return  super.toString() +  "CPasajeros=" + CPasajeros + '}';
    }
    
}
