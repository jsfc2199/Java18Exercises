package UsingCalesthenics.Exercise5;

public class NumbersFromOneToHOneHundred {
    private int start = 1;
    public NumbersFromOneToHOneHundred() {
    }

    public void showNumbers(){
        while(start<=100){
            System.out.println(start);
            start++;
        }
    }
}
