package ont777767ltd.twod.shapes;

import java.util.ArrayList;

public class ShapeList {
    private static ShapeList instance = new ShapeList();

    private ShapeList() {};

    public static ShapeList getInstance() {
        return instance;
    }

    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }
}
