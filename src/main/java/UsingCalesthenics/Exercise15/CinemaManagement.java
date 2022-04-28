package UsingCalesthenics.Exercise15;

import java.util.Scanner;

public class CinemaManagement {
    private static final String menu = "Selecciona una de las opciones\n1 - NUEVO ACTOR\n2 - BUSCAR ACTOR\n3 - ELIMINAR ACTOR\n4 - MODIFICAR ACTOR\n" +
            "5 - VER TODOS LOS ACTORES\n6 - VER PELICULAS DE LOS ACTORES\n7 - VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n8 - SALIR";

    private Scanner keyboard;
    private Integer option;

    public CinemaManagement() {
        this.keyboard = new Scanner(System.in);
    }

    public void menuChoise() {
        System.out.println("****** GESTION CINEMATOGRAFICA ********");
        System.out.println(menu);
        System.out.println("Please type an option");
        this.option = keyboard.nextInt();
        while (this.option != 8) {
            optionChoise();
        }
    }

    public void optionChoise() {
        switch (this.option) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println(menu);
                System.out.println("Please type an option");
                this.option = keyboard.nextInt();
                break;
            case 8:
                break;
        }
    }
}
