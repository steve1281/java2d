package ont777767ltd.twod.shapes;


import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape {



    @Override
    public void draw() {
        if (getG2d() == null) {
            return;
        }
        drawCircle(getG2d());
    }
    private void drawCircle(Graphics2D g2d) {
        double x0,y0,w0,h0;

        x0 = x * getScale();
        y0 = y * getScale();
        w0 = w * getScale();
        h0 = h * getScale();

        Ellipse2D.Double s = new Ellipse2D.Double(x0, y0, w0, h0);
        g2d.setColor(this.getColor());
        if (isFilled()) {
            g2d.fill(s);
        } else {
            g2d.draw(s);
        }

    }
}
