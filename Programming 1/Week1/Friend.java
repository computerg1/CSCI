package Week1;

// Notice how it auto filled the public class Friend because java is trying to guess what we are trying to do
public class Friend {
    
    public static String myFriendName(){
        return "My name is Bob";
    }
    // lets say we want to check what our name is and if our name is correct bob will say a specific response
    // Error (This method must return a result of type String)
    public static String validateFriend(String name){
        if (name.contains("Greg")){
            return "Oh Hey "+name+" how are you today?";
        } else if (name.matches("[a-z]+")){
            return "I dont believe we have met... Its nice to meet you";
        } else{
            // notice how we need to return the empty string because we declare a string here.
            // this is correct and designed okay but it could be better with some error statements. 
            return "Get away from me creep";
        }
    }
    
}
