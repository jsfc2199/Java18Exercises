package Ejercicio15;

import java.util.Scanner;

public class GestionCine {
    public static void main(String[] args) {
        System.out.println("****** GESTION CINEMATOGRAFICA ********");
        String menu = "Selecciona una de las opciones\n1-NUEVO ACTOR\n2-BUSCAR ACTOR\n3-ELIMINAR ACTOR\n4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n6- VER PELICULAS DE LOS ACTORES\n7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n8-SALIR";
        System.out.println(menu);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una opción");
        int opcion = sc.nextInt();

        while (opcion!=8){
            switch(opcion){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    System.out.println(menu);
                    System.out.println("Ingresa una opción");
                    opcion = sc.nextInt();
                    break;
                case 8:
                    break;
            }
        }

    }

}
