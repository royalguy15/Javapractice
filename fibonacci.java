import java.util.*;

public class fibonacci {
    public static void main(String args[]){

        int a=0,b=1;
        int i=1,c;
        
        System.out.print(a +" "+ b);
        while(i<10){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" " +c);
            i++;
        }
        

    }
    
}
