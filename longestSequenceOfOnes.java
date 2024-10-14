import java.util.*;
public class longestSequenceOfOnes {
    public static int val(String str){
        int count =0;
        int maxcount=0;

        for(char digit : str.toCharArray()){
            if(digit=='1'){
                count++;
                if(count>maxcount){
                    maxcount = count;
                }
            }
            else {
                count=0;
            }
        }
        return maxcount;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binaryString = Integer.toBinaryString(n);
        int v = val(binaryString);
        System.out.println(v);

    }
}
