import java.util.*;

public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,i,counter=0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for(i=1;i<n;i++){
            if (n%1==0){
                counter++;
            }

        }
        if(counter == 0){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number");
        }
    }
}