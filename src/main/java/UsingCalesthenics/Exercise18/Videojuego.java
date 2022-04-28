package UsingCalesthenics.Exercise18;

public class Videojuego implements Entregable {
    private static final String TITULO_DEFAULT = "";
    private static final int HORAS_ESTIMADAS_DEFAULT = 10;
    private static final boolean ISENTREGADO_DEFAULT = false;
    private static final String GENERO_DEFAULT = "";
    private static final String COMPANIA_DEFAULT = "";


    private String titulo = TITULO_DEFAULT;
    private int horasEstimadas = HORAS_ESTIMADAS_DEFAULT;
    private boolean isEntregado = ISENTREGADO_DEFAULT;
    private String genero = GENERO_DEFAULT;
    private String compania = COMPANIA_DEFAULT;

    public Videojuego() {
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", isEntregado=" + isEntregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.isEntregado = true;
    }

    @Override
    public void devolver() {
        this.isEntregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.isEntregado;
    }

    @Override
    public int compareTo(Object a) {
        Videojuego videojuego = (Videojuego) a;
        if (this.horasEstimadas > videojuego.getHorasEstimadas()) {
            return 1;
        }
        return comparaMenorIgual(videojuego);
    }


    public int comparaMenorIgual(Object a) {
        Videojuego videojuego = (Videojuego) a;
        if (this.horasEstimadas < videojuego.getHorasEstimadas()) {
            return -1;
        }
        return 0;
    }
}
