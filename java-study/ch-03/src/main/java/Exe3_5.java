public class Exe3_5 {
    public static void main(String[] args) {
        Integer sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==1){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
