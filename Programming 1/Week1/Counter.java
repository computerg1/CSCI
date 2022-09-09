package Week1;
// custom class to count tally

//Java Access Modifiers 
// allow us to give access to other files or classes or methods about the data
public class Counter {
    private int value;
    //Encapsulation allows a programmer to use a class without having to know its implementation.
    //Get current value of counter
    public int getValue() {
        return value;
    }
    //Advance counter 1
    public void click(){
        value = value + 1; 
    }
    public void minusClick(){
        value = value - 1;
    }
    //Reset counter value
    // change to private to see 
    public void reset() {
        value = 0;
    }
}
