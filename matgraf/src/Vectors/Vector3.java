package Vectors;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Vector3 {

    private float x;
    private float y;
    private float z;
    private float length;

    public Vector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
        calcLen();
    }

    public Vector3(Vector3 v) {
        this.x = v.x;
        this.y = v.y;
        this.z = v.z;
        calcLen();
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public float getLength() {
        return length;
    }

    public void add(Vector3 v) {
        this.x += v.getX();
        this.y += v.getY();
        this.z += v.getZ();
        calcLen();
    }

    public void sub(Vector3 v) {
        this.x -= v.getX();
        this.y -= v.getY();
        this.z -= v.getZ();
        calcLen();
    }

    public void div(float f) {
        this.x /= f;
        this.y /= f;
        this.z /= f;
        calcLen();
    }

    public void mult(float f) {
        this.x *= f;
        this.y *= f;
        this.z *= f;
        this.length *= abs(f);
    }

    public void normalize() {
        this.x /= this.length;
        this.y /= this.length;
        this.z /= this.length;
        calcLen();
    }

    @Override
    public String toString() {
        return "Vector3{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    private void calcLen() {
        this.length = (float) sqrt((x * x) + (y * y) + (z * z));
    }
}
