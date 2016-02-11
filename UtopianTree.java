import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = 1;
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            for(int j = n; j > 0; j-=2 ) {
                height*=2;
                if((j-1) > 0){
                    height += 1;
                }
            }
            System.out.println(height);
            height = 1;
        }
    }
}
