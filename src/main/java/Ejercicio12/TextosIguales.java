package Ejercicio12;

import java.util.Scanner;

public class TextosIguales {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Escribe la palabra 1");
        String palabra1 = sn.nextLine();

        System.out.println("Escribe la palabra 2");
        String palabra2 = sn.nextLine();


        if(palabra1.equals(palabra2)){
            System.out.println("Las palabras son iguales");
        }else{
            System.out.println("Las palabras no son iguales");
        }
    }
}
