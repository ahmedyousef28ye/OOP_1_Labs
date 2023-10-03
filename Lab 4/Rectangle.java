//pacages


// libraryes
import java.util.Scanner;


//main class
public class IAU_Test{
    //main method
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        Rectangle Rec = new Rectangle(4,40);
        
        double Area =Rec.getArea();
        System.out.println(Area);
        

        input.close();


    }
}


class Rectangle{
    double width=1;
    double hight=1;
    Rectangle(){
        width=1;
        hight=1;


    }
    Rectangle(double h,double w){
        this.width=w;
        this.hight=h;

        

    }
    double getArea(){
        double Area=(1/2.0)*(width*hight);
        return Area;
    }
    public double getPerimeter()
    {
        return this.width*2 + this.hight*2 ; 
    }













}