package agencia;

/**
 *
 * @author Hugo
 */
public class AutoLujo extends Automovil {
    public AutoLujo(int CPasajeros, int NoSerie, String Marca, int Año, double Precio) {
        super(CPasajeros,NoSerie, Marca, Año, Precio);
    }

    @Override
    public String toString() {
        return "AutoLujo{" + super.toString() ;
    }

}
