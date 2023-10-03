// library
import java.util.Scanner;
// Main class
public class IAU_TEST{
    public static enum Names{Ahmed,Mohamed,Abdulrahman,Hussain
        
    };

    
    public  static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. A password must have at least eight characters. \r\n" + //
                "2. A password consists of only letters and digits. \r\n" + //
                "3. A password must contain at least two digits ");

        String str=input.nextLine();
        if(isVailid(str)){
            System.out.println("Vailid!");
            System.out.println(str);


        }
        else{
            System.out.println("Go to the hell");
        }


        

        

        input.close();

    }
    public static boolean isVailid(String x){
        if (x.length()<8){
            return false;
        }
        int count=0;
        boolean Let=true;
        boolean Dig=true;
        for(int i=0;i<x.length();i++){
            if(!Character.isDigit(x.charAt(i))&& !Character.isLetter(x.charAt(i))){
                
                Dig=false;
                Let=false;
            }
            
            if(Character.isDigit(x.charAt(i))){


                count++;

            }

        }
        if(count>=2 || Let==false || Dig==false){
            return true;
        }
        else{
            return false;
        }
        

        
        
    }
    
    
    
}