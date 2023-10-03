// library
import java.util.Scanner;
// Main class
public class IAU_TEST{
    public static enum Names{Ahmed,Mohamed,Abdulrahman,Hussain
        
    };

    
    public  static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Values for 4 weeks");
        int arr[][]=new int [4][7];
        for(int i =0 ; i<4;i++){
            System.out.println("Week "+(i+1)+":");
            for (int j=0 ;j<7;j++){
                
                int Var = input.nextInt();
                arr[i][j]=Var;
                

            }
            
            
            

        }
        for(int r=0;r<4;r++){
                double AVR=0;
                double sum=0;
                for(int c=0;c<7;c++){
                    sum=sum+arr[r][c];

                    

                }
                AVR=sum/7;
                System.out.print("Week "+r);
                printt(AVR);
                System.out.println(" ");

            }


        

        

        input.close();

    }
    public static void  printt(double x){
        if(x>=6){
            System.out.print("HIGH"+x);
        }
        if(x<6 && x>3 ){
            System.out.print("LAW"+);
        }
        if(x<=3 ){
            System.out.print("LAW"+x);
        }


    }
    
}