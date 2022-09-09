package Week3;

public class MathPlayground {
    static double balance = 10.0;
    // what if number was a decimal
    //int dollars = balance;
    // Casting {typeName}
    static int dollars = (int) balance;
    // introduce math
    static double x = 25.3;
    

    public static void main(String[] args) {
        System.out.println(dollars);
        //math round
        //System.out.println(Math.round(x));
        // math ciel
        System.out.println(Math.ceil(x));
        // double roundup = Math.ceil(x);
        // int roundupInt = (int) roundup;
        // ceil always round down
        int roundup = (int) Math.ceil(x);
        //System.out.println(roundupInt);
        // we know we will always have a whole number so we can do this.
        // floor always round up
        int rounddown = (int) Math.floor(x);
        System.out.println(rounddown);
        System.out.println(roundup);
        System.out.println(Math.cos(3));
        System.out.println(Math.toRadians(54));
    }
}
