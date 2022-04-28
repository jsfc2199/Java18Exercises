package Ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un dia de la semana");

        String dia = sc.nextLine();

        switch (dia){
            case "lunes":
                System.out.println("Es un día laboral");
                break;
            case "martes":
                System.out.println("Es un día laboral");
                break;
            case "miercoles":
                System.out.println("Es un día laboral");
                break;
            case "jueves":
                System.out.println("Es un día laboral");
                break;
            case "viernes":
                System.out.println("Es un día laboral");
                break;
            case "sabado":
                System.out.println("No es un dia laboral");
                break;
            case "domingo":
                System.out.println("No es un dia laboral");
                break;
            default:
                System.out.println("dia mal ingresado");

        }

    }
}
