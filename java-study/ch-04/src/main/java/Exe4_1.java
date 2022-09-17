import java.util.Scanner;

public class Exe4_1 {
    public static void main(String[] args) {
        int t;
        int num[]=new int[16];
        for(int i=0;i<10;i++){
            num[i]=(int)(Math.random()*100);
        }
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(num[i]>num[j]){
                    t=num[j];
                    num[j]=num[i];
                    num[i]=t;
                }
            }
        }
        for(int i=0;i<10;i++){
            System.out.print(num[i]+" ");
        }
        Scanner input=new Scanner(System.in);
        t=input.nextInt();
        for(int i=0;i<=10;i++){
            if(i==10){
                num[i]=t;
                break;
            }
            if(t<num[i]){
                for(int j=10;j>i;j--){
                    num[j]=num[j-1];
                }
                num[i]=t;
                break;
            }
        }
        for(int i=0;i<=10;i++){
            System.out.print(num[i]+" ");
        }
    }
}
