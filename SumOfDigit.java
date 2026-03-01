public class SumOfDigit{
    public static void main(String[] args){
        int n=1234;
        
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
            System.out.print(sum);
    }
}

public class SumOfDigit{
    public static void main(String[] args){
        int n=867756;
        int rem, sum=0;
        while(n>0){
            rem= n%10;
            sum+=rem;
            n/=10;
        }
        System.out.print(sum);
    }
}

public class SumOfDigit{
    public static void main(String[] args){
        int n=34225;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        System.out.print(sum);
    }
}