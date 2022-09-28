public class Exe3_6 {
    public static void main(String[] args) {
        Integer num=0;
        Integer sum=0;
        for(int i=1;i<=100;i++){
            if(i%7==0){
                num++;
                sum+=i;
            }
        }
        System.out.println("所求个数为"+num);
        System.out.println("所求总和为"+sum);
    }
}
