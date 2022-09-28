import java.util.Scanner;

public class Exe5_2 {
    public static void main(String[] args) {
        boolean is_found=false;
        Scanner in=new Scanner(System.in);
        char ch=(in.nextLine()).charAt(0);
        String str=in.nextLine();
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                is_found=true;
                System.out.println(i);
                break;
            }
        }
        if(is_found==false){
            System.out.println("Not Found");
        }
    }
}
