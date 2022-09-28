import java.util.Scanner;

public class Exe3_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Integer month= input.nextInt();
        Integer day=input.nextInt();
        Integer ans=day;
        switch (month){
            case 12:
                ans+=30;
            case 11:
                ans+=31;
            case 10:
                ans+=30;
            case 9:
                ans+=31;
            case 8:
                ans+=31;
            case 7:
                ans+=30;
            case 6:
                ans+=31;
            case 5:
                ans+=30;
            case 4:
                ans+=31;
            case 3:
                ans+=28;
            case 2:
                ans+=31;
        }
        System.out.println(ans);
    }
}
