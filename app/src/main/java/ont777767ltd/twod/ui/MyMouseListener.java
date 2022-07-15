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
        System.out.println(arg0.getX() +", "+ arg0.getY());
        ArrayList<Shape> shapes = ShapeList.getInstance().getShapes();
        for (Shape s : shapes) {
            if (s.hx0 < arg0.getX() && (s.hx0+s.hx1) > arg0.getX() && s.hy0 < arg0.getY() && (s.hy0+s.hy1 )> arg0.getY()) {
                System.out.print("Ding.");
            }
            else {
                System.out.println(s.hx0+", "+ s.hy0 + " " + s.hx1+", "+s.hy1);

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