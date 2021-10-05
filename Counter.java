// custom class to count tallys

public class Counter {
    // java access modifiers
    // public, private, default, protected 
    private int value;
    // come back to this
    // make a public method that gets a private variable 
    // getter
    public int getValue(){
        return value; 
    }

    public void click(){
        value ++;
    }

    public void minusClick(){
        value --;
    }

    public void reset() {
        value = 0;
    }
}
