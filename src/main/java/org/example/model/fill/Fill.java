package org.example.model.fill;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.RectangularShape;
public class Fill implements FillBehavior {

    private Color color;
    private RectangularShape shape;

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g) {
        Paint paint = g.getPaint();
        g.setPaint(color);
        g.fill(shape);
        g.setPaint(paint);
    }

    @Override
    public void setShape(RectangularShape s) {
        shape = s;
    }

    @Override
    public FillBehavior clone() {
        Fill Fill = new Fill();
        Fill.color = color;
        Fill.shape = (RectangularShape) shape.clone();
        return Fill;
    }
}
