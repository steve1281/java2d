package ont777767ltd.twod.shapes;

import java.awt.*;


public class MyPolygon extends Shape {



    @Override
    public void draw() {
        if (getG2d() == null) {
            return;
        }
        drawLine(getG2d());
    }
    private void drawLine(Graphics2D g2d) {
        g2d.setColor(this.getColor());

        Polygon p = new Polygon();
        for (int i = 0; i < 360; i++) {
            double t = i / 360.0;
            p.addPoint((int) (150 + 50 * t * Math.cos(8 * t * Math.PI)), (int) (150 + 50 * t * Math.sin(8 * t * Math.PI)));
        }


        if (isFilled()) {
            g2d.fillPolygon(p);
        } else {
            g2d.drawPolygon(p);
        }

    }
}
