//pacages


// libraryes
import java.util.Scanner;
import java.util.Date;


//main class
public class IAU_Test{
    //main method
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        account ac=new account(123,20000,4);
        ac.withDraw(2.500);
        
        Date date=ac.accesDate();
        double bal=ac.accesbal();
        double id=ac.accesid();
        System.out.println("ID    "+id+"DATE:   "+date+"balance   "+bal);


        input.close();


    }
}

class account{
    private int id=0;
    private double balance=0;
    private double annualIntrest=0;
    private Date date;
    account(){

    }
    account(int id,int bal,int anual){//i have to try that
        this.id=id;
        this.balance=bal;



    }
    Date accesDate(){
        return date;
    }
    double accesid(){
        return this.id;
    }
    double accesbal(){
        return this.balance;
    }
        
    double Intrest(){
        return annualIntrest;
    }
    void withDraw(double price){
        balance=balance-price;

    }
    void Deposit(double price){
        balance=balance+price;

    }

}


