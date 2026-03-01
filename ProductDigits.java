public class ProductDigits{
    public static void main(String[] args){
        int n=452;
        int product=1; 
        for(; n!=0; n/=10){
            product*=n%10;
        }
        System.out.println(product);

    }
}

public class ProductDigits{
    public static void main(String[] args){
        int n=34242;
        int prod=1;
        for(; n!=10; n/=10){
            prod*=n%10;
        }

        System.out.print(prod);
    }
}

public class ProductDigits{
    public static void main(String[] args){
        int n=34243;
        int prod=1;
        for(;n!=0; n/=10){
            prod*=n%10;
        }
        System.out.print(prod);
    }
}