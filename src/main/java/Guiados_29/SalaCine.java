package guiados_29;

public class SalaCine {
    public static void SalaCine(String[] args) {
        // Creación de una sala de cine con valores por defecto
        SalaCine sala1 = new SalaCine();
}

    class SalaCineClase {
    private int aforo;
    private int ocupadas;
    private String pelicula;
    private double entrada;

    public SalaCineClase() {
        aforo = 100;
        ocupadas = 0;
        pelicula = "";
        entrada = 5.0;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public void setOcupadas(int ocupadas) {
        this.ocupadas = ocupadas;
    }

    public void setLibres(int libres) {
        this.ocupadas = this.aforo - libres;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public int getAforo() {
        return aforo;
    }

    public int getOcupadas() {
        return ocupadas;
    }

    public int getLibres() {
        return aforo - ocupadas;
    }

    public double getPorcentaje() {
        return ((double) ocupadas / aforo) * 100;
    }

    public double getIngresos() {
        return ocupadas * entrada;
    }

    public String getPelicula() {
        return pelicula;
    }

    public double getEntrada() {
        return entrada;
    }

    public void vaciar() {
        this.ocupadas = 0;
        this.pelicula = "";
    }

    public void entraUno() {
        if (ocupadas < aforo) {
            ocupadas++;
        } else {
            System.out.println("La sala está llena.");
        }
    }
    }
}