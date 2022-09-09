import Week2.Access;

// Cats>Learning for later 

public class Playground {
    public static void main(String[] args) {
        // STRING PLAYGROUND
        String name = "Greg";
        System.out.println(name);
        System.out.println(name.toLowerCase());
        name.toUpperCase();
        System.out.println(name.toUpperCase());
        // THIS IS NEEDED FOR THE HOMEWORK
        System.out.println(name.replace("g", "T"));

        // METHOD PLAYGROUND

        // METHOD WITH VOID
        // addExclamationPoint(name);

        // METHOD WITHOUT VOID (STRING)
        newAddExclamationPoint(name);

        String exclaimName = newAddExclamationPoint(name);
        System.out.println(exclaimName);

        // System.out.println(newAddExclamationPoint(name));
        // Create a friend object
        //Friend newFriend = new Friend();
        // Call my friend name method
        String friendName = Friend.myFriendName();
        System.out.println(friendName);

        // call validateFriend Method with the variable name
        // name = Greg
        String validateFriend = Friend.validateFriend(name);
        System.out.println(validateFriend);
        System.out.println(Friend.validateFriend("jake"));

        Counter count = new Counter();
        // System.out.println(count.value);
        // 0
        System.out.println(count.getValue());
        // 1
        count.click();
        System.out.println(count.getValue());
        // 2
        count.click();
        System.out.println(count.getValue());

        count.click();
        count.click();
        count.click();
        System.out.println(count.getValue());
        count.minusClick();
        System.out.println(count.getValue());
        count.reset();
        System.out.println(count.getValue());

        Access test = new Access();
        System.out.println(test.getCat1());
        
    }

    // make a void method
    // method addExclamationPoint
    public static void addExclamationPoint(String s) {
        System.out.println(s + "!");
    }

    // make a method that returns a string
    public static String newAddExclamationPoint(String s) {
        return s + "!";
    }
}
