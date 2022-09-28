import java.util.Scanner;

public class Exe3_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Integer num=input.nextInt();
        if(num.compareTo(3)>=0&&num.compareTo(5)<=0){
            System.out.println("春季");
        }
        else if(num.compareTo(6)>=0&&num.compareTo(8)<=0){
            System.out.println("夏季");
        }
        else if(num.compareTo(9)>=0&&num.compareTo(11)<=0){
            System.out.println("秋季");
        }
        else{
            System.out.println("冬季");
        }
    }
}
