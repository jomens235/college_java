import java.awt.*;
import java.util.*;

public class RecursiveSierpinski {
    public static final int SIZE = 400;  // height/width of DrawingPanel
    public static DrawingPanel p = new DrawingPanel(SIZE, SIZE);
    public static DrawingPanel pan2 = new DrawingPanel(SIZE, SIZE);

    public static void main(String[] args) {

        // initial set up
        //DrawingPanel p = new DrawingPanel(SIZE, SIZE);
        p.setBackground(Color.white);

        // draw a single triangle using drawTriangle
        Point p1 = new Point(0, SIZE);
        Point p2 = new Point(SIZE/2, 0);
        Point p3 = new Point(SIZE, SIZE);
        drawTriangle(p.getGraphics(), p1, p2, p3);

        // draw three triangles using drawTripleTriangles
        drawTripleTriangles(p.getGraphics(), p1, p2, p3);

        // draw level -5 and level-10 triangles using
        pan2.setBackground(Color.white);
        drawSierpinski(5, pan2.getGraphics(), p1, p2, p3);
        
        drawSierpinski(10, pan2.getGraphics(), p1, p2, p3);

    }

    /*
     * draw a single triangle
     * @ Graphics g
     * @ Point p1
     * @ Point p2
     * @ Point p3
     */
    public static void drawTriangle(Graphics g,Point p1, Point p2, Point p3) {
        Polygon pg = new Polygon();
        pg.addPoint(p1.x, p1.y);
        pg.addPoint(p2.x, p2.y);
        pg.addPoint(p3.x, p3.y);
        g.fillPolygon(pg);

    }

    /*
     * draw three triangles Level-2 Sierpinski triangle based on single trangle
     * @ Graphics g
     * @ Point p1
     * @ Point p2
     * @ Point p3
     */
    public static void drawTripleTriangles(Graphics g,Point p1, Point p2, Point p3) {

        // get the three middle points between p1 and p2, p1 and p3, p2 and p3
        Point mid1 = new Point((p1.x + p2.x)/2, (p1.y + p2.y)/2);
        Point mid2 = new Point((p3.x + p2.x)/2, (p3.y + p2.y)/2);
        Point mid3 = new Point((p1.x + p3.x)/2, (p1.y + p3.y)/2);

        // Middle triangle
        Polygon pg = new Polygon();
        pg.addPoint(mid1.x, mid1.y);
        pg.addPoint(mid2.x, mid2.y);
        pg.addPoint(mid3.x, mid3.y);
        g.setColor(Color.white);
        g.fillPolygon(pg);

        // triangle 1
        Polygon pg1 = new Polygon();
        Point p4 = new Point((p1.x + mid1.x)/2, (p1.y + mid1.y)/2);
        Point p5 = new Point((p1.x + mid2.x)/2, (p1.y + mid2.y)/2);
        Point p6 = new Point((p1.x + mid3.x)/2, (p1.y + mid3.y)/2);
        pg1.addPoint(p4.x, p4.y);
        pg1.addPoint(p5.x, p5.y);
        pg1.addPoint(p6.x, p6.y);
        g.setColor(Color.white);
        g.fillPolygon(pg1);

        // triangle 2
        Polygon pg2 = new Polygon();
        Point p7 = new Point((p2.x + mid1.x)/2, (p2.y + mid1.y)/2);
        Point p8 = new Point((p2.x + mid2.x)/2, (p2.y + mid2.y)/2);
        Point p9 = new Point((p2.x + mid3.x)/2, (p2.y + mid3.y)/2);
        pg2.addPoint(p7.x, p7.y);
        pg2.addPoint(p8.x, p8.y);
        pg2.addPoint(p9.x, p9.y);
        g.setColor(Color.white);
        g.fillPolygon(pg2);

        // triangle 3
        Polygon pg3 = new Polygon();
        Point p10 = new Point((p3.x + mid1.x)/2, (p3.y + mid1.y)/2);
        Point p11 = new Point((p3.x + mid2.x)/2, (p3.y + mid2.y)/2);
        Point p12 = new Point((p3.x + mid3.x)/2, (p3.y + mid3.y)/2);
        pg3.addPoint(p10.x, p10.y);
        pg3.addPoint(p11.x, p11.y);
        pg3.addPoint(p12.x, p12.y);
        g.setColor(Color.white);
        g.fillPolygon(pg3);

    }

    /* 
     * Draws a general level-n Sierpinski triangle whose vertices are (p1, p2, p3)
     * @ int n: level n 
     * @ Graphics g
     * @ Point p1
     * @ Point p2
     * @ Point p3
     */
    public static void drawSierpinski(int n, Graphics g, Point p1, Point p2, Point p3) {
        if (n == 1) {
            // base case: simple triangle
            drawTriangle(pan2.getGraphics(), p1, p2, p3);
            
        } else {
            // get the three middle points between p1 and p2, p1 and p3, p2 and p3
            Point mid1 = new Point((p1.x + p2.x)/2, (p1.y + p2.y)/2);
            Point mid2 = new Point((p3.x + p2.x)/2, (p3.y + p2.y)/2);
            Point mid3 = new Point((p1.x + p3.x)/2, (p1.y + p3.y)/2);

            // using recursive call to draw three sub-triangles
            drawSierpinski(n - 1, pan2.getGraphics(), p1, mid1, mid3);
            drawSierpinski(n - 1, pan2.getGraphics(), p2, mid1, mid2);
            drawSierpinski(n - 1, pan2.getGraphics(), p3, mid2, mid3);
        }
    }

}