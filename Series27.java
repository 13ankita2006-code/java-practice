public class Series{
    public static void main(String[] args){
        int n=5;
        long term=9;
        long sum=0;
        for(int i=1; i<=n; i++){
            sum+=term;
            term=term*10+9;
        
        }
        System.out.print("Sum: "+sum);
    }
}

public class Series{
    public static void main(String[] args){
        int n=4;
        long term=9;
        long sum=0;
        for(int i=1; i<=n; i++){
            sum+=term;
            term=term*10+9;

        }
        System.out.print("Sum: "+ sum);
    }
}

public class Series{
    public static void main(){
        int n=8;
        long term=9;
        long sum=0;
        for(int i=1; i<=n;i++){
            sum+=term;
            term=term*10+9;
        }
        System.out.println("Sum: "+sum);
    }
}