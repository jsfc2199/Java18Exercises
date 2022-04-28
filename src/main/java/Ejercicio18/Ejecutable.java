package Ejercicio18;

public class Ejecutable {
    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        VideoJuego[] videoJuegos = new VideoJuego[5];

        series[0] = new Serie();
        series[1] = new Serie("South Park", "Math Stone ");
        series[2] = new Serie("Vikings", 6, "Drama/Guerra/Mitología", "Michael Hirst");
        series[3] = new Serie("Padre de familia", 12, "Humor", "Seth MacFarlane");
        series[4] = new Serie("Los Simpsons", 25, "Humor", "Matt Groening");

        videoJuegos[0] = new VideoJuego();
        videoJuegos[1] = new VideoJuego("Nier Automata", 1000, "Hack & Slash", "Square Enix");
        videoJuegos[2] = new VideoJuego("Nier Replicant", 300);
        videoJuegos[3] = new VideoJuego("God of war 3", 8, "Hack & Slash", "Santa Monica");
        videoJuegos[4] = new VideoJuego("Code Vein", 80, "Rol", "Square Enix");

        series[0].entregar();
        series[2].entregar();
        series[4].entregar();
        videoJuegos[2].entregar();
        videoJuegos[4].entregar();

        int contador = 0;
        for (int i = 0; i < series.length; i++) {
            if (series[i].isEntregado()) {
                contador += 1;
                series[i].devolver();
            }
            if (videoJuegos[i].isEntregado()) {
                contador += 1;
                videoJuegos[i].devolver();
            }
        }

        System.out.println("Se han entregado " + contador + " productos entre juegos y peliculas");

        Serie serieDeMasTemporadas = series[0];
        VideoJuego videoJuegoDeMasHoras = videoJuegos[0];

        for (int i = 1; i < series.length; i++) {
            if(series[i].compareTo(serieDeMasTemporadas)==Serie.mayor){
                serieDeMasTemporadas = series[i];
            }
            if(videoJuegos[i].compareTo(videoJuegoDeMasHoras)==Serie.mayor){
                videoJuegoDeMasHoras = videoJuegos[i];
            }
        }

        System.out.println("La serie con mas temporadas es " + serieDeMasTemporadas.getTitulo());
        System.out.println("El video juego que mas horas necesita para completarse es " + videoJuegoDeMasHoras.getTitulo());
    }

}
