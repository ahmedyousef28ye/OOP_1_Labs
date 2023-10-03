Task 3
import java.util.Scanner;
public class IAU_TEST {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter");
        String Sent = input.next();
        int cou =0;
        int Le = Sent.length();
        for(int i=0;i<Le;i++){
            if((Sent.charAt(i)=='M' || Sent.charAt(i) == 'm') && (cou<3)){
                cou=cou+1;
                continue;
                
                
            }
            else{
                System.out.print(Sent.charAt(i));
            }
            

        }
        













        input.close();
        
        

 }
}
