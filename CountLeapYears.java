public class CountLeapYears{
    public static void main(String[] args){
        int start=2000, end=2020;
        int count=0;
        for(int i=start; i<=end; i++){
            if((i%400==0)||(i%4== 0 && i%100 !=0)){
                count++;
            }    
        }
        System.out.println(count);
    }
}

public class CountLeapYears{
    public static void main(){
        int start=2000, end= 2020;
        int count=0;
        for(int i=start; i<=end; i++){
            if((i%400==0)||(i%4==0 && i%100!=0)){
                count++;
            }
        }
        System.out.print(count);
    }
}

public class CountLeapYears{
    public static void main(String[] args){
        int start=2000, end=2020;
        int count=0;
        for(int i=start; i<=end; i++){
            if((i%400 ==0)||(i%4==0 && i%100!=0)){
                count++;
            }
        }
        System.out.print(count);
    }
}