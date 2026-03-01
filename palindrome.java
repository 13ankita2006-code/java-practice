public class palindrome{
    public static void main(String[] args){
        int n=8799;
        int temp= n;
        int rev=0;
        for(; temp!=0; temp/=10){
            rev=rev*10+n%10;
        }
        if(n==rev)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
    }
}

public class palindrome{
    public static void main(String[] args){
        int n=3432;
        int temp=n;
        int rev=0;
        for(; temp!=0; temp/=10){
            rev=rev*10+n%10;
        }
        if(n==rev){
            System.out.print("palindrome");
        }
        else{
            System.out.print("not palindrome");
        }
    }
}

public class palindrome{
    public static void main(String[] args){
        int n=6756;
        int temp=n;
        int rev=0;
        for(; temp!=0; tem/=10){
            rev= rev*10+temp%10;
        }
        if(n==rev)
            System.out.print("palindrome");
        else
            System.out.print("not palindrome");
    }
}