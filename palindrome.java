public class palindrome {
    public static void main(String args[]){
        int n=122;
        int rev=0,temp=n,rem;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(n==rev){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
    
}
