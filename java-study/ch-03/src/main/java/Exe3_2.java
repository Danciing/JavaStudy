import java.util.Scanner;

public class Exe3_2 {
    public static void main(String[] args) {
        Integer num;
        Scanner input=new Scanner(System.in);
        num=input.nextInt();
        if(num.compareTo(60)>=0){
            System.out.println("合格");
        }else{
            System.out.println("不合格");
        }
    }
}
