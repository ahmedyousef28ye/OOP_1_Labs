import java.util.Scanner;
public class IAU_TEST {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter nuber of Students");
        int Nst = input.nextInt();
        int max = 0;
        String NameMax="";
        for(int i=0;i<Nst;i++){
            System.out.println("Enter the name and the score"+"("+(i+1)+")");
            String Name = input.next();
            int score = input.nextInt();
            if(score>max){
                max=score;
                NameMax=Name;
            }






        }
        System.out.println("The name is " + NameMax + "the score is"+max);

 }
}
