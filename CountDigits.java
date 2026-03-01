public class CountDigits{
    public static void main(String[] args){
        int n=5887;
        int count=0; 
        while(n>0){
           int rem= n%10;
            count++;
            n/=10;
        }
        System.out.print(count);
    }
}

public class CountDigits{
    public static void main(String[] args){
        int n=987887;
        int count=0;
        while(n>0){
            int rem=n%10;
            count++;
            n/=10;
        }
        System.out.println(count);
    }
}

public class CountDigits{
    public static void main(){
        int n=342;
        int count=0;
        while(n>0){
            int rem=n%10;
            count++;
            n/=10;
        }
        System.out.print(count);
    }
}