package HW5;

import java.util.*;

public class ArrayListPlayground {
    public static void main(String[] args) {
    // Question 1
    // Write Java statements that do the following:
    // a) Declare an arrayList nums of 15 elements of type int.
    // b) Output the value of the tenth element of the array nums.
    // c) Set the value of the 5th element of the array alpha to 99.
    // d) Set the value of the 9th element of the array alpha to the sum of the 6th and 13th elements of the array nums.

    //Question 1A

    int[] alpha = new int[15];

    alpha[0] = 1;

    alpha[1] = 2;

    alpha[2] = 3;

    alpha[3] = 4;

    alpha[4] = 5;

    alpha[5] = 6;

    alpha[6] = 7;

    alpha[7] = 8;

    alpha[8] = 9;

    alpha[9] = 10;

    alpha[10] = 11;

    alpha[11] = 12;

    alpha[12] = 13;

    alpha[13] = 14;

    alpha[14] = 15;

    //Question 1B

    System.out.println("value of 10:-" + alpha[10]);

    //Question 1C

    alpha[5] = 99; 

    System.out.println("\n value of index of 5:-" + alpha[5]);
    
    //Question 1D

    alpha[9] = alpha[6] + alpha[13]; 

    System.out.println("\n value of index of 9 is sum of 6 + 13:- " + alpha[9]);

    // Question 2
    // a) create an arrayList of Strings that contain each day of the week.(starting on monday)
    // b) output each of the days of the week
    // c) output the days of the week we have class
    // d) output the days of the week that we have class 
    // e) change the arrayList to start on Sunday

    ArrayList < string > days = new ArrayList < String > (); //ArryList to strioe the days of the week. 
        
        days.add("Monday"); // added the days to the list

        days.add("Tuesday"); // added the days to the list

        days.add("Wednesday"); // added the days to the list

        days.add("Thursday"); // added the days to the list

        days.add("Friday"); // added the days to the list

        days.add("Saturday"); // added the days to the list

        days.add("Sunday"); // added the days to the list

        Iterator < String > it = days.iterator(); 

        


    // Question 3 
    // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
    // b) return the largest and smallest number
    // c) return the ArrayList sorted smallest to largest
    // d) take that ArrayList see if its size is divisable by 3 and then output the ArrayList in a matrix format
    // NOTE: make the matrix n X 3 so it can be n rows by 3 columns 
    // EX. ArrayList [1,2,3,4,5,6,7,8,9]
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers and add them until it is
    // ArrayList Size: 7
    // Please enter 2 more numbers to create the matrix...
    // 

        Scanner sc =  new Scanner(System.in); 

        ArrayList < integer > arr = new ArrayList < integer > (1);

        while(true){

            System.out.println("Enter a number(0 to exit) :");

            int n = sc.nextint();

            if(n == 0){

                break;
            }

            else{

                arr.add(n); 
            }

        }

        System.out.println("largest item: " + largestVal(arr));

        System.out.println("Smallest Item: " + smallestVal(arr));

        System.out.println("sortedList: " + Sorted(arr));

        public static int smallestVal(ArrayList < integer > arr){

            int n = arr.size();

            int min = arr.get(0); 

            for (int i = 1; i < n; i++){

                if(arr.get(i) < min){

                    min = arr.get(i); 

                }
            }

            return min;

        }


        public static int largestVal(ArrayList < integer > arr){

            int n = arr.size();

            int max = arr.get(0); 

            for (int i = 1; i < n; i++){

                if(arr.get(i) > max){

                    max = arr.get(i); 

                }
            }

            return max;

        }

        public static ArryList < integer > Sorted(ArrayList < integer > arr){

            ArrayList < integer > sec_list = new ArrayList < integer > ();

            sec_list = (ArrayList < integer > ) arr.clone();

            Collections.sort(sec_list); 

            return sec_list;

        }

        public static void fromMatrix(ArrayList < integer > arr) {

            int n = arr.size(); 

            if(n % 3 != 0){

                Scanner x = new Scanner(system.in); 

                System.out.println("Please enter " + (3 - n % 3) + " more numbers to create matrix. ");
                
                for (int i = 0; i < (3 - n % 3); i++){

                    int p = x.nextint(); 
                    
                    arr.add(p); 
                }

                x.close(); 
            }

            for(int i = 0; i < arr.size(); i++){

                if( i % 3 == 0)

                    System.out.println("\n");

                System.out.println(arr.get(i) + "\t");

            }

    }
   
}
