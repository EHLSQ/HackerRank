import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int height = Integer.parseInt(scan.next());
        int spaces = height - 1;
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for(int k = 0; k < height - spaces; k++) {
                System.out.print("#");
            }
            spaces--;
            System.out.println();
        }
    }
}
