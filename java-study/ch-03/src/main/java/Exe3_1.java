import java.util.Scanner;

public class Exe3_1 {
    public static void main(String[] args) {
        char t;
        Scanner input=new Scanner(System.in);
        t=input.next().charAt(0);
        switch(t){
            case 'a':
                t='A';
                System.out.println(t);
                break;
            case 'b':
                t='B';
                System.out.println(t);
                break;
            case 'c':
                t='C';
                System.out.println(t);
                break;
            case 'd':
                t='D';
                System.out.println(t);
                break;
            case 'e':
                t='E';
                System.out.println(t);
                break;
            default:
                System.out.println("other");
        }
    }
}
