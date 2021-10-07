package HW1;
// Make a method that accepts a string and an integer and a char and will return the string with the char
// replaced at the integer given
// EX I MAKE BREAD, 2, T
//    I TAKE BREAD
// remember computer counting starts at 0:
// HELLO
// 01234
public class Replace {

public static void main(String[] args) { // Main method

    String appleBro = "Andrew loves programing, not\n"; //assigned string with words and new line.

    System.out.println("Before: " + appleBro); //printed beofre so I can see what the string looks like. 

    appleBro = appleBro.replaceAll("not", "").replaceAll(",", "."); //used replace all and did a double replace. 

    System.out.println("After: " + appleBro); //printed after to see changes. 

    String classExample = "I MAKE BREAD, 2, T\n"; //assigned string with words and new line.

    System.out.println("Before: "+ classExample);//printed beofre so I can see what the string looks like.

    classExample = classExample.replaceAll("MAKE","TAKE").replaceAll("2, T","").replaceAll(",", ""); //used replace all and did a triple replace.

    System.out.println("After: " + classExample);//printed after to see changes.

    String classExample2 = "HELLO\n"; //assigned string with words and new line.

    System.out.println("Before: " + classExample2);//printed beofre so I can see what the string looks like. 

    classExample2 = classExample2.replaceAll("HELLO", "01234");//used replace all and did a single replace. 

    System.out.println("After: " + classExample2);//printed after to see changes.

    

    





}


}
    

