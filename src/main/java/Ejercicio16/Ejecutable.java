package Ejercicio16;

import javax.swing.*;

public class Ejecutable {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre");

        String auxiliar = JOptionPane.showInputDialog("Introduce la edad");
        int edad = Integer.parseInt(auxiliar);

        auxiliar = JOptionPane.showInputDialog("Introduce el sexo, H o M, si se indica otra cosa sera H");
        char sexo = auxiliar.charAt(0);

        auxiliar = JOptionPane.showInputDialog("Introduce el peso");
        double peso = Double.parseDouble(auxiliar);

        auxiliar = JOptionPane.showInputDialog("Introduce la altura");
        double altura = Double.parseDouble(auxiliar);

        Persona primera = new Persona(nombre, edad, sexo, peso, altura);
        Persona segunda = new Persona(nombre, edad, sexo);
        Persona tercera = new Persona();

        //Para primera
        System.out.println("Persona #1");
        mensajeMayorEdad(primera);
        mensajePesoIdeal(primera);

        //Para segunda
        System.out.println("Persona #2");
        segunda.setAltura(1.50);
        segunda.setPeso(60);
        mensajeMayorEdad(segunda);
        mensajePesoIdeal(segunda);

        //para tercera
        System.out.println("Persona #3");
        tercera.setNombre("Juan");
        tercera.setEdad(25);
        tercera.setSexo('H');
        tercera.setPeso(80);
        tercera.setAltura(1.70);
        mensajeMayorEdad(tercera);
        mensajePesoIdeal(tercera);
    }

    public static void mensajeMayorEdad(Persona p) {
        if (p.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
    }

    public static void mensajePesoIdeal(Persona p) {
        int pesoIdeal = (int) p.calcularIMC();
        switch (pesoIdeal) {
            case Persona.pesoIdeal:
                System.out.println("Estas en tu peso ideal");
                break;
            case Persona.debajoIdeal:
                System.out.println("Estas por debajo del peso ideal");
                break;
            case Persona.encimaIdeal:
                System.out.println("Estas por encima del peso ideal");
                break;
        }
    }
}
