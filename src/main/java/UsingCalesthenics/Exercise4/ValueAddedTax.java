package UsingCalesthenics.Exercise4;

import java.util.Scanner;

public class ValueAddedTax {
    private static final double VAT = 0.21;
    private Scanner keyboard;
    private String price;
    private double finalPrice;

    public ValueAddedTax() {
        this.keyboard = new Scanner(System.in);
    }

    public double calculateVAT(){
        System.out.println("Please, insert the cost of the product");
        this.price = keyboard.nextLine();
        return this.finalPrice = Double.parseDouble(this.price) + Double.parseDouble(this.price)*VAT;
    }
}
