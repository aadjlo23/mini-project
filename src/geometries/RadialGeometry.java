package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;
import java.util.List;
import java.awt.Color;

public abstract  class RadialGeometry implements Geometry
{
    protected double _radius;
    // default ctor -> make it a 3Dpoint(radius=0 )
    public RadialGeometry( )
    {
        this._radius=0;
    }
    public RadialGeometry(double radius)
    {
        _radius=radius;

    }
    public void RadialGeometry(RadialGeometry other)
    {
        this._radius=other._radius;
    }

    public double get_radius() {
        return _radius;
    }
    public String toString() {
        return "RadialGeometry {radius=" + this._radius; };






}