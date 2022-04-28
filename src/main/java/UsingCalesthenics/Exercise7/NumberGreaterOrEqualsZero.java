package UsingCalesthenics.Exercise7;

import java.util.Scanner;

public class NumberGreaterOrEqualsZero {
    private Scanner keyboard;
    private String text;
    private double number;


    public NumberGreaterOrEqualsZero() {
        this.keyboard = new Scanner(System.in);
    }

    public void isGreaterOrEqualZero(){
        do{
            System.out.println("Please, enter a number greater or equals zero");
            this.text = keyboard.nextLine();
            this.number = Double.parseDouble(this.text);

        }while(this.number<0);

        System.out.println("Number accepted");
    }
}
