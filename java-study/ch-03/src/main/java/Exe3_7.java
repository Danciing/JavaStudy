public class Exe3_7 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=0;j<=9;j++){
                for(int k=0;k<=9;k++){
                    Integer num=i*100+j*10+k;
                    if(num.equals(i*i*i+j*j*j+k*k*k)){
                        System.out.print(""+num+" ");
                    }
                }
            }
        }
    }
}
