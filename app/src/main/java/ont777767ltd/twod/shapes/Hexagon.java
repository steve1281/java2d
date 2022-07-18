package ont777767ltd.twod.shapes;

import java.awt.*;

public class Hexagon  extends MyPolygon {

    @Override
    public void draw() {
        if (getG2d() == null) {
            return;
        }
        draw(getG2d());
    }

    private void draw(Graphics2D g2d) {
        g2d.setColor(this.getColor());

        Polygon p = new Polygon();
        Polygon s = new Polygon();

        for (int i = 0; i < 6; i++) {
            p.addPoint((int) (x + w * Math.cos(i * 2 * Math.PI / 6)), (int) (y + h * Math.sin(i * 2 * Math.PI / 6)));
        }

        if (text != null) {
            g2d.drawString(text, (int)x/2, (int)y);
        }
        if (hx0 != hx1) {
           g2d.setColor(Color.YELLOW);
           g2d.drawRect(hx0, hy0, hx1, hy1);
        }

        if (isFilled()) {
            g2d.fillPolygon(p);
        } else {
            g2d.drawPolygon(p);
        }
    }
}
