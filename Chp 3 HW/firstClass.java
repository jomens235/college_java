import java.util.Scanner;

public class firstClass {
    public firstClass() {
        Scanner in = new Scanner(System.in);

        //Problem 1:
        System.out.println("Enter a number!");
        int num = in.nextInt();
        if (num >= 0) {
            System.out.println("The number is positive.");
            System.out.print(num + " squared is ");
            num = num * num;
            System.out.println(num + ".");
        } else {
            System.out.println("The number is negative.");
            System.out.println(num + " cubed is ");
            num = num * num * num;
            System.out.println(num + ".");
        }

        //Problem 2:
        System.out.println("Enter a word.");
        String word1 = in.nextLine();
        System.out.println("Enter another word.");
        String word2 = in.nextLine();
        if (word1.compareTo(word2) < 0) {
            System.out.println(word1);
            System.out.println(word2);
        } else if (word2.compareTo(word1) < 0) {
            System.out.println(word2);
            System.out.println(word1);
        } else if (word1.compareTo(word2) == 0) {
            System.out.println(word1);
        }

        //Problem 3:
        System.out.println("What's the name of the course?");
        String course = in.nextLine();
        if (course.equals("Java")) {
            System.out.println("Is it beginner or advanced?");
            String difficulty = in.nextLine();
            System.out.println("How much does it cost?");
            double courseCost = in.nextDouble();
            if (courseCost <= 100 && difficulty.equals("advanced")) {
                System.out.println("It's a good buy!");
            } else if (courseCost > 100) {
                System.out.println("It's too expensive!");
            } else {
                System.out.println("It's a beginner course, get better!");
            }
        } else {
            System.out.println("You can only check for a Java course.");   
        }

        //Problem 4:
        System.out.println("Enter a number:");
        int num2 = in.nextInt();
        if (num2 > 25 && num2 < 50) {
            System.out.println("Your number is good.");
        } else {
            System.out.println("Your number is bad.");
        }
    }   
}
