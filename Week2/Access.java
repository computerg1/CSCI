package Week2;

public class Access {
    // default, public, private, and protected
    // default is used to give access to everything in the package
    // public is similar to default but give access everywhere 
    // private is only in this class
    // protected only in this package and extend (subclass)

    String cat1 = "Momo";
    public String cat2 = "Appa";


    public String getCat1(){
        return cat1;
    }
    
}
