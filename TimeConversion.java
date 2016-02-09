import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String initial = scan.nextLine();
        if(initial.substring(initial.length()- 2).equals("PM") && !initial.substring(0,2).equals("12")){
            int hours = Integer.parseInt(initial.substring(0,2));
            hours += 12;
            String newString = "" + hours + initial.substring(2, initial.length()- 2);
            System.out.println(newString);
        } else if(initial.substring(initial.length()- 2).equals("AM") && initial.substring(0,2).equals("12")){
            System.out.println("00" + initial.substring(2, initial.length()- 2));
        } else {
            System.out.println(initial.substring(0, initial.length() - 2));
        }
    }
}
