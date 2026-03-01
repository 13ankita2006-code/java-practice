public class CheckPrimeNo{
    public static void main(){
        int n=34;
        boolean isPrime= true;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                isPrime= false;
                break;
            }
        }
        if(isPrime && n>1){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not Prime number");
        }
    }
}


public class CheckPrimeNO{
    public static void main(String[] args){
        int n=17;
        boolean isPrime= true;
        for(int i=2; i<=n; i++){
            if(n%i==0){
                isPrime= false;
                break;
            }
        }
        if(isPrime && n>1)
            System.out.println("Prime Number");
        else
            System.out.println("Not prime number");
        
    }
}


public class CheckPrimeNo{
    public static void main(String[] args){
        int n=19;
        boolean isPrime= true;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                isPrime= false;
                break;
            }
        }
        if(isPrime && n>1)
            System.out.println("Prime number");
        else
            System.out.println("NOt prime number");
    }
}
