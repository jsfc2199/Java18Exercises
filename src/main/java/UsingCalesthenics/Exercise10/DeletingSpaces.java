package UsingCalesthenics.Exercise10;

import java.util.Scanner;

public class DeletingSpaces {
    protected Scanner keyboard;
    private String textUser;

    public DeletingSpaces() {
        this.keyboard = new Scanner(System.in);
    }

    public String deleteBlanks(){
        System.out.println("Please enter a sentence");
        this.textUser = keyboard.nextLine();
        String textWithoutBlanks = this.textUser.replace(" ", "");
        return textWithoutBlanks;
    }
}
