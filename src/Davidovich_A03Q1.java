// Created by Mike Davidovich
// Last modified 7/18/2016

import java.lang.Math;
import java.text.DecimalFormat;

public class Davidovich_A03Q1
{
    // This progam creates a Cylinder class which when initialized asks the user for the
    // radius and height.  When called on, the object reports the shape, radius, height,
    // volume and area.  The user can change the parameters as needed once the object is created.
    public static void main(String[] args)
    {
        Cylinder cyl1 = new Cylinder(5,6);      // Main method uses the Cylinder class
        System.out.println(cyl1);
        cyl1.setHeight(8);
        System.out.println(cyl1);

        Cylinder cyl2 = new Cylinder(8.2,3.7);
        System.out.println(cyl2);
        cyl2.setRadius(3);
        System.out.println(cyl2);

        Cylinder cyl3 = new Cylinder(55,300);
        System.out.println(cyl3);
        cyl3.setRadius(.54);
        System.out.println(cyl3);

        Cylinder cyl4 = new Cylinder(24.2,98.5);
        System.out.println(cyl4);
        cyl4.setRadius(3);
        System.out.println(cyl4);
    }

    public static class Cylinder
    {
        private double radius;
        private double height;

        public Cylinder(double intiRadius, double intiHeight)    // Constructor calls getArea and
        {                                                        // getVolume methods so user
            radius = intiRadius;                                 // doesn't have to call at initilization.
            height = intiHeight;
            getArea();
            getVolume();
        }
        public double getArea()                                 // Surface area
        {
            return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius,2));
        }
        public double getVolume()
        {
            return Math.PI * Math.pow(radius,2) * height;
        }
        public double getRadius()
        {
            return radius;
        }
        public double getHeight()
        {
            return height;
        }
        public void setRadius(double newRadius)             // Allows to set new radius
        {
            radius = newRadius;
            getArea();
            getVolume();
        }
        public void setHeight(double newHeight)             //  Allows to set new double
        {
            height = newHeight;
            getArea();
            getVolume();
        }
        public String toString()                            // toString method returns info
        {                                                   // stated in early comments.
            DecimalFormat df = new DecimalFormat("###.##");
            return ("The shape is a cylinder with a radius of " + radius +
                    " a height of " + height + " an area of " + df.format(getArea()) + " and a volume of " +
                    df.format(getVolume()) + ".");
        }
    }
}

