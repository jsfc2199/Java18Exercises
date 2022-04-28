package UsingCalesthenics.Exercise12;


import java.util.Scanner;

public class stringsComparator {
    protected Scanner text;
    private String userText_1;
    private String userText_2;

    public stringsComparator() {
        this.text = new Scanner(System.in);
    }

    public String printDifferences(){
        if (comparateStrings()){
            return "Both strings are the same";
        }
    return "Words are different";
    }

    public boolean comparateStrings(){
        System.out.println("Please enter the first a word");
        this.userText_1 = text.nextLine();
        System.out.println("Please enter the second a word");
        this.userText_2 = text.nextLine();

        if(this.userText_1.equals(userText_2)){
            return true;
        }
        return false;
    }
}
