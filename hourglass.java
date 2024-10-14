import java.util.Scanner;

public class hourglass {
    public static int maxHourGlass(int [][]mat, int r, int c){
        int maxsum=0;
        int sum=0;

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                sum = (mat[i][j] + mat[i][j+1] + mat[i][j+2]) + 
                (mat[i+1][j+1]) + (mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2]);
            }
            if(sum>maxsum){
                maxsum = sum;
            }
        }
        return maxsum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int [][]mat = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int val = maxHourGlass(mat, r, c);
        System.out.println(val);
    }
}
