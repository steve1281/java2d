package ont777767ltd.twod.ui;

import ont777767ltd.twod.shapes.Hexagon;
import ont777767ltd.twod.shapes.Shape;
import ont777767ltd.twod.shapes.ShapeList;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class MyMouseListener implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent arg0) {
        int x = arg0.getX();
        int y = arg0.getY();
        System.out.print(x +", "+ y + ": ");
        // fetch the shapes
        ArrayList<Shape> shapes = ShapeList.getInstance().getShapes();
        // for each shape, check it was clicked in its hitbox
        for (Shape s : shapes) {
            int hx0 = s.hx0;
            int hx1 = s.hx0 + s.hx1; // hx1 is actually width (@todo: rename)
            int hy0 = s.hy0;
            int hy1 = s.hy0 + s.hy1; // hy1 is actually height (@todo: rename)

            // simple bounds check
            if (x > hx0 && x < hx1 && y>hy0 && y<hy1 ) {
                System.out.println("Ding.");
            }
            else {
                System.out.println(hx0+", "+ hy0 + " " + hx1+", "+hy1);

            }

        }
        // shapes.remove(0);
        System.out.println(shapes.size());
        if (shapes.size() == 0) {
            shapes.add(new Hexagon().setLayer(2000).setColor(Color.CYAN).setFilled(false).setXY(100, 100).setWH(50, 50).setText("So empty?"));
        }

    }

    @Override
    public void mouseEntered(MouseEvent arg0) { }

    @Override
    public void mouseExited(MouseEvent arg0) { }

    @Override
    public void mousePressed(MouseEvent arg0) { }

    @Override
    public void mouseReleased(MouseEvent arg0) { }

}
