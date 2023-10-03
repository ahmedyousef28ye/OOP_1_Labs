// library
import java.util.Scanner;
// Main class
public class IAU_TEST{
    

    
    public  static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        
        String str=input.nextLine();
        char a =input.nextLine().charAt(0);
        String str1="";
        int count=0;
        int s=0;
        for(int i=0 ;i<str.length();i++){
            if(str.charAt(i)!=a){
                str1=str1+str.charAt(i);
                

            }
            else if(str.charAt(i)==a){
                count++;
            

            }
            if(count>2){
                break;
            }
           s=i;


        }
        for(int i=s ;i<str.length();i++){
            
                str1=str1+str.charAt(i);
        }

            
        
        

        System.out.println(str1);

        

        input.close();

    
    
    
    
    
}
}