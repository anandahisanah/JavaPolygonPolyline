package main;

import javax.swing.JFrame;

public class GambarPolygon {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menggambar Polygon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PolygonJPanel polygonJPanel = new PolygonJPanel();
        frame.add(polygonJPanel);
        frame.setSize(280, 270);
        frame.setVisible(true);
    }
}
