// library
import java.util.Scanner;
// Main class

public class IAU_TEST{
    enum MAchin{ON,OFF,IN_PROGRESS,DONE,START};
    
    
    
    public  static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        String in = input.nextLine().toUpperCase();
        
        cheak(MAchin.valueOf(in));//return it like a string
        


        

        input.close();

    
    
    
    
    
}
public static void cheak(MAchin x){
    switch(x){
        case ON:
           System.out.print("The Machine is ON");
           break;
           case OFF:
           System.out.print("The Machine is OFF");
           break;
           case START:
           System.out.print("The Machine is STARTING");
           break;
           case IN_PROGRESS:
           System.out.print("The Machine is PROGRESS");
           break;
           case DONE:
           System.out.print("The Machine is DONE");
           break;
        

    }
    

}
}