package UsingCalesthenics.Exercise18;

public class Serie implements Entregable{
    private static final String TITULO_DEFAULT = "";
    private static final int NUM_TEMPORADAS_DEFAULT = 3;
    private static final boolean ISENTREGADO_DEFAULT = false;
    private static final String GENERO_DEFAULT = "";
    private static final String CREADOR_DEFAULT = "";


    private String titulo = TITULO_DEFAULT;
    private int numTemporadas = NUM_TEMPORADAS_DEFAULT;
    private boolean isEntregado = ISENTREGADO_DEFAULT;
    private String genero = GENERO_DEFAULT;
    private String creador = CREADOR_DEFAULT;

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numTemporadas=" + numTemporadas +
                ", isEntregado=" + isEntregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
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
        Serie serie = (Serie) a;
        if (this.numTemporadas > serie.getNumTemporadas()) {
            return 1;
        }
        return comparaMenorIgual(serie);
    }


    public int comparaMenorIgual(Object a) {
        Serie serie = (Serie) a;
        if (this.numTemporadas < serie.getNumTemporadas()) {
            return -1;
        }
        return 0;
    }
}
