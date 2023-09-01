/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        MyPoint point1 = new MyPoint(10, 6);
        MyPoint point2 = new MyPoint(2, 10);

        System.out.println("Distance from Point 1 to Point 2: " + point1.getDistance(point2));
        System.out.println("Distance from Point 1 to origin: " + point1.getDistance());
        System.out.println("Point1 quadrant: " + point1.getQuadrant());
        System.out.println("Point 1 angle: " + point1.getAngle());

        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);
    }
}