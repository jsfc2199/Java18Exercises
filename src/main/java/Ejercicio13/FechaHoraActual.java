package Ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechaHoraActual {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("La fecha y hora actual es " + dtf.format(LocalDateTime.now()));
    }
}
