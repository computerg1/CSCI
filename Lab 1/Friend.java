// New Friend Class
// Friend object
public class Friend {
    // method myFriendName
    public static String myFriendName() {
        // return friend name
        return "My name is Bob";
    }

    public static String validateFriend(String name) {
        if (name.contains("Greg")){
            return "Oh Hey "+name+" how are you today?";
        } else if (name.matches("[a-z]+")){
            return "I don't belive we have met... It's nice to meet you "+name;
        } else{
            return "Get away from me creep";
        }
    }


}
