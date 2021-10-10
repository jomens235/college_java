
/*
 * Letter Counter Programming Assignment 1
 * Programmer: James Stanfield
 */
import java.util.*;
import java.io.*;
public class letterCounter
{  
    static int[] alphabet = new int[26];

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(new File("inputstring.txt"));
        while (in.hasNextLine()) {
            String current = in.nextLine();
            countLetters(current);
            System.out.println("Letter Frequency: " + current);
            printLetterFreq(alphabet);
        }
    }

    //Method 1
    public static int [] countLetters(String str) {
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int val = (int) ch;
            if (val >= 97 && val <= 122) {
                alphabet[ch-'a']++;
            }
        }
        return alphabet;
    }

    //Method 2
    public static void printLetterFreq(int [] countArray)
    throws FileNotFoundException{
        Scanner in = new Scanner(new File("inputstring.txt"));
        for (int j = 0; j < countArray.length; j++) {
            if (countArray[j] > 0) {
                char ch = (char) (j+97);
                System.out.println(ch + " (" + countArray[j] + "):"
                    + numToStar(countArray[j]));
            }
        }
        System.out.println("The highest frequent letter is: "
            + mostFreqLetter(alphabet));
    }

    //Method 3
    public static String numToStar(int num) {
        String out = "";
        for (int j = 0; j < num; j++) {
            out += "*";
        }
        return out;
    }

    //Method 4
    public static char mostFreqLetter(int [] countArray) {
        char freq = 'a';
        int high = 0;
        for (int i = 0; i < countArray.length-1; i++) {
            if (countArray[i] > high) {
                freq = (char) (i+97);
                high = countArray[i];
            }
        }

        return freq;
    }

}
