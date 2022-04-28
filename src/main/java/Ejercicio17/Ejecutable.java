package Ejercicio17;

public class Ejecutable {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        electrodomesticos[0]=new Electrodomestico(500,50);
        electrodomesticos[1]=new Electrodomestico();
        electrodomesticos[2]=new Electrodomestico(500,"negro",'A',80);
        electrodomesticos[3]=new Televisor();
        electrodomesticos[4]=new Televisor(200,45);
        electrodomesticos[5]=new Televisor(600,"gris",'C',60,65,false);
        electrodomesticos[6]=new Televisor(300,"azul",'E',75,80,true);
        electrodomesticos[7]=new Lavadora();
        electrodomesticos[8]=new Lavadora(150,90);
        electrodomesticos[9]=new Lavadora(400,"verde",'C',95,100);

        System.out.println(electrodomesticos[0].precioFinal());
        System.out.println(electrodomesticos[1].precioFinal());
        System.out.println(electrodomesticos[2].precioFinal());
        System.out.println(electrodomesticos[3].precioFinal());
        System.out.println(electrodomesticos[4].precioFinal());
        System.out.println(electrodomesticos[5].precioFinal());
        System.out.println(electrodomesticos[6].precioFinal());
        System.out.println(electrodomesticos[7].precioFinal());
        System.out.println(electrodomesticos[8].precioFinal());
        System.out.println(electrodomesticos[9].precioFinal());

        double precioTotallElectrodomesticos=0;
        double precioTotalTvs= 0;
        double precioTotalLavadoras=0;

        for (int i = 0; i < electrodomesticos.length; i++) {
            if(electrodomesticos[i] instanceof Electrodomestico){
                precioTotallElectrodomesticos += electrodomesticos[i].precioFinal();
            }
            if(electrodomesticos[i] instanceof Televisor){
                precioTotalTvs += electrodomesticos[i].precioFinal();
            }
            if(electrodomesticos[i] instanceof Lavadora){
                precioTotalLavadoras += electrodomesticos[i].precioFinal();
            }
        }

        System.out.println("El total de los electrodomesticos es " + precioTotallElectrodomesticos);
        System.out.println("El total de los televisores es " + precioTotalTvs);
        System.out.println("El total de las lavadoras es " + precioTotalLavadoras);

    }
}
