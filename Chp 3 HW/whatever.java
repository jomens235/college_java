import java.util.Scanner;

public class whatever {
    public whatever() {
        Scanner in = new Scanner(System.in);

        int num1 = 0;
        int num2 = 1;
        int total = 0;
        System.out.println("What num should be in the sequence?");
        int user = in.nextInt();
        boolean repeat = true;

        while (repeat) {
            if (total < user) {
                total = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + total);
                num1 = num2;
                num2 = total;
            } else if (total > user) {
                repeat = false;
                System.out.println(user + " isn't in the sequence.");
            } else {
                repeat = false;
                System.out.println(user + " is in the sequence");
            }

        }
    }
}
