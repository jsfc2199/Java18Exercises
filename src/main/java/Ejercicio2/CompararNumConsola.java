package Ejercicio2;

import java.util.Scanner;

public class CompararNumConsola {
    public static void main(String[] args) {
        Scanner entradaConsola = new Scanner(System.in);
        CompararNumConsola comparador = new CompararNumConsola();

        System.out.printf("¿Cuantas comparaciones quieres hacer?");
        String comparaciones = entradaConsola.nextLine();
        int comparacionesNumero = Integer.parseInt(comparaciones);

        for (int i = 0; i < comparacionesNumero; i++) {
            System.out.println("Ingresa el primer numero a comparar");
            String numero = entradaConsola.nextLine();
            int numero1 = Integer.parseInt(numero);

            System.out.println("Ingresa el segundo numero a comparar");
            numero = entradaConsola.nextLine();
            int numero2 = Integer.parseInt(numero);

            System.out.println(comparador.comparNumeros(numero1,numero2));
        }
    }

    public String comparNumeros(int numero1, int numero2){
        if(numero1>numero2){
            return "El numero " + numero1 + " es mayor al numero " + numero2;
        }else if(numero1<numero2){
            return "El numero " + numero2 + " es mayor al numero " + numero1;
        }
        return "Los numeros son iguales";
    }
}
