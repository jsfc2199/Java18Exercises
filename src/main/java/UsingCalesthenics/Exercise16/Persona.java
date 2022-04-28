package UsingCalesthenics.Exercise16;

public class Persona {
    //constantes para IMC
    public static final int PESO_IDEAL = 0;
    public static final int PESO_ENCIMA = 1;
    public static final int PESO_DEBAJO = -1;

    private static final String NOMBRE_DEFAULT = "";
    private static final Integer EDAD_DEFAULT = 0;
    private static final char SEXO_DEFAULT = 'H';
    private static final double ALTURA_DEFAULT = 0;
    private static final double PESO_DEFAULT = 0;

    private String nombre = NOMBRE_DEFAULT;
    private Integer edad = EDAD_DEFAULT;
    private char sexo = SEXO_DEFAULT;
    private double altura = ALTURA_DEFAULT;
    private double peso = PESO_DEFAULT;
    private String dni;

    //constructores


    public Persona() {
        this.dni = generarDNI();
        this.sexo = comprobarSexo(this.sexo);
    }

    public Persona(String nombre, Integer edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = generarDNI();
        this.sexo = comprobarSexo(this.sexo);
    }

    public Persona(String nombre, Integer edad, char sexo, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.dni = generarDNI();
        this.sexo = comprobarSexo(this.sexo);
    }

    //metodos
    public double calcularIMC(){
        double pesoIdeal = this.peso/Math.pow(this.altura,2);
        if(pesoIdeal<20){
            return PESO_DEBAJO;
        }else if(pesoIdeal>=20&&pesoIdeal<=25){
            return PESO_IDEAL;
        }
        return PESO_ENCIMA;
    }

    public boolean esMayorDeEdad(){
        if(this.edad>17){
            return true;
        }
        return false;
    }

    private char comprobarSexo(char sexo){
        if(this.sexo == 'M'){
            this.sexo = sexo;
            return this.sexo;
        }
        return this.sexo;
    }

    private String generarDNI(){
        double limSuperior = 99999999;
        double limInferior = 10000000;

        double numOchoCifras = Math.random() * (limSuperior - limInferior) + limInferior;
        int numDNI = (int) numOchoCifras;

        String resultadoNumero = String.valueOf(numDNI);
        char caracterInicial = resultadoNumero.charAt(0);

        int indice = Character.getNumericValue(caracterInicial);
        char letra = letraDNI(indice);

        this.dni = resultadoNumero + letra;
        return this.dni;
    }

    private char letraDNI(int indice){
        char letras[] = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J'
        };
        return letras[indice];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", altura=" + altura +
                ", peso=" + peso +
                ", dni='" + dni + '\'';

    }
}
