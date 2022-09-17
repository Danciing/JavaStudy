public class Exe4_2 {
    public static void main(String[] args) {
        int num[][]=new int[11][11];
        for(int i=0;i<10;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    num[i][j]=1;
                }else{
                    num[i][j]=num[i-1][j-1]+num[i-1][j];
                }
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
