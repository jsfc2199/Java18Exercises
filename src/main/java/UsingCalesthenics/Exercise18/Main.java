package UsingCalesthenics.Exercise18;

public class Main {
    public static Serie [] series = new Serie[5];
    public static Videojuego [] videojuegos = new Videojuego[5];

    public static void main(String[] args) {

        series[0] = new Serie("The walking dead","Robert");
        series[1] = new Serie("Dragon ball",5,"lucha","akira toriyama");
        series[2] = new Serie("Vikingos","Michael");
        series[3] = new Serie("South park",30,"comedia","Math");
        series[4] = new Serie("Hora de aventira","Pendleton ");

        videojuegos[0] = new Videojuego("Nier automata",300,"hack and slash","square enix");
        videojuegos[1] = new Videojuego("Nier replicant",100,"hack and slash","square enix");
        videojuegos[2] = new Videojuego("Devil may cry 5",150,"hack and slash","capcom");
        videojuegos[3] = new Videojuego("mosnter hunter",2000,"rol","capcom");
        videojuegos[4] = new Videojuego("final fantasy",2050,"rol","square enix");

        series[0].entregar();
        series[2].entregar();
        videojuegos[3].entregar();
        videojuegos[4].entregar();

        System.out.println("Se han entregado: series: " + contadorEntregadosSeries(series) + " y videojuegos: " + contadorEntregadosVideoJuegos(videojuegos) +
                ", total: " + (contadorEntregadosSeries(series) + contadorEntregadosVideoJuegos(videojuegos)));

        serieConMasTemporadas(series);
        videoJuegoConMasHoras(videojuegos);

    }

    public static int contadorEntregadosSeries(Serie[] series){
        int contador = 0;
        for (int i = 0; i < series.length; i++) {
            if(series[i].isEntregado()){
                contador+=1;
            }
        }
        return contador;
    }

    public static int contadorEntregadosVideoJuegos(Videojuego[] videojuegos){
        int contador = 0;
        for (int i = 0; i < videojuegos.length; i++) {
            if(videojuegos[i].isEntregado()){
                contador+=1;
            }
        }
        return contador;
    }

    public static void serieConMasTemporadas(Serie[] series){
        Serie serieConMasTemporadas = series[0];
        for (int i = 0; i < series.length; i++) {
            if(series[i].compareTo(serieConMasTemporadas) == 1){
                serieConMasTemporadas = series[i];
            }
        }
        System.out.println("serie de mas temporadas: " + serieConMasTemporadas.toString());
    }

    public static void videoJuegoConMasHoras(Videojuego[] videojuegos){
        Videojuego juegoConMasHoras = videojuegos[0];
        for (int i = 0; i < videojuegos.length; i++) {
            if(videojuegos[i].compareTo(juegoConMasHoras) == 1){
                juegoConMasHoras = videojuegos[i];
            }
        }
        System.out.println("juego con mas horas: " + juegoConMasHoras.toString());
    }
}
