package strategy;

public class Context {
    ChoiceInterface myChoice;

    public void setChoice(ChoiceInterface ci){
        myChoice = ci;
    }

    public void showChoice(String s1, String s2){
        myChoice.myChoice(s1,s2);
    }
}
