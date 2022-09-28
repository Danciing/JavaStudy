public class Exe4_3 {
    public static void main(String[] args) {
        int c[][]={{1,2,3},{4,5,6},{7,8,9}};
        int d[][]={{2,2,2},{1,1,1},{3,3,3}};
        int add[][]=new int[3][3];
        int multi[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                add[i][j]=c[i][j]+d[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    multi[i][j]+=c[i][k]*d[k][j];
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(multi[i][j]+" ");
            }
            System.out.println();
        }
    }
}
