package Ejercicio1;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        MayorDeDosNumeros comparador = new MayorDeDosNumeros();

        System.out.println(comparador.comparNumeros(15,20));
        System.out.println(comparador.comparNumeros(30,20));
        System.out.println(comparador.comparNumeros(15,15));
        System.out.println(comparador.comparNumeros(85,1));
        System.out.println(comparador.comparNumeros(0,1));
        System.out.println(comparador.comparNumeros(-5,-5));
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
