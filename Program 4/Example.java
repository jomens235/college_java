import java.awt.*;
import java.util.*;

public class Example {
    public static final int SIZE = 400;  // height/width of DrawingPanel

    public static void main(String[] args) {
        
        // initialize drawing panel
        DrawingPanel p = new DrawingPanel(SIZE, SIZE);
        p.setBackground(Color.white);        

        // use the middle points of the pane
        Point p1 = new Point(SIZE/2, 0);
        Point p2 = new Point(0, SIZE / 2);
        Point p3 = new Point(SIZE / 2, SIZE);
        Point p4 = new Point(SIZE, SIZE/2);

        // create a polygon using the above points
        Polygon pg = new Polygon();
        pg.addPoint(p1.x, p1.y);
        pg.addPoint(p2.x, p2.y);
        pg.addPoint(p3.x, p3.y);
        pg.addPoint(p4.x, p4.y);
        
        // create a gaphics and fill the polygon
        Graphics g = p.getGraphics();
        g.fillPolygon(pg);    
        
        // second example that use middle points based on p1,p2,p3,p4
        Point p5 = new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
        Point p6 = new Point((p2.x + p3.x) / 2, (p2.y + p3.y) / 2);
        Point p7 = new Point((p3.x + p4.x) / 2, (p3.y + p4.y) / 2);
        Point p8 = new Point((p4.x + p1.x) / 2, (p4.y + p1.y) / 2);
        
        Polygon pg2 = new Polygon();
        pg2.addPoint(p5.x, p5.y);
        pg2.addPoint(p6.x, p6.y);
        pg2.addPoint(p7.x, p7.y);
        pg2.addPoint(p8.x, p8.y);
        
        // // fill the polygon
        Graphics g2 = p.getGraphics();
        g2.setColor(Color.WHITE);
        g2.fillPolygon(pg2);
    }
}