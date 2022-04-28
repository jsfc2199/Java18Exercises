package UsingCalesthenics.Exercise14;

import java.util.Scanner;

public class NumbersTilOneThousand {
    private Scanner keyboard;
    private int number;

    public NumbersTilOneThousand() {
        this.keyboard = new Scanner(System.in);
    }

    public void printNumbers(){
        System.out.println("Please type a number less than 1000");
        this.number = keyboard.nextInt();
        for (int i = this.number; i <= 1000; i+=2) {
            System.out.println(i);
        }
    }
}
