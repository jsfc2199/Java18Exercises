package Ejercicio9;

import java.util.Scanner;

public class ReemplazarYConcatenar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una frase que te guste");
        String fraseAdicional = sc.nextLine();

        String texto = "La sonrisa sera la mejor arma contra la tristeza";

        System.out.println(texto.replace("a","e") + " " +fraseAdicional);

    }
}
