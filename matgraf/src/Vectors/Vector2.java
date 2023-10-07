package Vectors;

public class Vector2 {

    private float x;
    private float y;

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2(Vector2 v) {
        this.x = v.x;
        this.y = v.y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void add(Vector2 v) {
        this.x += v.getX();
        this.y += v.getY();
    }

    public void sub(Vector2 v) {
        this.x -= v.getX();
        this.y -= v.getY();
    }

    @Override
    public String toString() {
        return "Vector2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
