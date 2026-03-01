public class StrongNumber{
    public static void main(String[] args){
        int n=145;
        int temp=n;
        int sum=0;
        for(; temp!=0; temp/=10){
            int d=temp%10;
 int fact=1;
        

       
        for(int i=1; i<=d; i++){
            fact*=i;
            sum+=fact;
        }
    }
    if(sum==n)
        System.out.println("Strong number");
    else
        System.out.println("Not strong number");
    }
}

public class StrongNumber{
    public static void main(){
        int n=145;
       int temp=n;
        for(; temp!=0; temp/=10){
            int d=temp%10;
            int fact=1;
            int sum=0;
            for(int i=1; i<=d; i++){
                fact*=i;
                 
                sum+=fact;
            }
        }
        if(sum==n)
            System.out.println("strong number");
        else
            System.out.println("not a strong number")
    }
}

public class StrongNumber{
public static void main(String[] args){
    int n;
    int temp=n;
    for(; temp!=0; temp/=10){
        int d= temp%10;
        int fact=1;
        int sum=0;
        for(int i=1; i<=d; i++){
            fact*=i;
            sum+=fact;
        }
    }
    if(sum==n)
        System.out.println("Strong number");
    else
        System.out.println("not a strong number");

    }
}
