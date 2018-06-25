package strategy;

public class FirstChoice implements ChoiceInterface{
    @Override
    public void myChoice(String s1, String s2) {
        System.out.println("You wanted to add the numbers");
        int int1, int2, sum;
        int1 = Integer.parseInt(s1);
        int2 = Integer.parseInt(s2);
        sum = int1 + int2;
        System.out.println("Result of addition is: " + sum);
        System.out.println("***End of the strategy***");
    }
}
