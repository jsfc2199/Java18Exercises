package Ejercicio4;


import javax.swing.*;

public class PrecioProductoIVA {
    public static void main(String[] args) {
        PrecioProductoIVA producto = new PrecioProductoIVA();
        String precioProducto = JOptionPane.showInputDialog("Ingrese el precio del producto");
        double precio = Double.parseDouble(precioProducto);
        System.out.println("El valor del producto con el IVA es " + producto.calculoIVA(precio));

    }

    public double calculoIVA(double precio) {
        final double iva = 0.21;
        return precio + (precio * iva);
    }
}
