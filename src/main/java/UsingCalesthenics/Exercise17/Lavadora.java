package UsingCalesthenics.Exercise17;

public class Lavadora extends Electrodomestico{
    private static final double CARGA_DEFAULT = 5;

    private double carga = CARGA_DEFAULT;

    public Lavadora() {
        super();
    }

    public Lavadora(double precio, double peso){
        super(precio,peso);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga){
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }


    public double precioFinal(){
        double precioElectrodomestico = super.precioFinal();
        return precioElectrodomestico + aumentoTamanio();
    }

    public double aumentoTamanio(){
        if(this.carga>30){
            return 50;
        }
        return 0;
    }
}
