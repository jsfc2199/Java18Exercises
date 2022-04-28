package Ejercicio3;

import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {
        AreaCirculo circulo = new AreaCirculo();
        String radio = JOptionPane.showInputDialog("Ingresa el radio del circulo");
        double radioDouble = Double.parseDouble(radio);
        System.out.println("El area del ciculo de radio "+ radio +" es: " + circulo.areaCirculo(radioDouble) + " unidades cuadradas");
    }

    public double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
