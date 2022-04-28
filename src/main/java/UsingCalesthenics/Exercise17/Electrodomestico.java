package UsingCalesthenics.Exercise17;

public class Electrodomestico {
    private static final String COLOR_DEFAULT = "blanco";
    private static final char CONSUMO_ENERGETICO_DEFAULT = 'F';
    private static final double PRECIO_BASE_DEFAULT = 100;
    private static final double PESO_DEFAULT = 5;

    private double precioBase = PRECIO_BASE_DEFAULT;
    private String color = COLOR_DEFAULT;
    private char consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
    private double peso = PESO_DEFAULT;

    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);

    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {
        switch (letra) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                this.consumoEnergetico = letra;
                break;
            default:
                this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
                break;
        }
    }

    private void comprobarColor(String color) {
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        for (int i = 0; i < colores.length; i++) {
            stringValido(colores, color, i);
        }
    }

    private String stringValido(String[] colores, String color, int i) {
        if (colores[i].equals(color)) {
            return this.color = color;
        }
        return this.color = COLOR_DEFAULT;
    }

    public double precioFinal() {
        double total = 0;
        return total = this.precioBase + aumentoConsumo() + aumentoTamanio();
    }

    private double aumentoConsumo() {
        double aumento = 0;
        switch (this.consumoEnergetico) {
            case 'A':
                aumento += 100;
                break;
            case 'B':
                aumento += 80;
                break;
            case 'C':
                aumento += 60;
                break;
            case 'D':
                aumento += 50;
                break;
            case 'E':
                aumento += 30;
                break;
            case 'F':
                aumento += 10;
                break;
        }
        return aumento;
    }

    private double aumentoTamanio() {
        double aumento = 0;
        if (this.peso > 0 && this.peso < 20) {
            return aumento += 10;
        }
        if (this.peso >= 20 && this.peso < 50) {
            return aumento += 50;
        }
        if (this.peso >= 50 && this.peso < 80) {
            return aumento += 80;
        }
        if (this.peso >= 80) {
            return aumento += 100;
        }
        return aumento;
    }
}
