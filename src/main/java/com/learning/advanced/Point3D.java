package com.learning.advanced;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Point3D extends Point2D{
    private int zPos;
    public Point3D(int xPos, int yPos, int zPos) {
        super(xPos, yPos);
        this.zPos = zPos;
    }

    public static void main(String []args) {
        Point3D point3D = new Point3D(1,10,100);
        System.out.println(point3D.getXPos());
        System.out.println(point3D.getYPos());
        System.out.println(point3D.getZPos());
    }
}
