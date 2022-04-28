package UsingCalesthenics.Exercise11;

import javax.swing.*;
import java.text.Normalizer;


public class VowelCounter {
    private String userText;

    public VowelCounter() {
    }

    public int lengthCounter(){
        this.userText = JOptionPane.showInputDialog("Please enter a text");
        int lenght = this.userText.length();
        return lenght;
    }

    public int vowelsCounter(){
        int total = 0;
        String sentence = normalizador();
        for (int i = 0; i < sentence.length(); i++) {
            total+=(casesVawels(sentence, i));
        }
        return total;

    }

    public int casesVawels(String sentence, int i){
        int contador=0;
        switch (sentence.charAt(i)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                contador+=1;
                break;
        }
        return contador;
    }

    //Alows to recognize letters with accent marks as normal lettes, so a and á, are both vowels
    public String normalizador(){
        this.userText = Normalizer.normalize(this.userText.toLowerCase(), Normalizer.Form.NFD);
        this.userText = this.userText.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return this.userText;
    }
}
