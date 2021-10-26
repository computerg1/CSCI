package Week2;
// static makes it so you dont need to create an object to use a global variable


//The reason you are warned away from static methods is that using them forfeits one of the
//advantages of objects. Objects are intended for data encapsulation. This prevents unexpected side
//effects from happening which avoids bugs. Static methods have no encapsulated data* and so
//don't garner this benefit.
public class CatNames {
    String catName = "Momo";
    // cant have 2 of the same variable
    //String catName = "Appa";

    //used for static
    //static String catName = "Momo";
    public static void main(String[] args) {
        String catName = "Appa";
        System.out.println(catName);

        //CatNames cat = new CatNames();
        //System.out.println(cat.catName);


        // Well lets dive deeper into Java Access Modifiers 
        Access gregHouse = new Access();
    
        System.out.println(gregHouse.cat1);
        System.out.println(gregHouse.cat2);

        //System.out.println(gregHouse.getCat1());
        
        
        
    }
    // also a way to access a variable now that its a static reference
    // public static void main(String[] args) {
    //     String catName = "Appa";
    //     System.out.println(catName);

    //     //CatNames cat = new CatNames();
    //     System.out.println(CatNames.catName);
        
    // }



    
}


// we have been using static for the friend stuff

