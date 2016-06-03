package agencia;

/**
 *
 * @author Hugo
 */
public class Camioneta extends Auto {
    private double CapCarg;
    private int NoEjes;
    private int NoRodadas;

    public Camioneta(double CapCarg, int NoEjes, int NoRodadas, int NoSerie, String Marca, int Año, double Precio) {
        super(NoSerie, Marca, Año, Precio);
        this.CapCarg = CapCarg;
        this.NoEjes = NoEjes;
        this.NoRodadas = NoRodadas;
    }

    public double getCapCarg() {
        return CapCarg;
    }

    public int getNoEjes() {
        return NoEjes;
    }

    public int getNoRodadas() {
        return NoRodadas;
    }

    public void setCapCarg(double CapCarg) {
        this.CapCarg = CapCarg;
    }

    public void setNoEjes(int NoEjes) {
        this.NoEjes = NoEjes;
    }

    public void setNoRodadas(int NoRodadas) {
        this.NoRodadas = NoRodadas;
    }
    
    @Override
    public String toString() {
        return "El vehiculo es una Camioneta" + super.toString() +
                "Tiene una Capacidad de Carga de= " + CapCarg + ", Tiene " + 
                NoEjes + " ejes y " + NoRodadas + " Rodadas";
    }
    
    
}
