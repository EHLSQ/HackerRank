import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        boolean[] alphabet = new boolean[26];
        int counter = 0;
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            String line = scan.nextLine().toUpperCase();
            for(int i = 0; i < line.length(); i++){
                if(Character.isLetter(line.charAt(i))){
                    alphabet[((int)line.charAt(i)) - 65] = true;
                }
            }
            for(int i =0; i < alphabet.length; i++){
                if(alphabet[i] == true){
                    counter++;
                }
            }
            if(counter == 26){
                System.out.println("pangram");
                System.exit(100);
            } else {
                counter = 0;
            }
        }
        System.out.println("not pangram");
    }
}
