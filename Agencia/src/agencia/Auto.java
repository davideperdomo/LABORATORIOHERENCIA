package agencia;

/**
 *
 * @author Hugo
 */


public class Auto {
    protected int NoSerie;
    protected String Marca;
    protected int Año;
    protected double Precio;
    
    public Auto (int NoSerie, String Marca, int Año, double Precio){
        this.Año = Año;
        this.NoSerie = NoSerie;
        this.Precio = Precio;
        this.Marca = Marca;
    }

    public int getNoSerie() {
        return NoSerie;
    }

    public String getMarca() {
        return Marca;
    }

    public int getAño() {
        return Año;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setNoSerie(int NoSerie) {
        this.NoSerie = NoSerie;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return " tiene motor con numero de serie=" + NoSerie + ", Marca="
                + Marca + ",del A\u00f1o=" + Año + ", Precio= " + Precio + "$ " ;
    }
    
}
