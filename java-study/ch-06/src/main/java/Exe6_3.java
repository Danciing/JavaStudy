import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe6_3 {
    public static void countPrimes3(int n){
        List<Integer> res=new ArrayList<>();
        if(n<=2){
            System.out.println("not a primie");
        }
        else{
            boolean flag;
            for(int i=2;i<=n;i++){
                flag=true;
                System.out.print(i+" ");
                System.out.println(res);
                for(int j:res){
                    if(i%j==0){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    res.add(i);
                }
            }
        }
        System.out.println(n+"之内有"+res.size()+"个质数");
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("input a number:");
        int n=input.nextInt();
        countPrimes3(n);
    }
}
