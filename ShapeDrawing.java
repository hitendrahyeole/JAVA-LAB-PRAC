import java.awt.*;
import javax.swing.*;

public class ShapeDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set line color
        g.setColor(Color.BLACK);

        // Outer rectangle coordinates
        int x1 = 50, y1 = 50;   // top-left
        int width = 400, height = 200;

        // Draw outer rectangle
        g.drawRect(x1, y1, width, height);

        // Midpoints for diamond
        int midTopX = x1 + width / 2;
        int midTopY = y1;

        int midBottomX = x1 + width / 2;
        int midBottomY = y1 + height;

        int midLeftX = x1;
        int midLeftY = y1 + height / 2;

        int midRightX = x1 + width;
        int midRightY = y1 + height / 2;

        // Draw diamond using lines
        g.drawLine(midTopX, midTopY, midRightX, midRightY);
        g.drawLine(midRightX, midRightY, midBottomX, midBottomY);
        g.drawLine(midBottomX, midBottomY, midLeftX, midLeftY);
        g.drawLine(midLeftX, midLeftY, midTopX, midTopY);

        // Inner rectangle (aligned with diamond intersections)
        int innerX = x1 + width / 4;
        int innerY = y1 + height / 4;
        int innerWidth = width / 2;
        int innerHeight = height / 2;

        g.drawRect(innerX, innerY, innerWidth, innerHeight);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Geometric Shape Drawing");
        ShapeDrawing panel = new ShapeDrawing();

        frame.add(panel);
        frame.setSize(520, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
