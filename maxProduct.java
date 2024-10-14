import java.util.*;
public class maxProduct {
    public static int maxProduct(int []a){
        int max = a[0];
        int m = a[0];
        int min = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]>0){
                max=Math.max(a[i],max*a[i]);
                min=Math.min(a[i],min*a[i]);
            }
            else if(a[i]==0){
                min=max=0;
            }
            else {
                int temp=max;
                max=Math.max(a[i],max*a[i]);
                min=Math.min(a[i],temp*a[i]);
            }
            m=Math.max(m,max);
        }
        return m;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int val = maxProduct(a);
        System.out.println(val);
    }
}
