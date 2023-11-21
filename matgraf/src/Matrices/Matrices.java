package Matrices;

import Vectors.Vector4f;

public abstract class Matrices {

    public static Matrix4f add(Matrix4f m1, Matrix4f m2) {
        Matrix4f result = new Matrix4f();
        result.elements[0][0] = m1.elements[0][0] + m2.elements[0][0];
        result.elements[0][1] = m1.elements[0][1] + m2.elements[0][1];
        result.elements[0][2] = m1.elements[0][2] + m2.elements[0][2];
        result.elements[0][3] = m1.elements[0][3] + m2.elements[0][3];
        result.elements[1][0] = m1.elements[1][0] + m2.elements[1][0];
        result.elements[1][1] = m1.elements[1][1] + m2.elements[1][1];
        result.elements[1][2] = m1.elements[1][2] + m2.elements[1][2];
        result.elements[1][3] = m1.elements[1][3] + m2.elements[1][3];
        result.elements[2][0] = m1.elements[2][0] + m2.elements[2][0];
        result.elements[2][1] = m1.elements[2][1] + m2.elements[2][1];
        result.elements[2][2] = m1.elements[2][2] + m2.elements[2][2];
        result.elements[2][3] = m1.elements[2][3] + m2.elements[2][3];
        result.elements[3][0] = m1.elements[3][0] + m2.elements[3][0];
        result.elements[3][1] = m1.elements[3][1] + m2.elements[3][1];
        result.elements[3][2] = m1.elements[3][2] + m2.elements[3][2];
        result.elements[3][3] = m1.elements[3][3] + m2.elements[3][3];
        return result;
    }

    public static Matrix4f sub(Matrix4f m1, Matrix4f m2) {
        Matrix4f result = new Matrix4f();
        result.elements[0][0] = m1.elements[0][0] - m2.elements[0][0];
        result.elements[0][1] = m1.elements[0][1] - m2.elements[0][1];
        result.elements[0][2] = m1.elements[0][2] - m2.elements[0][2];
        result.elements[0][3] = m1.elements[0][3] - m2.elements[0][3];
        result.elements[1][0] = m1.elements[1][0] - m2.elements[1][0];
        result.elements[1][1] = m1.elements[1][1] - m2.elements[1][1];
        result.elements[1][2] = m1.elements[1][2] - m2.elements[1][2];
        result.elements[1][3] = m1.elements[1][3] - m2.elements[1][3];
        result.elements[2][0] = m1.elements[2][0] - m2.elements[2][0];
        result.elements[2][1] = m1.elements[2][1] - m2.elements[2][1];
        result.elements[2][2] = m1.elements[2][2] - m2.elements[2][2];
        result.elements[2][3] = m1.elements[2][3] - m2.elements[2][3];
        result.elements[3][0] = m1.elements[3][0] - m2.elements[3][0];
        result.elements[3][1] = m1.elements[3][1] - m2.elements[3][1];
        result.elements[3][2] = m1.elements[3][2] - m2.elements[3][2];
        result.elements[3][3] = m1.elements[3][3] - m2.elements[3][3];
        return result;
    }

    public static Matrix4f mult(Matrix4f m1, float f) {
        Matrix4f result = new Matrix4f();
        result.elements[0][0] = m1.elements[0][0] * f;
        result.elements[0][1] = m1.elements[0][1] * f;
        result.elements[0][2] = m1.elements[0][2] * f;
        result.elements[0][3] = m1.elements[0][3] * f;
        result.elements[1][0] = m1.elements[1][0] * f;
        result.elements[1][1] = m1.elements[1][1] * f;
        result.elements[1][2] = m1.elements[1][2] * f;
        result.elements[1][3] = m1.elements[1][3] * f;
        result.elements[2][0] = m1.elements[2][0] * f;
        result.elements[2][1] = m1.elements[2][1] * f;
        result.elements[2][2] = m1.elements[2][2] * f;
        result.elements[2][3] = m1.elements[2][3] * f;
        result.elements[3][0] = m1.elements[3][0] * f;
        result.elements[3][1] = m1.elements[3][1] * f;
        result.elements[3][2] = m1.elements[3][2] * f;
        result.elements[3][3] = m1.elements[3][3] * f;
        return result;
    }

    public static Matrix4f mult(Matrix4f m1, Matrix4f m2) {
        Matrix4f result = new Matrix4f();
        result.elements[0][0] =
                m1.elements[0][0] * m2.elements[0][0] + m1.elements[0][1] * m2.elements[1][0] + m1.elements[0][2] * m2.elements[2][0] + m1.elements[0][3] * m2.elements[3][0];
        result.elements[0][1] =
                m1.elements[0][0] * m2.elements[0][1] + m1.elements[0][1] * m2.elements[1][1] + m1.elements[0][2] * m2.elements[2][1] + m1.elements[0][3] * m2.elements[3][1];
        result.elements[0][2] =
                m1.elements[0][0] * m2.elements[0][2] + m1.elements[0][1] * m2.elements[1][2] + m1.elements[0][2] * m2.elements[2][2] + m1.elements[0][3] * m2.elements[3][2];
        result.elements[0][3] =
                m1.elements[0][0] * m2.elements[0][3] + m1.elements[0][1] * m2.elements[1][3] + m1.elements[0][2] * m2.elements[2][3] + m1.elements[0][3] * m2.elements[3][3];
        result.elements[1][0] =
                m1.elements[1][0] * m2.elements[0][0] + m1.elements[1][1] * m2.elements[1][0] + m1.elements[1][2] * m2.elements[2][0] + m1.elements[1][3] * m2.elements[3][0];
        result.elements[1][1] =
                m1.elements[1][0] * m2.elements[0][1] + m1.elements[1][1] * m2.elements[1][1] + m1.elements[1][2] * m2.elements[2][1] + m1.elements[1][3] * m2.elements[3][1];
        result.elements[1][2] =
                m1.elements[1][0] * m2.elements[0][2] + m1.elements[1][1] * m2.elements[1][2] + m1.elements[1][2] * m2.elements[2][2] + m1.elements[1][3] * m2.elements[3][2];
        result.elements[1][3] =
                m1.elements[1][0] * m2.elements[0][3] + m1.elements[1][1] * m2.elements[1][3] + m1.elements[1][2] * m2.elements[2][3] + m1.elements[1][3] * m2.elements[3][3];
        result.elements[2][0] =
                m1.elements[2][0] * m2.elements[0][0] + m1.elements[2][1] * m2.elements[1][0] + m1.elements[2][2] * m2.elements[2][0] + m1.elements[2][3] * m2.elements[3][0];
        result.elements[2][1] =
                m1.elements[2][0] * m2.elements[0][1] + m1.elements[2][1] * m2.elements[1][1] + m1.elements[2][2] * m2.elements[2][1] + m1.elements[2][3] * m2.elements[3][1];
        result.elements[2][2] =
                m1.elements[2][0] * m2.elements[0][2] + m1.elements[2][1] * m2.elements[1][2] + m1.elements[2][2] * m2.elements[2][2] + m1.elements[2][3] * m2.elements[3][2];
        result.elements[2][3] =
                m1.elements[2][0] * m2.elements[0][3] + m1.elements[2][1] * m2.elements[1][3] + m1.elements[2][2] * m2.elements[2][3] + m1.elements[2][3] * m2.elements[3][3];
        result.elements[3][0] =
                m1.elements[3][0] * m2.elements[0][0] + m1.elements[3][1] * m2.elements[1][0] + m1.elements[3][2] * m2.elements[2][0] + m1.elements[3][3] * m2.elements[3][0];
        result.elements[3][1] =
                m1.elements[3][0] * m2.elements[0][1] + m1.elements[3][1] * m2.elements[1][1] + m1.elements[3][2] * m2.elements[2][1] + m1.elements[3][3] * m2.elements[3][1];
        result.elements[3][2] =
                m1.elements[3][0] * m2.elements[0][2] + m1.elements[3][1] * m2.elements[1][2] + m1.elements[3][2] * m2.elements[2][2] + m1.elements[3][3] * m2.elements[3][2];
        result.elements[3][3] =
                m1.elements[3][0] * m2.elements[0][3] + m1.elements[3][1] * m2.elements[1][3] + m1.elements[3][2] * m2.elements[2][3] + m1.elements[3][3] * m2.elements[3][3];
        return result;
    }

    public static Vector4f mult(Matrix4f m, Vector4f v) {
        Vector4f result = new Vector4f();
        result.elements[0] =
                m.elements[0][0] * v.elements[0] + m.elements[0][1] * v.elements[1] + m.elements[0][2] * v.elements[2] + m.elements[0][3] * v.elements[3];
        result.elements[1] =
                m.elements[1][0] * v.elements[0] + m.elements[1][1] * v.elements[1] + m.elements[1][2] * v.elements[2] + m.elements[1][3] * v.elements[3];
        result.elements[2] =
                m.elements[2][0] * v.elements[0] + m.elements[2][1] * v.elements[1] + m.elements[2][2] * v.elements[2] + m.elements[2][3] * v.elements[3];
        result.elements[3] =
                m.elements[3][0] * v.elements[0] + m.elements[3][1] * v.elements[1] + m.elements[3][2] * v.elements[2] + m.elements[3][3] * v.elements[3];
        return result;
    }
}
