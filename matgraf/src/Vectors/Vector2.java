package Vectors;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Vector2 {

    private float x;
    private float y;
    private float length;

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
        calcLen();
    }

    public Vector2(Vector2 v) {
        this.x = v.x;
        this.y = v.y;
        calcLen();
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getLength() {
        return length;
    }

    public void add(Vector2 v) {
        this.x += v.getX();
        this.y += v.getY();
        calcLen();
    }

    public void sub(Vector2 v) {
        this.x -= v.getX();
        this.y -= v.getY();
        calcLen();
    }

    public void div(float f) {
        this.x /= f;
        this.y /= f;
        calcLen();
    }

    public void mult(float f) {
        this.x *= f;
        this.y *= f;
        this.length *= abs(f);
    }

    public void normalize() {
        this.x /= this.length;
        this.y /= this.length;
        calcLen();
    }

    @Override
    public String toString() {
        return "Vector2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    private void calcLen() {
        this.length = (float) sqrt((x * x) + (y * y));
    }
}
