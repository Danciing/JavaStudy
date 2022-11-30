import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe6_4 {
    public static List<Integer> minPrime(int n){
        List<Integer> res=new ArrayList<>();
        if(n<=2){
            System.out.println("not a primie");
        }
        else{
            boolean flag;
            for(int i=2;i<=n;i++){
                flag=true;
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
        return res;
    }
    public static void PrimeFactorization(int n){
        List<Integer>resx=new ArrayList<>();
        int t=n;
        while(n>2){
            List<Integer>res=minPrime(n);
            for(int i:res){
                if(n%i==0){
                    resx.add(i);
                    n/=i;
                }
            }
        }
        System.out.print(t+"=");
        for(int i=0;i<resx.size()-1;i++){
            System.out.print(resx.get(i)+"*");
        }
        System.out.print(resx.get(resx.size()-1));
    }

    public static void main(String[] args) {
        System.out.print("input a number:");
        Scanner input=new Scanner(System.in);
        PrimeFactorization(input.nextInt());
    }
}
