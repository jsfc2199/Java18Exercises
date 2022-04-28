package Ejercicio7;

import java.util.Scanner;

public class NumMayorACero {
    public static void main(String[] args) {
        String texto;
        Double numero;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduce un numero mayor a cero");
            texto = sc.nextLine();
            numero =Double.parseDouble(texto);
        }while(numero<0);

        System.out.println("El numero "+ numero +" ha sido aceptado");
    }

}
