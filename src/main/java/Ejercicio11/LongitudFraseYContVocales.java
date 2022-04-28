package Ejercicio11;

import javax.swing.*;
import java.text.Normalizer;

public class LongitudFraseYContVocales {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingresa una oracion cualquiera");
        System.out.println("La longitud de la frase (incluyendo espacios) es de " + texto.length() + " caracteres");
        texto = texto.toLowerCase();

        String textoNormalizado = normalizador(texto);

        int contador = 0;
        for (int i = 0; i < textoNormalizado.length(); i++) {
            switch (textoNormalizado.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contador++;
                    break;
            }
        }
        System.out.println("La frase tiene " + contador + " vocales");
    }

    public static String normalizador(String texto){
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return texto;
    }
}
