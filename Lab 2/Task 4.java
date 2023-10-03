import java.util.Scanner;
// main class
public class IAU_TEST {

    // functions
    public static void print(int a){
        System.out.print(a);

        
        
    }
    public static void print(String a){
        System.out.print(a);

        
        
    }
    public static void print(char a){
        System.out.print(a);

        
        
    }
    public static void print(double a){
        System.out.print(a);

        
        
    }
    public static void print(){
        int a=0;
        System.out.print(a);

        
        
    }

    
    
    // main function
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        String Str= input.nextLine();
        Str=Str.trim();
        int word=1;
        for (int i =0 ;i<Str.length();i++){
            if(Str.charAt(i)==' '){
                word++;
            }
        }
        print(word);




       








        input.close();

      
        
       

 }
 
}
