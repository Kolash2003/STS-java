import java.util.*;
public class MaxEquiSum {
    public static int getMaxEquiSum(int[] arr){
        int leftsum = 0;
        int rigthsum = 0;

        for(int i=0; i<arr.length; i++){
            rigthsum += arr[i];
        }

        for(int i=0; i<arr.length; i++){
            rigthsum = rigthsum - arr[i];
            if(leftsum == rigthsum){
                return leftsum;
            }
            leftsum = leftsum + arr[i];
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int val = getMaxEquiSum(arr);
        System.out.println(val);
    }
}
