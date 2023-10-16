package Vectors;

import static java.lang.Math.acos;

public abstract class Vectors {

    public static Vector2 add(Vector2 v1, Vector2 v2) {
        return new Vector2(v1.getX() + v2.getX(), v1.getY() + v2.getY());
    }

    public static Vector3 add(Vector3 v1, Vector3 v2) {
        return new Vector3(v1.getX() + v2.getX(), v1.getY() + v2.getY(), v1.getZ() + v2.getZ());
    }

    public static Vector2 sub(Vector2 v1, Vector2 v2) {
        return new Vector2(v1.getX() - v2.getX(), v1.getY() - v2.getY());
    }

    public static Vector3 sub(Vector3 v1, Vector3 v2) {
        return new Vector3(v1.getX() - v2.getX(), v1.getY() - v2.getY(), v1.getZ() - v2.getZ());
    }

    public static Vector2 div(Vector2 v, float f) {
        return new Vector2(v.getX() / f, v.getY() / f);
    }

    public static Vector3 div(Vector3 v, float f) {
        return new Vector3(v.getX() / f, v.getY() / f, v.getZ() / f);
    }

    public static Vector2 mult(Vector2 v, float f) {
        return new Vector2(v.getX() * f, v.getY() * f);
    }

    public static Vector3 mult(Vector3 v, float f) {
        return new Vector3(v.getX() * f, v.getY() * f, v.getZ() * f);
    }

    public static Vector2 normalized(Vector2 v) {
        return new Vector2(v.getX()/v.getLength(), v.getY()/v.getLength());
    }

    public static Vector3 normalized(Vector3 v) {
        return new Vector3(v.getX()/v.getLength(), v.getY()/v.getLength(), v.getZ()/v.getLength());
    }

    public static float dotProduct(Vector2 v1, Vector2 v2) {
        return v1.getX()*v2.getX() + v1.getY()*v2.getY();
    }

    public static float dotProduct(Vector3 v1, Vector3 v2) {
        return v1.getX()*v2.getX() + v1.getY()*v2.getY() + v1.getZ()*v2.getZ();
    }

    public static Vector3 crossProduct(Vector3 v1, Vector3 v2) {
        return new Vector3(v1.getY() * v2.getZ() - v1.getZ() * v2.getY(),
                v1.getZ() * v2.getX() - v1.getX() * v2.getZ(),
                v1.getX() * v2.getY() - v1.getY() * v2.getX());
    }

    public static double angle(Vector2 v1, Vector2 v2) {
        double cosfi = dotProduct(v1, v2) / (v1.getLength() * v2.getLength());
        return acos(cosfi);
    }

    public static double angle(Vector3 v1, Vector3 v2) {
        double cosfi = dotProduct(v1, v2) / (v1.getLength() * v2.getLength());
        return acos(cosfi);
    }
}
