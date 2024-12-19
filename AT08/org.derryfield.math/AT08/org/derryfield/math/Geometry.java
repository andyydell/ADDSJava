package org.derryfield.math;
//Andy Dell'Orfano
//12/18/24

public class Geometry {
    public static double sphereVol(double r){
        double coeficient = 4.0/3.0;
        double volume = coeficient * r * r* r *Math.PI;
        return volume;
    }
    public static double sphereSurfArea(double r){
        double coeficient = 4.0;
        double area = coeficient * Math.PI * r* r;
        return area;
    }
}
