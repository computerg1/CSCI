package Week2;

public class Access {
    // default, public, private, protected

    // default is used to give access to everything in the package
    // public is similar to default but gives access everywhere
    // private is only in this class 
    // protected on this package and extend (subclass)

    protected String cat1 = "Momo";
    private String cat2 = "Appa";

    //getter
    public String getCat1() {
        return cat1;  
    }
    public String getCat2(){
        return cat2;
    }
    //setter
    public void setCat1(String catName) {
        cat1 = catName;

    }
}
