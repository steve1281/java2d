package ont777767ltd.twod.shapes;


import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Cloud extends Shape {


    @Override
    public void draw() {
        if (getG2d() == null) {
            return;
        }
        drawCloud(getG2d());
    }
    private void drawCloud(Graphics2D g2d) {
        double x0,x1,x2,x3;
        double y0,y1,y2,y3;
        double w0,w1,w2,w3;
        double h0,h1,h2,h3;

        x0 = x * getScale();
        y0 = y * getScale();

        w0 = w * getScale();
        h0 = h * getScale();

        x1 = (x + 35) * getScale();
        y1 = (y - 20) * getScale();
        w1 = (w + 75) * getScale();
        h1 = (h + 40) * getScale();

        x2 = (x + 150) * getScale();
        y2 = (y + 15) * getScale();
        w2 = (w - 10) * getScale();
        h2 = (h - 10) * getScale();

        x3 = (x + 180) * getScale();
        y3 = (y + 5) * getScale();
        w3 = (w - 70) * getScale();
        h3 = (h -70) * getScale();

        Ellipse2D.Double e1 = new Ellipse2D.Double(x0, y0, w0, h0);
        Ellipse2D.Double e2 = new Ellipse2D.Double(x1, y1, w1, h1);
        Ellipse2D.Double e3 = new Ellipse2D.Double(x2, y2, w2, h2);
        Ellipse2D.Double e4 = new Ellipse2D.Double(x3, y3, w3, h3);

        g2d.setColor(this.getColor());
        g2d.fill(e1);
        g2d.fill(e2);
        g2d.fill(e3);
        g2d.fill(e4);
        g2d.setColor(this.getTextColor());
        if (text != null) {
            g2d.drawString(text, (int)(x0+x0/4), (int)(y0 + y0/4));
        }

    }
}
