public class SpyNumber{
    public static void main(String[] args){
        int n=868;
        int temp=n;
        int sum=0;
        int prod=1;
       for(; temp!=0; temp/=10){
            int d= temp%10;
            sum+=d;
            prod*=d;
       }
       if(sum==prod)
       System.out.println("Spy number");
       else
       System.out.println("not Spy number");
    }
}

public class SpyNumber{
    public static void main(String[] args){
        int n=4532;
        int temp=n;
        int sum=0;
         int prod=1;
         for(; temp!=0; temp/=10){
            int d=temp%10;
            sum+= d;
            prod*= d;

         }
         if(sum== prod)
         System.out.println("Spy NUmber");
         else
         System.out.println("not Spy NUmber");
    }
}

public class SpyNumber{
    public static void main(String[] args){
        int n=3241;
        int temp=n;
        int sum=0;
        int prod=1;
        for(; temp!=0; temp/=10){
            int d=temp%10;
            sum+=d;
            prod*=d;

        }
        if(sum==prod)
        System.out.println("Spy number");
        else
        System.out.println("not spy number");
    }
}