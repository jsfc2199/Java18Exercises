package UsingCalesthenics.Exercise2;

import java.util.Scanner;

public class ComparateNumbersScanner {
    protected Scanner keyboard;
    protected int number1;
    protected int number2;

    public ComparateNumbersScanner() {
        this.keyboard = new Scanner(System.in);
    }

    public String greaterThan(){
        System.out.println("Please insert the first number");
        this.number1 = keyboard.nextInt();
        System.out.println("Please insert the second number");
        this.number2 = keyboard.nextInt();
        if(this.number1>this.number2){
            return "Number " + number1 + " is greater than " + number2;
        }
        return equalsLessThan();
    }

    public String equalsLessThan(){
        if(this.number1==this.number2){
            return "Number " + number1 + " equals " + number2;
        }
        return "Number " + number2 + " is greater than " + number1;
    }
}
