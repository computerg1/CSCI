package Week3;

public class MathPlayground {
    static double balance = 10.8;
    //Casting
    // declare int value = (TypeName) NameOfVariable 
    static int intbal = (int) balance;

    public static void main(String[] args) {
        System.out.println(balance);
        System.out.println(intbal);
        System.out.println("round");
        System.out.println(Math.round(balance));
        // System.out.println("ceil");
        //System.out.println(Math.ceil(balance));
        // double roundup = Math.ceil(balance);
        // int roundupInt = (int) roundup;
        // System.out.println(roundupInt);
        int roundup = (int) Math.ceil(balance);
        System.out.println(roundup);
        System.out.println("Floor");
        int rounddown = (int) Math.floor(balance);
        System.out.println(rounddown);
        System.out.println(Math.cos(3));
        System.out.println(Math.toRadians(54));

    }
}
