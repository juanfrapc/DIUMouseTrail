
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.util.ArrayList;

public class MouseTrail {

    private final ArrayList<Point> trail;
    private final Graphics graphics;
    private int shape = 0;

    MouseTrail(Graphics g) {
        this.trail = new ArrayList<>();
        this.graphics = g;
    }

    public void setShape(int shape) {
        this.shape = shape;
    }

    public ArrayList<Point> getTrail() {
        return trail;
    }

    public void add(Point p) {
        trail.add(p);
        if (trail.size() > 5) {
            update();
        }
    }

    public void update() {
        if (trail.size() > 0) {
            trail.remove(0);
        }
    }

    public void paint() {
        for (Point point : trail) {
            switch (shape) {
                case 0:
                    graphics.fillOval(point.x, point.y, 20, 20);
                    break;
                case 1:
                    graphics.fillRect(point.x, point.y, 20, 20);
                    break;
                case 2:

                    int xPoints[] = {9, 15, 0, 18, 3};
                    int yPoints[] = {0, 18, 6, 6, 18};
                    for (int i = 0; i < yPoints.length; i++) {
                        xPoints[i] += point.x;
                        yPoints[i] += point.y;
                    }
                    Polygon p = new Polygon(xPoints, yPoints, 5);
                    graphics.drawPolygon(p);
                    ((Graphics2D) graphics).fill(p);
                    break;
            }
        }
    }

    public void setColour(Color color) {
        this.graphics.setColor(color);
    }
}
