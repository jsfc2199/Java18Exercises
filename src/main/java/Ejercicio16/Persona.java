package Ejercicio16;

public class Persona {
    //constantes para IMC
    public final static int debajoIdeal = -1;
    public final static int pesoIdeal = 0;
    public final static int encimaIdeal = 1;


    //atributos por defecto
    private final static String nombreDefault = "";
    private final static int edadDefault = 0;
    private final static String dniDefault = "";
    private final static char sexoDefautl = 'H';
    private final static double pesoDefault = 0;
    private final static double alturaDefault = 0;

    //atributos
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    //constructor por defecto
    public Persona() {
        this.nombre = nombreDefault;
        this.edad = edadDefault;
        this.dni = dniDefault;
        this.sexo = sexoDefautl;
        this.peso = pesoDefault;
        this.altura = alturaDefault;
    }

    //constructor de 3 parámetros
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dniDefault;
        this.peso = pesoDefault;
        this.altura = alturaDefault;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        verificarSexo();
        generarDNI();
    }

    //comprueba si la persona está en su peso ideal
    public double calcularIMC() {
        double pesoCalculo = this.peso / (Math.pow(this.altura, 2));
        if (pesoCalculo >= 20 && pesoCalculo <= 25) {
            return pesoIdeal;
        } else if (pesoCalculo < 20) {
            return debajoIdeal;
        } else {
            return encimaIdeal;
        }
    }

    //verifica que sea mayor de edad la persona
    public boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            return true;
        }
        return false;
    }

    //metodos no visibles
    //Metodo que verifica que haya un sexo indicado, de lo contrario sería el valor por defecto
    private void verificarSexo() {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = sexoDefautl;
        }
    }

    private void generarDNI() {
        double limSuperior = 99999999;
        double limInferior = 10000000;

        //genera un numero aleatorio de 8 cifras
        double numOchoCifras = Math.random() * (limSuperior - limInferior) + limInferior;
        int numDNI = (int) numOchoCifras;

        String resultadoNumero = String.valueOf(numDNI);
        char caracterInicial = resultadoNumero.charAt(0);

        int indice = Character.getNumericValue(caracterInicial);
        char letra = letraDNI(indice);

        this.dni = resultadoNumero + letra;

    }

    private char letraDNI(int indice) {
        char letras[] = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J'
        };
        return letras[indice];
    }

    //metodos set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
