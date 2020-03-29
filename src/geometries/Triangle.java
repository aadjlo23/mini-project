package geometries;

import primitives.Point3D;
import primitives.Vector;

public class Triangle extends Polygon
{
    Point3D _p1, _p2, _p3;


    public Triangle(Point3D p1, Point3D p2, Point3D p3) {
        Vector V1 = p1.subtract(p2);
        Vector V2 = p2.subtract(p3);
        Vector V3 = p3.subtract(p2);
        double a1 = V1.length();
        double a2 = V2.length();
        double a3 = V3.length();
        if (!(a1 > a2 + a3 || a2 > a1 + a3 || a3 > a1 + a2))
        {
            _p1 = p1;
            _p2 = p2;
            _p3 = p3;
            new Polygon(_p1, _p2, _p3);

        }

    }

}
