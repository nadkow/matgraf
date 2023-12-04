package Quaternions;

import Vectors.Vector3;
import Vectors.Vectors;

import static java.lang.Math.sin;
import static java.lang.Math.cos;

public class Quaternion {

    public float a, b, c, d;
    public Vector3 bcd;

    public Quaternion(){}

    public Quaternion(float fa, float fb, float fc, float fd) {
        a = fa;
        b = fb;
        c = fc;
        d = fd;
        bcd = new Vector3(b, c, d);
    }

    public Quaternion(float fa, Vector3 v) {
        a = fa;
        b = v.getX();
        c = v.getY();
        d = v.getZ();
        bcd = v;
    }

    @Override
    public String toString() {
        return "Quaternion{" + a +
                ", " + b +
                ", " + c +
                ", " + d +
                '}';
    }

    public void rotation(Vector3 axis, float angle) {
        float sin = (float) sin(angle/2);
        a = (float) cos(angle/2);
        Vector3 ax = Vectors.normalized(axis);
        b = ax.getX() * sin;
        c = ax.getY() * sin;
        d = ax.getZ() * sin;
        bcd = new Vector3(b, c, d);
    }

    public void conj() {
        b = -b;
        c = -c;
        d = -d;
        bcd = new Vector3(b, c, d);
    }
}
