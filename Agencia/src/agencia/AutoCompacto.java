package agencia;

/**
 *
 * @author Hugo
 */
public class AutoCompacto extends Automovil {
    
    public AutoCompacto(int CPasajeros, int NoSerie, String Marca, int Año, double Precio) {
        super(CPasajeros, NoSerie, Marca, Año, Precio);
    }


    @Override
    public String toString() {
        return "AutoCompacto{" + super.toString() ;
    }
    
}
