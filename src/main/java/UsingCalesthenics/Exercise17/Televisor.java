package UsingCalesthenics.Exercise17;

public class Televisor extends Electrodomestico{
    private static final double PULGADAS_DEFAULT = 20;
    private static final boolean SINTONIZADOR_TDT_DEFAULT = false;

    private double pulgadas = PULGADAS_DEFAULT;
    private boolean sintonizadorTDT = SINTONIZADOR_TDT_DEFAULT;

    public Televisor() {
        super();
    }

    public Televisor(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Televisor(double precioBase, String color, char consumoEnergetico, double peso, double pulgadas, boolean sintonizadorTDT){
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public double precioFinal(){
        double precioElectrodomestico = super.precioFinal();
        return precioElectrodomestico + aumentoPulgadas() + aumentoSintonizador();
    }

    public double aumentoPulgadas(){
        double aumento = super.precioFinal();
        if(this.pulgadas>40){
            return aumento*0.3;
        }
        return 0;
    }

    public double aumentoSintonizador(){
        if(this.sintonizadorTDT){
            return 50;
        }
        return 0;
    }
}
