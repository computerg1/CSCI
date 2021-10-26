package Week1;
import java.awt.Rectangle;
// Cats>Learning
import javax.swing.JFrame;

public class Playground {
    public static void main(String[] args) {
        String name = "Greg";
        System.out.println(name); // println() is a method
        //System.out.println(name.toLowerCase()); // toLowerCase() is a method 
        //System.out.println(name.replace("g", "G"));
        //System.out.println(name.toUpperCase());

        // METHOD 1 now if i want to call this method. I need to do it within the main method. 
        addExclamationPoint(name);
        
        // METHOD 2
        // When we run this nothing returns... Because we need to save this to a variable
        newAddExclamationPoint(name);
        String exclaimName = newAddExclamationPoint(name);
        System.out.println(exclaimName);

        // nice so that worked thats awesome
        // however what if we have a method thats not in this java file. Lets say we want to use a method from another class 

        // were going to make a new java file (class file)
        // Now if I wanted to see what my friends name is here I would need to create a new Friend
        // THIS IS AN OBjECT 
        // This format is used when we make an object
        Friend newFriend = new Friend();
        String friendName = newFriend.myFriendName();
        System.out.println(friendName);
        // so we made an object and called the method myFriendName from within that object. 
        // lets break that down and this kind of unlocks what java is all about
        // class files are objects and objects contain methods that we can call and use (Object Oriented)
        // so lets write another method with some if else statements
        // we can make it a variable:
        String validateFriend = newFriend.validateFriend(name);
        //System.out.println(validateFriend);
        // or just syso it
        System.out.println(newFriend.validateFriend(name));
        // we can change our name at a later point if we wanted because the variable is not constant
        // see how the response changes
        name = "ajsdkls";
        System.out.println(newFriend.validateFriend(name));
        name = "123";
        System.out.println(newFriend.validateFriend(name));
        // Lets try to create a shape 
        Rectangle rec = new Rectangle(0,0,5,6);
        rec.translate(5, 5);
        System.out.println(rec);
        System.out.println(rec.getLocation());

        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("Two rectangles"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RectangleComponent component = new RectangleComponent(); frame.add(component);
        frame.setVisible(true); 

        Counter count = new Counter();
        //System.out.println(count.value);
        System.out.println(count.getValue());
        count.click();
        count.click();
        count.click();
        count.click();
        count.minusClick();
        // count.reset();
        System.out.println(count.getValue());

    }

    // So now lets make a method
    // Lets say we want to add an ! to the end of our name
    // comment out line 7-8 for simplicity
    public static void addExclamationPoint(String s) {
        System.out.println(s + "!");
    }

    // Okay but typically we don't program methods with Syso in the method and rather we would return something
    // So lets make a better designed method
    // Notice how we dont want to use void here since we are returning a value. We are returning a String here
    // So we would add public String
    public static String newAddExclamationPoint(String s) {
        return s + "!";
    }
}

