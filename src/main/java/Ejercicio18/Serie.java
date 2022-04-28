package Ejercicio18;

public class Serie implements Entregable{
    //variables estaticas para el compareTo
    public final static int mayor = 1;
    public final static int menor = -1;
    public final static int igual = 0;

    //atributos por defecto
    private final static String tituloDefault = "";
    private final static int numeroTemporadasDefault = 3;
    private final static boolean entregadoDefault = false;
    private final static String generoDefault = "";
    private final static String creadorDefault = "";

    //atributos
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    //constructores


    public Serie() {
        this.titulo = tituloDefault;
        this.numeroTemporadas=numeroTemporadasDefault;
        this.entregado=entregadoDefault;
        this.genero=generoDefault;
        this.creador=creadorDefault;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero=generoDefault;
        this.numeroTemporadas=numeroTemporadasDefault;
        this.entregado=entregadoDefault;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado=entregadoDefault;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    //setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    //toString

    @Override
    public String toString() {
        return "El nombre de la serie es" + titulo + ", tiene " + numeroTemporadas + " temporadas, ¿está entregado? " + entregado +
                ", es del genero " + genero + ", y su creador es " + creador;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        if (entregado){
            return true;
        }
        return false;
    }

    @Override
    //compara dos series segun el numero de temporadas
    public int compareTo(Object a) {
        int estado = menor;
        Serie serie = (Serie) a;
        if(numeroTemporadas>serie.getNumeroTemporadas()){
            estado = mayor;
        }else if(numeroTemporadas== serie.getNumeroTemporadas()){
            estado = igual;
        }
        return estado;
    }
}
