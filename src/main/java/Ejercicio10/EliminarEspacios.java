package Ejercicio10;

import java.util.Scanner;

public class EliminarEspacios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un texto para quitarle los espacios");
        String texto = sc.nextLine();

        System.out.println(texto.replace(" ",""));

    }
}
