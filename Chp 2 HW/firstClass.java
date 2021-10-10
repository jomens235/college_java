import java.util.Scanner;

public class firstClass extends problemTwo{
 public firstClass() {
     //Problem #1:
     System.out.println("Problem #1");
     System.out.println("This will determine the length of your line segment.");
     Scanner in = new Scanner(System.in);
     System.out.println("Enter value for x1");
     double x1 = in.nextDouble();
     System.out.println("Enter value for x2");
     double x2 = in.nextDouble();
     System.out.println("Enter value for y1");
     double y1 = in.nextDouble();
     System.out.println("Enter value for y2");
     double y2 = in.nextDouble();
     double dx = x1 - x2;
     System.out.println("x1 - x2 = " + dx);
     double dy = y1 - y2;
     System.out.println("y1 - y2 = " + dy);
     dx = dx * dx;
     dy = dy * dy;
     double xy = dx + dy;
     double length = Math.sqrt(xy);
     System.out.println("The length of the line is " + length + ".");
     
     
    }
}
