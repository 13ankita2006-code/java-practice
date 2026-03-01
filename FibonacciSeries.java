 public class FibonacciSeries{
    public static void main(String[] args){
        int n=10;
        int t1=0, t2=1;
        System.out.print(t1+" "+t2+" ");
        for(int i=3; i<=n; i++){
            int next= t1+t2;
            System.out.print(next+" ");
            t1= t2;
            t2= next;
        }
    }
} 

public class FibonacciSeries{
    public static void main(String[] args){
        int n=9; 
        int a=0, b=1;
        System.out.print(a+" "+ b+ " ");
        for(int i=3; i<=n; i++){
            int next=a+b;
            System.out.print(next+" ");
            a=b;
            b=next;
        }

    }
}

public class FibonacciSeries{
    public static void main(String[] args){
        int n=15;
        int a=0, b=1;
        System.out.print(a+" "+b+" ");
        for(int i=3; i<=n; i++){
            int next=a+b;
            System.out.print(next+" ");
            a=b;
            b=next;
        }

    }
}