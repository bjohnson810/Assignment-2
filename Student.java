public class Student {
    private String fname;
    private String lname;
    private int pID;
    private String standing;
    private String email;
    private String address;
    private String city;
    private String state;
    private int zip;

    private static int count;

    public void getInfo(String fn, String ln, int id, String year, String mail, String add, String town, String st, int zc){
        fname = fn;
        lname = ln;
        pID = id;
        standing = year;
        email = mail;
        address = add;
        city = town;
        state = st;
        zip = zc;
    }

    public void displayInfo(){
        System.out.println("\tFirst Name: "+fname);
        System.out.println("\tLast Name " + lname);
        System.out.println("\tPeopleSoft ID: "+pID);
        System.out.println("\tClass Standing: "+standing);
        System.out.println("\tFirst Name: "+email);
        System.out.println("\tAddress: "+address);
        System.out.println("\tCity: "+city);
        System.out.println("\tState: "+state);
        System.out.println("\tZip Code: "+zip);
    }

    public void setFN(String a){
        fname = a;
    }

    public void setLN(String b){
        lname = b;
    }

    public void setID(int c){
        pID = c;
    }

    public void setStanding(String d){
        standing = d;
    }

    public void setEmail(String e){
        email = e;
    }

    public void setAdd(String f){
        address = f;
    }

    public void setCity(String g){
        city = g;
    }

    public void setState(String h){
        state = h;
    }

    public void setZip(int i){
        zip = i;
    }

    public String getFN(){
        return fname;
    }

    public String getLN(){
        return lname;
    }

    public int getID(){
        return pID;
    }

    public String getStanding(){
        return standing;
    }

    public String getEmail(){
        return email;
    }

    public String getAddress(){
        return address;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }

    public int getZip(){
        return zip;
    }


    public static int increment(){
        count = count+1;
        return count;
    }

    public static int countValue(){
        return count;
    }
}
