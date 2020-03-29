package geometries;

import primitives.Point3D;
import primitives.Vector;

public class Sphere extends RadialGeometry
{
    Point3D _center;

    public Sphere(double radius)
    {
        super(radius);
    }

    public Point3D get_center() {
        return _center;
    }
    public Vector getNormal(Point3D p)
    {
        return  new Vector(p.subtract(_center).normalize());
    }
}