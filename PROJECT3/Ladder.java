

public class Ladder {
    // Panels are the physical glass or tempered glass sheets
    public int panels;
    // ladder is the ladder structure (2d array)
    public int[][] ladder;
    // round counter
    public static int round = 1;

    public static Scanner sc = new Scanner(System.in); 

    public Ladder(){

        panels = 5; 


    }


    public ladder(int panel){

        panels = panel; 

    }

    public ArrayList < Integer > selecter = new ArrayList < Integer > (); 

    public static int getSelecter(){

        int convertedSelecter = 0; 

        String selecter; 

        System.out.println("Enter your selection: ");

        selector = sc.nextLine(); 

        if(selecter == "L" || selector == "|"){

            convertedSelecter = 0; 

            System.out.println(selecter);

            return convertedSelecter; 

        } else if (selecter == "R" || selector == "r"){

            convertedSelecter = 1; 

            System.out.println(selecter);

            return convertedSelecter; 

        } else{

            System.out.println( "Invalid Selection, Please try again.");

        }

        return convertedSelecter; 

    }

    public void printLadderBlank(){
        try {
            System.out.println("|||||| ---- Start");
            for (int i = 0; i < ladder.length; i++) {
                System.out.print("|"+" || "+"|");
                System.out.println();
            }
            System.out.println("|||||| ---- Finish");
        } catch (Exception e) {
            System.out.println("ERROR LADDER IS NOT CREATED OR IS NULL...");
        }
    }
    

}
