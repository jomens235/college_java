import java.util.Scanner;

public class problemTwo{
 public problemTwo(){
     //Problem 2:
     Scanner in = new Scanner(System.in);
     System.out.println("Input a string!");
     String word = in.nextLine();
     int lng = word.length();
     char first = word.charAt(0);
     char last = word.charAt(lng - 1);
     int half = (lng / 2) - 1;
     String mid = word.substring(half, half + 3);
     System.out.println(last + "" + first + "" + mid);
    }
}