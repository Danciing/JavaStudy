import java.util.Scanner;

public class Exe5_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int num=0;
        int multi=1;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)>='a'){
                num+=multi*(10+(str.charAt(i)-'a'));
            }
            else{
                num+=multi*(Integer.parseInt(""+str.charAt(i)));
            }
            multi*=16;
        }
        System.out.println(num);
    }
}
