import java.util.Scanner;

public class Exe5_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String olds;
        olds=input.next();
        String news="";
        for(int i=olds.length()-1;i>=0;i--){
            news+=olds.charAt(i);
        }
        if(news.equals(olds)){
            System.out.println("This is a Palindrome string.");
        }else{
            System.out.println("This is not a Palindrome string.");
        }
    }
}
