
import java.util.Scanner;

public class Loops {

    //NOTE: DO NOT change anything in the boiler plate
    //If I added default code it is meant to be there
    //and should not be adjusted unless otherwise noted
    //(return statments are usually changed)

    //Make a method that will return true if a given 
    //String contains between 1 and 3 'e' chars.
    //Ex.
    //loopE("eat") -> true
    //eeat -> true
    //eeeat -> true
    //eeeeat -> false

    public static boolean loopE(String str){

        int count = 0; 

        for (int i=0; i<str.length(); i++)

        {

            if (str.charAt(i) == 'e') // to check if the charcter is equal to e.

        {

            ++count;

        }

    }

    if(count >= 1 && count <= 3) //this checks if the count is between 1 and 3 then returns true or false. 

    {

        return true;

    }

    else  // not between 1-3 

    return false;

}

    //Given a String str and int n return a larger string
    //that is n copies of the original string 
    //Ex.
    //stringTimes("Code",2) ->"CodeCode"
    //stringTimes("Code",4) ->"CodeCodeCodeCode"
    public static String stringTimes(String str, int n) {

       String newStri = "";

       for(int i=0; i<n; i++) //for loop repeats n times. 

       {

           newStri = newStri + str; //each iteration the string is concatenated

       }

       return newStri; //concatenated string returned. 

    } 

    //Create a method Given a string, return the string where all of the "z"
    //Have been removed. Except do not remove a z at the start
    //or end
    //Ex.
    //stringT("zHelloz") -> "zHelloz"
    //stringT("nozthaznks") -> "nothanks"
    //stringT("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz"
    public static String stringZ(String str){

      String newStri = str.substring(0,1); // add first character to the string. 

      String newS = str.substring(1, str.length()-1); // used a replace method which replaces every Z with an empty string... nto firts or last. 

      newStri = newStri + newS.replace("z","");
      
      newStri = newStri + str.substring(str.length()- 1, str.length()); //adds last charctar to the string. 

      return newStri; //returns the string. 
        
    }

    //Create a method that contains a while loop that allows for
    //The user to input numbers until the number 0 is entered. Each time a number is 
    //entered the total will be summed and then prompted for a second number. 
    //NOTE: I require the use of scanner here to get each integer from the user
    //Assume the numbers entered are integers
    //Also note that the method is void meaning you will not need to return anything
    //It will need to sysout the numbers however
    //Below is a sample output what I would like
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 2
    // The total so far is 24.
    // Number: 3
    // The total so far is 27.
    // Number: 0
    // TOTAL ENDED --- The total is 27.
    public static void sums(){

        Scanner sc = new Scanner(System.in);

        int input=0, total=0; 

        do // do while loop... makes sure that 0 is not entered. 

        {

            System.out.println("Number: ");

            input = sc.nextInt();//uses the scanner to get the inout fromt her user. 

            total = total + input;//finds the input/finds the sum. 

            System.out.println("The total so far is "+total+".");//gives the user the total. 

        }

            while (input != 0); //while loop... checks to see if the input is not equel to 0. 

            System.out.println("Total Ended -- The total is "+total+".");

            sc.close(); //closed the scanner. 

        }

    public static void main(String[] args) {
        // Add code to help test your methods here
        System.out.println("Testing for method loopE");

        System.out.println(loopE("eat"));

        System.out.println(loopE("eeat"));

        System.out.println(loopE("eeeat"));

        System.out.println(loopE("eeeeat"));

        System.out.println("\n\nTesting for method stringTimes");

        System.out.println(stringTimes("code",2));

        System.out.println(stringTimes("code",4));

        System.out.println("\n\nTesting for method stringZ");

        System.out.println(stringZ("zHelloz"));

        System.out.println(stringZ("nozthaznks"));

        System.out.println(stringZ("xksiazdjaasldzsajzasdz"));

        System.out.println("\n\nTesting for method sums");

        sums();

    }
    
}


