package UsingCalesthenics.Exercise9;

import java.util.Scanner;

public class ReplacingText {
    private static final String frase = "La sonrisa sera la mejor arma contra la tristeza";
    protected Scanner keyboard;
    private String textUser;

    public ReplacingText() {
        this.keyboard = new Scanner(System.in);
    }

    public String replaceSentence(){
        System.out.println("Please enter a sentece or a word");
        this.textUser = keyboard.nextLine();
        String fraseConE = frase.replace('a','e');
        String finalSentense = fraseConE + " " + this.textUser;
        return finalSentense;
    }
}
