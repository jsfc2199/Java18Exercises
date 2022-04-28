package Ejercicio18;

public class VideoJuego implements Entregable{
    //variables estaticas para el compareTo
    public final static int mayor = 1;
    public final static int menor = -1;
    public final static int igual = 0;

    //atributos por defecto
    private final static String tituloDefault = "";
    private final static int horasEstimadasDefault = 10;
    private final static boolean entregadoDefault = false;
    private final static String generoDefault = "";
    private final static String companiaDefault = "";

    //atributos
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    //constructores
    public VideoJuego(){
        this.titulo=tituloDefault;
        this.horasEstimadas = horasEstimadasDefault;
        this.entregado = entregadoDefault;
        this.genero = generoDefault;
        this.compania = companiaDefault;
    }

    public VideoJuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = entregadoDefault;
        this.genero = generoDefault;
        this.compania = companiaDefault;
    }

    public VideoJuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
        this.entregado = entregadoDefault;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "El VideoJuego es " + titulo + ", las horas estimadas son " + horasEstimadas + " horas, ¿Está entregado? " + entregado +
                ", el genero del video juego es" + genero + ", la compania que lo desarrollo es " + compania;
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
    //compara dos series segun el numero horas estimadas
    public int compareTo(Object a) {
        int estado = menor;
        VideoJuego videoJuego = (VideoJuego) a;
        if(horasEstimadas>videoJuego.getHorasEstimadas()){
            estado = mayor;
        }else if(horasEstimadas==videoJuego.getHorasEstimadas()){
            estado = igual;
        }
        return estado;
    }
}
