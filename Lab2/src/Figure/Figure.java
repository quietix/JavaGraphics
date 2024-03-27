package Figure;

import java.awt.*;

public abstract class Figure {
    protected static Graphics _g;
    protected static Graphics2D g2d;
    protected static int _maxWidth;
    protected static int _maxHeight;

    public Figure(Graphics g, int maxWidth, int maxHeight) {
        _g = g;
        _maxWidth = maxWidth;
        _maxHeight = maxHeight;
        g2d = (Graphics2D) g;

        RenderingHints rh =
                new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);

        setupBackground();
    }

    public abstract void paintSelf();
    protected void setupBackground() {
        g2d.setBackground(Color.black);
        g2d.clearRect(0, 0, _maxWidth, _maxHeight);
    }
}
