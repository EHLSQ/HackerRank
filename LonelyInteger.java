import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

        res = lonelyinteger(_a);
        System.out.println(res);

    }

 public static int lonelyinteger(int[] array){
        Arrays.sort(array);
        boolean previous = false;
        boolean next = false;
        if( array.length == 1) {
            return array[0];
        }
        for(int i = 1; i < array.length; i++) {
            if(i == array.length - 1) {
                return array[i];
            }
            if(array[i-1] == array[i]) {
                previous = true;
            }  else {
                previous = false;
            }

            if (array[i+1] == array[i]) {
                next = true;
            } else {
                next = false;
            }

            if(!previous && !next) {
                return array[i];
            }
        }
        return 0;
    }
}
