public class DecimaltoOctal{
    public static void main(String[] args){
        int n=100, octal=0, place=1;
        for(; n!=0; n/=8){
            octal+=(n%8)*place;
            place*=10;
        }
        System.out.print(octal);
    }
}

public class DecimaltoOctal{
    public static void main(String[] args){
        int n=100, octal=0, place=1;
        for(; n!=0; n/=8){
            octal+= (n%8)*place;
            place*=10;
        }
        System.out.print(octal);
    }
}

public class DecimaltoOctal{
    public static void main(String[] args){
        int n=100, octal=0, place=1;
        for(; n!=0; n/=8){
            octal+= (n%8)*place;
            place*= 10;
        }
        System.out.println(octal);
    }
}