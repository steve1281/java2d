package ont777767ltd.twod;

import ont777767ltd.twod.shapes.*;
import ont777767ltd.twod.shapes.Shape;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.*;

public class DrawingCanvas extends JComponent {
    private int width;
    private int height;

    private ArrayList<Shape> shapes = ShapeList.getInstance().getShapes();

    public DrawingCanvas(int w, int h) {
        width = w;
        height = h;
        shapes.add(new Line().setXY(0,0).setWH(300,75).setColor(Color.RED).setLayer(1000));
        shapes.add(new Circle().setXY(200,75).setWH(100,100).setColor(Color.BLACK).setLayer(1).setFilled(false));
        shapes.add(new Cloud().setXY(150, 175).setWH(100, 100).setColor(Color.BLUE));
        shapes.add(new Cloud()
                .setXY(250, 175)
                .setWH(100, 100)
                .setColor(Color.RED)
                .setScale(0.5)
                .setLayer(2)
                .setText("Hello World")
                .setTextColor(Color.BLACK));
        shapes.add(new Rect().setXY(50,75).setWH(100,125).setColor(new Color(100,149,237)));
        shapes.add(new Spiral().setFilled(false).setColor(Color.CYAN).setLayer(2000));
        shapes.add(new Hexagon().setLayer(2000).setColor(Color.CYAN).setFilled(false).setXY(100,100).setWH(50,50).setText("This is a test").
                setHitbox(50,50, 150, 150));
    }

    protected void backgroundFill(Graphics2D g2d) {

        Rectangle2D.Double background = new Rectangle2D.Double(0,0,width,height);
        g2d.setColor(new Color(50,50,50));
        g2d.fill(background);
    }


    protected void paintComponent(Graphics g) {

        // create a buffer image to draw to
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = bufferedImage.createGraphics();

        // fill background
        backgroundFill(g2d);

        // set anti-aliasing
        RenderingHints rh = new RenderingHints( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        // sort by layer - the higher the layer, the higher the object
        shapes.sort(Comparator.comparing(Shape::getLayer));

        // draw shapes
        for (Shape s : shapes) {
            s.setG2D(g2d);
            s.draw();
        }

        // create a pen for the JFrame
        Graphics2D g2d_main = (Graphics2D) g;

        // draw the image
        g2d_main.drawImage(bufferedImage, 0, 0, null);



    }

}

