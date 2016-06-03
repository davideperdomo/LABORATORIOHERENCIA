package agencia;

/**
 *
 * @author Hugo
 */
public class Vagoneta extends Automovil {

    public Vagoneta(int CPasajeros, int NoSerie, String Marca, int Año, double Precio) {
        super(CPasajeros, NoSerie, Marca, Año, Precio);
        }

    @Override
    public String toString() {
        return "Vagoneta{" + super.toString();
    }
    
}
