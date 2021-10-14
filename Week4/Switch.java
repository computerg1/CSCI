package Week4;

public class Switch {
    public static void main(String[] args) {
        String day = "Wednesday";

        // switch statement this allows to test for variable equality
        // switch statements are good if you have a lot of if statements
        // switch statment has case and break statements
        
        switch(day){
            case "Monday": System.out.println("It is Monday my dudes!");
            break;
            case "Tuesday": System.out.println("It is Tuesday my dudes!");
            break;
            case "Wednesday": System.out.println("It is Wednesday my dudes! AHAHHHAHAHAHHAHAHHAH");
            break;
            case "Thursday": System.out.println("It is Thursday my dudes!");
            break;
            case "Friday": System.out.println("It is Friday my dudes!");
            break;
            case "Saturday": System.out.println("It is Saturday my dudes!");
            break;
            case "Sunday": System.out.println("It is Sunday my dudes!");
            break;
            default: System.out.println("This is not a valid day!");
        }
    }
}
