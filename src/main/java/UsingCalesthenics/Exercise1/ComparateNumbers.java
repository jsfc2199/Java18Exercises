package UsingCalesthenics.Exercise1;



public class ComparateNumbers {


    public ComparateNumbers() {
    }

    public String greaterThan(int number1, int number2){
       if(number1>number2){
            return "Number " + number1 + " is greater than " + number2;
        }
        return equalsLessThan(number1,number2);
    }

    public String equalsLessThan(int number1, int number2){
        if(number1==number2){
            return "Number " + number1 + " equals " + number2;
        }
        return "Number " + number2 + " is greater than " + number1;
    }


}
