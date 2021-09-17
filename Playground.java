public class Playground {
    public static void main(String[] args) {
        String name =  "Andrew Montemurro"; 
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

    //This is needed of the homework. 
        System.out.println(name.replace("A", "Y"));



        //Method Playground

        //Method with void 
        addExclamationPoint(name);


        //method without void (string)

        newaddExclamationPoint(name);
        String exclaimName = newaddExclamationPoint(name);
        System.out.println(exclaimName);
    }
    //make a method 
    // method addExclamationPoint
    //maek a void method 
    public static void addExclamationPoint(String s) {
        System.out.println(s + "!" );
        
    }

    //make a method that returns a string 
    public static String newaddExclamationPoint(String s){
        return s + "!";


    }
        
    }



