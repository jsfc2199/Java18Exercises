package UsingCalesthenics.Exercise11;

public class Main {
    public static void main(String[] args) {
        VowelCounter vowelCounter = new VowelCounter();
        System.out.println("The length of the sentence with blanks is: " + vowelCounter.lengthCounter());
        System.out.println("The sentece has: " + vowelCounter.vowelsCounter() + " vowels");

    }
}
