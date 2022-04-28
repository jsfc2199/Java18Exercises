package Ejercicio14;

import java.util.Scanner;

public class numerosHastaMil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        String numTxt = sc.nextLine();
        int numero = Integer.parseInt(numTxt);

        for (int i = numero; i <=1000 ; i+=2) {
            System.out.println(i);
        }
    }
}
