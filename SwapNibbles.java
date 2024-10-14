import java.util.*;
public class SwapNibbles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int val = in.nextInt();
        int swapped = ((val & 0x0f) << 4) | ((val & 0xf0) >> 4);

        System.out.println(swapped);
        in.close();
    }
}
