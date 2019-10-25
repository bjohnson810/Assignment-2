import java.util.Scanner;

public class myDatabase {
    public static void main(String[] args){
        int n;
        int slen;
        Scanner inp = new Scanner(System.in);
        System.out.println("How many students need their data entered?");
        n = inp.nextInt();
        inp.nextLine();

        Student[] s = new Student[n];

        Scanner input = new Scanner(System.in);

        for(int i=0; i<n; i++){
            s[i] = new Student();

            System.out.println("Please enter the student's first name.");
            String fname = input.nextLine();
            while(!alphabetOnly(fname)){
                System.out.println("Please enter a valid first name.");
                fname = input.nextLine();
            }

            System.out.println("Please enter the student's last name.");
            String lname = input.nextLine();
            while(!alphabetOnly(lname)){
                System.out.println("Please enter a valid last name.");
                lname = input.nextLine();
            }

            System.out.println("Please enter the student's PeopleSoft ID.");
            int pID = input.nextInt();
            int length = Integer.toString(pID).length();
            while(length >7){
                System.out.println("Please enter a valid-length PeopleSoft ID.");
                pID = input.nextInt();
                length = Integer.toString(pID).length();
            }
            input.nextLine();

            String[] standingList = {"Freshman", "Sophomore", "Junior", "Senior"};
            boolean flag = false;
            System.out.println("Please enter the student's class standing.");
            String standing = input.nextLine();

            while(flag == false){
                for(int j=0; j<4; j++){
                    if (standing.equals(standingList[j])){
                        flag = true;
                    }
                }

                if(flag == true) {
                    break;
                }
                else{
                    System.out.println("Please enter a valid class standing.");
                    standing = input.nextLine();
                }
            }

            System.out.println("Please enter the student's email.");
            String email = input.nextLine();
            while(!emailBool(email)){
                System.out.println("Please enter a valid email.");
                email = input.nextLine();
            }

            System.out.println("Please enter the student's street address.");
            String address = input.nextLine();
            while(!streetBool(address)) {
                System.out.println("Please enter a valid street address.");
                address = input.nextLine();
            }

            System.out.println("Please enter the student's city.");
            String city = input.nextLine();
            while(!alphabetOnly(city)){
                System.out.println("Please enter a valid city name.");
                city = input.nextLine();
            }

            String[] stateArr = {"AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN",
                    "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY"};

            System.out.println("Please enter the student's state (abbreviation).");
            String state = input.nextLine();

            boolean marker = false;
            while(marker == false){
                for(int j=0; j<50; j++){
                    if (state.equals(stateArr[j])){
                        marker = true;
                    }
                }

                if(marker == true) {
                    break;
                }
                else{
                    System.out.println("Please enter a valid state abbreviation.");
                    state = input.nextLine();
                }
            }

            System.out.println("Please enter the student's zip code.");
            int zip = input.nextInt();

            length = Integer.toString(zip).length();
            while(length !=9){
                System.out.println("Please enter a valid-length zip code.");
                zip = input.nextInt();
                length = Integer.toString(zip).length();
            }
            input.nextLine();

            s[i].getInfo(fname, lname, pID, standing, email, address, city, state, zip);
        }


        System.out.println("Student details, Department of ILT");
        for(int i=0; i<n; i++){
            System.out.println("Student " + Student.increment()+ ": ");
            s[i].displayInfo();
        }

        System.out.println("Number of students: " + n);

    }

    public static boolean alphabetOnly(String str)
    {
        return ((!str.equals(""))
                && (str != null)
                && (str.matches("^[a-zA-Z]*$")));
    }

    public static boolean emailBool(String inp){
        return inp.matches("^[a-zA-Z1-9._-]+@[a-zA-Z1-9]+.(com|edu|org)$");
    }

    public static boolean streetBool(String inp){
        return inp.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

}