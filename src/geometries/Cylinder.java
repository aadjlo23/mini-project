package geometries;

import primitives.*;

import java.util.List;



public class Cylinder extends Tube {
    private double _height;

    /* ********* Constructors ***********/


    public Cylinder(Ray ray, double radius, double height) {
        super(ray, radius);
        if (height >= 0)
            this._height = height;
        else
            throw new IllegalArgumentException("height can't be zero (or almost zero).");
    }


    public double getHeight() {
        return _height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "_height=" + _height +
                ", _ray=" + getRay() +
                ", _radius=" + get_radius()+
                '}';
    }


    @Override
    public Vector getNormal(Point3D point3D) {
        Point3D O = new Point3D(this.getRay().get_P1().add(this.getRay().get_direction().crossProduct(this.getRay().get_direction().crossProduct(point3D.subtract(this.getRay().get_P1())))));
        Vector vectorNormal = new Vector(point3D.subtract(O));
        return vectorNormal.normalize();
    }


}