package Week5;

public class moreloops {

    public static String everyNth(String str, int n) {
        String result = "";
        for (int i=0; i<str.length(); i = i + n){
          result = result + str.charAt(i);
        }
        return result;
    }
    //Given a string, return a string where for every char in the original, there are two chars.
    public static String doubleChar(String str){
        String result = "";
          for (int i = 0; i <=str.length()-1;i++) {
            result += str.charAt(i);
            result += str.charAt(i); }
            return result;
    }
    //Count the number of times XX is in a given string
    public static int countXX(String str){
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
          if (str.substring(i, i+2).equals("xx")){ 
          count++;
          }
        }
        return count;
    }
    // given a string create a new string that will move the first char to the end of the following 2 chars
    // EX.
    //oneTwo("abc") → "bca"
    //oneTwo("tca") → "cat"
    //oneTwo("tcagdo") → "catdog"
    public static String oneTwo(String str){
        String result = "";
        for(int i=0; i <str.length()-2; i += 3)
        {
            result = result + str.substring(i+1,i+3) + str.charAt(i);
        }
        return result;
    }

    //Create a Palindrome checker 
    //EX.
    //tacocat -> True
    //test -> False
    static boolean isPalindrome(String str){
 
      // Pointers pointing to the beginning
      // and the end of the string
      int i = 0, j = str.length() - 1;

      // While there are characters to compare
      while (i < j) {

          // If there is a mismatch
          if (str.charAt(i) != str.charAt(j))
              return false;

          // Increment first pointer and
          // decrement the other
          i++;
          j--;
      }

      // Given string is a palindrome
      return true;
    }

      public static void main(String[] args) {
          System.out.println(everyNth("tester", 2));
          System.out.println(doubleChar("tester"));
          System.out.println(countXX("asdjfasioXXaksjdklasxxklasjdiosaxx"));
          System.out.println(oneTwo("tacocat"));
          System.out.println(isPalindrome("tacocat"));
      }


 
      
    
}
