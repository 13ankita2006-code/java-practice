public class BinarytoDecimal{
    public static void main(String[] args){
        long binary=1010;
        int decimal=0;
        int base=1;
        for(; binary>0; binary/=10){
            int lastDigit= (int)(binary %10);
            decimal += lastDigit* base;
            base*=2;
        }
        System.out.println("Decimal: "+decimal);
    }
}

public class BinarytoDecimal{
    public static void main(String[] args){
        long binary=11010101;
        int decimal=0;
        int base=1;
        for(; binary>0; binary/=10){
            int lastDigit= (int)(binary%10);
            decimal += lastDigit* base;
            base*=2;
        }
        System.out.print(decimal);
    }
}

public class BinarytoDecimal{
    public static void main(String[] args){
        long binary=1011110;
        int decimal=0;
        int base=1;
        for(; binary>0; binary/=10){
            int lastDigit= (int)(binary%10);
            decimal += lastDigit* base;
            base*=2;
        }
        System.out.println(decimal);
    }
}