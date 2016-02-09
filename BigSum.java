import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.next());
        int[] intArr = new int[size];
        int index = 0;
        while(scan.hasNext()){
            intArr[index] = Integer.parseInt(scan.next());
            index++;
        }
        long sum = 0;
        for(int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }
        System.out.println(sum);
        scan.close();
    }
}
