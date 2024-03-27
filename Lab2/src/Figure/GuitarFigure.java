package Figure;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class GuitarFigure extends Figure {
    public GuitarFigure(Graphics g, int maxWidth, int maxHeight) {
        super(g, maxWidth, maxHeight);
    }

    @Override
    protected void setupBackground() {
        g2d.setBackground(new Color(255, 217, 0));
        g2d.clearRect(0, 0, _maxWidth, _maxHeight);
    }

    private void paintLeftTriangle() {
        double[][] points = {
                { 50.0, 50.0 }, { 225.0, 150.0 }, { 50.0, 250.0 }, { 100.0, 150.0 }
        };
        GeneralPath triangle = new GeneralPath();

        triangle.moveTo(points[0][0], points[0][1]);

        for (int i = 1; i < points.length; i++) {
            triangle.lineTo(points[i][0], points[i][1]);
        }

        triangle.closePath();
        g2d.setColor(Color.blue);
        g2d.fill(triangle);
    }

    private void paintRightTriangle() {
        double[][] points = {
                { 475.0, 100.0 }, { 400.0, 150.0 }, { 475.0, 200.0 }, { 440.0, 150.0 }
        };
        GeneralPath triangle = new GeneralPath();

        triangle.moveTo(points[0][0], points[0][1]);

        for (int i = 1; i < points.length; i++) {
            triangle.lineTo(points[i][0], points[i][1]);
        }

        triangle.closePath();
        g2d.setColor(Color.blue);
        g2d.fill(triangle);
    }

    private void paintCircle() {
        g2d.setColor(Color.red);
        g2d.fillOval(120, 120, 60, 60);
    }

    private void paintStrings() {
        int step = 5;
        int startHeight = 150 - step * 3;
        int endHeight = 150 + step * 3;
        g2d.setColor(Color.black);

        for (int height = startHeight; height < endHeight; height+=step) {
            g2d.drawLine(130, height, 430, height);
        }
    }

    public void paintSelf() {
        g2d.translate(100, 100);
        paintLeftTriangle();
        paintRightTriangle();
        paintCircle();
        paintStrings();
    }
}
