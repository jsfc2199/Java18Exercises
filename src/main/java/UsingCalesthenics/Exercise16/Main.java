package UsingCalesthenics.Exercise16;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce your name");

        String auxiliar = JOptionPane.showInputDialog("Introduce your age");
        int edad = Integer.parseInt(auxiliar);

        auxiliar = JOptionPane.showInputDialog("Introduce sex, H o M, if is different of both of them it will be H");
        char sexo = auxiliar.charAt(0);

        auxiliar = JOptionPane.showInputDialog("Introduce your height");
        double altura = Double.parseDouble(auxiliar);

        auxiliar = JOptionPane.showInputDialog("Introduce your weight");
        double peso = Double.parseDouble(auxiliar);

        Persona primera = new Persona(nombre, edad, sexo, altura, peso);
        Persona segunda = new Persona(nombre, edad, sexo);
        Persona tercera = new Persona();

        System.out.println("Persona #1");
        System.out.println(primera.toString());
        adult(primera);
        messageIdealWeight(primera);


        System.out.println("Persona #2");
        segunda.setAltura(1.70);
        segunda.setPeso(80);
        System.out.println(segunda.toString());
        System.out.println(adult(segunda));
        messageIdealWeight(segunda);

        System.out.println("Persona #3");
        tercera.setNombre("Juan");
        tercera.setEdad(25);
        tercera.setSexo('H');
        tercera.setAltura(1.70);
        tercera.setPeso(80);
        System.out.println(tercera.toString());
        System.out.println(adult(tercera));
        messageIdealWeight(tercera);
    }

    public static String adult(Persona persona) {
        if (persona.esMayorDeEdad()) {
            return "Es mayor de edad";
        }
        return "Es menor de edad";
    }

    public static void messageIdealWeight(Persona persona) {
        int pesoIdeal = (int) persona.calcularIMC();
        switch (pesoIdeal) {
            case Persona.PESO_IDEAL:
                System.out.println("You are in your ideal weight");
                break;
            case Persona.PESO_DEBAJO:
                System.out.println("You are above your ideal weight");
                break;
            case Persona.PESO_ENCIMA:
                System.out.println("You are over your ideal weight");
                break;
        }
    }
}
