package UsingCalesthenics.Exercise8;


import java.util.Scanner;

public class WorkingDay {
    protected Scanner keyboard;
    private String userText;

    public WorkingDay() {
        this.keyboard = new Scanner(System.in);
    }

    public String messageDay(){
        if(isWorkingDay()){
            return "Is a working day";
        }
        return "Is not a working day";
    }

    public boolean isWorkingDay(){
        System.out.println("Please enter a working day");
        this.userText = keyboard.nextLine();
        switch (this.userText.toLowerCase()){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                return true;
        }
        return false;
    }
}
