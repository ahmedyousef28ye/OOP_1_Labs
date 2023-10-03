//Task 2
import java.util.Scanner;
public class IAU_TEST {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First Name");
        String Fname = input.next();
        System.out.println("Middle Name");
        String Mname = input.next();
        System.out.println("Last Name");
        String Lname = input.next();
        System.out.print("Age");
        int Age = input.nextInt();
        System.out.print(Fname.charAt(0));
        int midlle = (Mname.length()/2);
        System.out.print(Mname.charAt(midlle));
        System.out.print(Lname.charAt(Fname.length()-1));//there is a problem here
        System.out.print(Age*100);
        
        
        
        






        


 }
}


        
        
        
        






        


