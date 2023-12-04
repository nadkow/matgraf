package Quaternions;

import Vectors.*;

public abstract class Quaternions {

    public static Quaternion mult(Quaternion q1, Quaternion q2) {
        Quaternion result = new Quaternion();
        result.a = q1.a * q2.a - q1.b * q2.b - q1.c * q2.c - q1.d * q2.d;
        result.b = q1.a * q2.b + q1.b * q2.a + q1.c * q2.d - q1.d * q2.c;
        result.c = q1.a * q2.c + q1.c * q2.a + q1.d * q2.b - q1.b * q2.d;
        result.d = q1.a * q2.d + q1.d * q2.a + q1.b * q2.c - q1.c * q2.b;
        result.bcd = new Vector3(result.b, result.c, result.d);
        return result;
    }

    public static Quaternion add(Quaternion q1, Quaternion q2) {
        Quaternion result = new Quaternion();
        result.a = q1.a + q2.a;
        result.bcd = Vectors.add(q1.bcd, q2.bcd);
        result.b = result.bcd.getX();
        result.c = result.bcd.getY();
        result.d = result.bcd.getZ();
        return result;
    }

    public static Quaternion sub(Quaternion q1, Quaternion q2) {
        Quaternion result = new Quaternion();
        result.a = q1.a - q2.a;
        result.bcd = Vectors.sub(q1.bcd, q2.bcd);
        result.b = result.bcd.getX();
        result.c = result.bcd.getY();
        result.d = result.bcd.getZ();
        return result;
    }

    public static Quaternion div(Quaternion q1, Quaternion q2) {
        return mult(q1, inv(q2));
    }

    public static Vector3 rotate(Quaternion q, Vector3 u) {
        Quaternion q_u = new Quaternion(0, u);
        Quaternion qqu = mult(q, q_u);
        q.conj();
        Quaternion q_v = mult(qqu, q);
        return q_v.bcd;
    }

    public static Quaternion inv(Quaternion q) {
        float f = 1 / ((q.a * q.a) + (Vectors.dotProduct(q.bcd, q.bcd)));
        return new Quaternion(f*q.a, Vectors.mult(q.bcd, -f));
    }
}
