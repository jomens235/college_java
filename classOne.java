import java.util.Scanner;

public class classOne {
    public classOne() {
        Scanner in = new Scanner(System.in);
        int x;
        char letter;
        
        //Problem 1:
        System.out.println("Enter some words to see how many words you entered!");
        String input = in.nextLine();
        x = input.length();
        int num = 1;
        
        for (int i = 0; i < x; i++) {
            letter = input.charAt(i);
            if (Character.isWhitespace(letter)) {
                num++;
            }
        }
        System.out.println("There are " + num + " words in that string");
        
        
        //Problem 2:
        System.out.println("Enter a string to count vowels!");
        String user = in.nextLine();
        x = user.length();
        String output = "";
        
        for (int j = 0; j < x; j++) {
            letter = user.charAt(j);
            if (letter == 'A' || letter == 'a' || 
            letter == 'E' || letter == 'e' ||
            letter == 'I' || letter == 'i' ||
            letter == 'O' || letter == 'o' ||
            letter == 'U' || letter == 'u') {
                output += letter;
            }
        }
        System.out.println("The vowels are: " + output);
        
       
       //Problem 3:
       System.out.println("Enter a String to reverse!");
       String word = in.nextLine();
       String reverse = "";
       
       for (int k = word.length() - 1; k >= 0; k--) {
           letter = word.charAt(k);
           reverse += letter;
        }
        System.out.println(reverse);
    }   
}