import java.util.*;

public class areaofrectangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Length of Rectangle = ");
        double L=sc.nextDouble();
        System.out.print("Breadth of Rectangle = ");
        double B=sc.nextDouble();

        double Area = L*B;

        System.out.println("Area of Rectangle = " +Area);

    }
}