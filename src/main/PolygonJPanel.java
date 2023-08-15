package main;

import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

public class PolygonJPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // menggambarkan polygon dengan objek Polygon
        int[] xNilai = { 20, 40, 50, 30, 20, 15 };
        int[] yNilai = { 50, 50, 60, 80, 80, 60 };
        Polygon polygon1 = new Polygon(xNilai, yNilai, 6);
        g.drawPolygon(polygon1);

        // menggambarkan polyline dengan 2 array
        int[] xNilai2 = { 70, 90, 100, 80, 70, 65, 60 };
        int[] yNilai2 = { 100, 100, 110, 110, 130, 110, 90 };
        g.drawPolyline(xNilai2, yNilai2, 7);

        // mengisi polygon dengan 2 array
        int[] xNilai3 = { 120, 140, 150, 190 };
        int[] yNilai3 = { 40, 70, 80, 60 };
        g.fillPolygon(xNilai3, yNilai3, 4);

        // menggambarkan polygon terisi dengan objek Polygon
        Polygon polygon2 = new Polygon();
        polygon2.addPoint(165, 135);
        polygon2.addPoint(175, 150);
        polygon2.addPoint(270, 200);
        polygon2.addPoint(200, 220);
        polygon2.addPoint(130, 180);
        g.fillPolygon(polygon2);
    }
}
