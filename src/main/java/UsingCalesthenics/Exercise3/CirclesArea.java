package UsingCalesthenics.Exercise3;

import java.util.Scanner;

public class CirclesArea {
    protected Scanner keyboard;
    protected double radius;
    protected double area;

    public CirclesArea(){
        this.keyboard = new Scanner(System.in);
    }

    public double CircleArea(){
        System.out.println("Please, insert the circle's radius");
        this.radius = keyboard.nextDouble();
        return area = Math.PI * Math.pow(this.radius,2);
    }
}
