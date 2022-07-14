package ont777767ltd.twod.shapes;



import java.awt.*;
import java.awt.geom.Line2D;

public class Line extends Shape {



    @Override
    public void draw() {
        if (getG2d() == null) {
            return;
        }
        drawLine(getG2d());
    }
    private void drawLine(Graphics2D g2d) {
        double x0,y0,w0,h0;

        x0 = x * getScale();
        y0 = y * getScale();
        w0 = w * getScale();
        h0 = h * getScale();

        Line2D.Double s = new Line2D.Double(x0,y0,x0+w0,y0+h0);
        g2d.setColor(this.getColor());
        g2d.draw(s);

    }
}
