package ont777767ltd.twod.shapes;

import java.awt.*;

abstract public class Shape {
    protected double x=0.0;
    protected double y=0.0;
    protected double w=0.0;
    protected double h = 0.0;
    protected Graphics2D g2d = null;
    protected double scale = 1.0;
    protected Color color = Color.BLUE;

    protected int layer = 0;

    protected boolean filled = true;

    protected String text=null;
    protected Color textColor= Color.BLACK;

    public abstract void draw();

    public void setG2D(Graphics2D g2d) {
        this.setG2d(g2d);
    }

    public Graphics2D getG2d() {
        return g2d;
    }

    public Shape setG2d(Graphics2D g2d) {
        this.g2d = g2d;
        return this;
    }

    public double getScale() {
        return scale;
    }

    public Shape setScale(double scale) {
        this.scale = scale;
        return this;
    }

    public Color getColor() {
        return color;
    }

    public Shape setColor(Color color) {
        this.color = color;
        return this;
    }

    public Shape setXY(double x, double y) {
        this.x = x;
        this.y = y;
        return this;
    }
    public Shape setWH(double w, double h) {
        this.w = w;
        this.h = h;
        return this;
    }

    public int getLayer() {
        return layer;
    }

    public Shape setLayer(int layer) {
        this.layer = layer;
        return this;
    }

    protected boolean isFilled() {
        return filled;
    }

    public Shape setFilled(boolean filled) {
        this.filled = filled;
        return this;
    }

    public String getText() {
        return text;
    }

    public Shape setText(String text) {
        this.text = text;
        return this;
    }

    public Color getTextColor() {
        return textColor;
    }

    public Shape setTextColor(Color textColor) {
        this.textColor = textColor;
        return this;
    }
}
