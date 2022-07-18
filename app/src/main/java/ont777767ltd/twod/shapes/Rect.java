package ont777767ltd.twod.shapes;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rect extends Shape {


    @Override
    public void draw() {
        if (getG2d() == null) {
            return;
        }
        drawRect(getG2d());
    }
    private void drawRect(Graphics2D g2d) {
        double x0,y0,w0,h0;

        x0 = x * getScale();
        y0 = y * getScale();
        w0 = w * getScale();
        h0 = h * getScale();

        Rectangle2D.Double r = new Rectangle2D.Double(x0,y0,w0,h0);
        g2d.setColor(this.getColor());
        g2d.fill(r);
        if (hx0 != hx1) {
            g2d.setColor(Color.YELLOW);
            g2d.drawRect(hx0, hy0, hx1, hy1);
        }

    }
}
