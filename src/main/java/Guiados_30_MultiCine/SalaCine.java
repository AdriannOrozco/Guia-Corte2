package Guiados_30_MultiCine;

public class SalaCine {

    int Aforo;
    int Ocupadas;
    String Pelicula;
    double Entrada;

    public SalaCine() {
        Aforo = 100;
        Ocupadas = 0;
        Pelicula = "";
        Entrada = 5.0;
    }

    public void setAforo(int afo) {
        Aforo = afo;
    }

    public void setOcupadas(int ocu) {
        Ocupadas = ocu;
    }

    public void setPelicula(String peli) {
        Pelicula = peli;
    }

    public void setEntrada(double entra) {
        Entrada = entra;
    }

    public void setLibres(int lib) {
        int ocu;
        ocu = Aforo - lib;
        Ocupadas = ocu;
    }

    public int getAforo() {
        return Aforo;
    }

    public int getOcupadas() {
        return Ocupadas;
    }

    public String getPelicula() {
        return Pelicula;
    }

    public double getEntrada() {
        return Entrada;
    }

    public int getLibres() {
        int lib;
        lib = Aforo - Ocupadas;
        return lib;
    }

    //Método getPorcentaje
    public double getPorcentaje() {
        double por;
        por = (double) Ocupadas / (double) Aforo * 100.0;
        return por;
    }

    public double getIngresos() {
        double ingre;
        ingre = Ocupadas * Entrada;
        return ingre;
    }

    public void Vaciar() {
        Ocupadas = 0;
        Pelicula = "";
    }

    public void entraUno() {
        Ocupadas++;
    }

}
