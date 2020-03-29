package primitives;

public class Ray {
    Point3D P1;
    Vector _direction;


    public  Ray(Point3D _p,Vector _d )
    {

        this._direction=_d;
        this.P1=_p;
    }
    public Ray(Ray other)
    {
        this._direction=other._direction;
        this.P1=other.P1;

    }


    public Vector get_direction() {
        return _direction;
    }

    public Point3D get_P1() {
        return P1;
    }

    @Override
    public String toString() {
        return "Ray{" + "P1= " + P1 + ", _direction=" + _direction + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Ray)) return false;
        Ray ray = (Ray) o;
        return P1.equals(ray.P1) &&
                _direction.equals(ray._direction);
    }
}
