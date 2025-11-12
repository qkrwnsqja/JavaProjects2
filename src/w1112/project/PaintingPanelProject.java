package w1112.project;

import javax.swing.*;
import java.awt.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class PaintingPanelProject extends JPanel implements MouseListener, MouseMotionListener {

    public static String polygon;

    private int startX, startY;
    private int endX, endY;

    public PaintingPanelProject(String polygon) {
        this.polygon = polygon;
        setBackground(Color.yellow);

        this.addMouseListener(this);
        this.addMouseMotionListener(this);

        startX = startY = endX = endY = 0;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = Math.min(startX, endX);
        int y = Math.min(startY, endY);
        int width = Math.abs(endX - startX);
        int height = Math.abs(endY - startY);

        switch (polygon) {
            case "선":
                g.setColor(Color.red);
                g.drawLine(startX, startY, endX, endY);
                break;
            case "사각형":
                g.setColor(Color.magenta);
                g.fillRect(x, y, width, height);
                break;
            case "타원":
                g.setColor(Color.blue);
                g.fillOval(x, y, width, height);
                break;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        startX = e.getX();
        startY = e.getY();

        endX = startX;
        endY = startY;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        endX = e.getX();
        endY = e.getY();
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) { }
    @Override
    public void mouseEntered(MouseEvent e) { }
    @Override
    public void mouseExited(MouseEvent e) { }

    @Override
    public void mouseDragged(MouseEvent e) {
        endX = e.getX();
        endY = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) { }
}