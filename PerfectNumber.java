public class PerfectNumber{
    public static void main(String[] args){
        int n=6, sum=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not perfect Number");
    }
}

public class PerfectNumber{
    public static void main(String[] args){
        int n=23, sum=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n)
            System.out.print("Perfect Number");
        else
            System.out.print("Not Perfect Number");
    }
}

public class PerfectNumber{
    public static void main(String[] args){
        int n=34,sum=0;
        for(i=1; i<=n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n)
            System.out.print("Perfect number");
        else    
             System.out.print("not Perfect number");
    }
}