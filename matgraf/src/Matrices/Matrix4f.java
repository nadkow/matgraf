package Matrices;

import java.util.Arrays;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Matrix4f {
    public float elements[][] = new float[4][4];

    public Matrix4f(){}

    public Matrix4f(float f) {
        set_all(f);
    }

    public Matrix4f(Matrix4f m){
        elements = m.elements.clone();
    }

    public Matrix4f(float e00, float e01, float e02, float e03,
             float e10, float e11, float e12, float e13,
             float e20, float e21, float e22, float e23,
             float e30, float e31, float e32, float e33){
        elements[0][0] = e00;
        elements[0][1] = e01;
        elements[0][2] = e02;
        elements[0][3] = e03;
        elements[1][0] = e10;
        elements[1][1] = e11;
        elements[1][2] = e12;
        elements[1][3] = e13;
        elements[2][0] = e20;
        elements[2][1] = e21;
        elements[2][2] = e22;
        elements[2][3] = e23;
        elements[3][0] = e30;
        elements[3][1] = e31;
        elements[3][2] = e32;
        elements[3][3] = e33;

    }

    public void set(int x, int y, float f) {
        elements[x][y] = f;
    }

    public void identity() {
        set_all(0.0f);
        elements[0][0] = 1.0f;
        elements[1][1] = 1.0f;
        elements[2][2] = 1.0f;
        elements[3][3] = 1.0f;
    }

    public void transpose() {
        float temp;
        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j <= 3; j++) {
                temp = elements[i][j];
                elements[i][j] = elements[j][i];
                elements[j][i] = temp;
            }
        }
    }

    public float getDeterminant() {
        float det = 0;
        float sign;
        int skip;
        for (int col = 0; col < 4; col++) {
            Matrix3f sub = new Matrix3f();
            skip = 0;
            for (int c = 0; c < 4; c++){
                if (c != col) {
                    sub.elements[0][c-skip] = elements[1][c];
                    sub.elements[1][c-skip] = elements[2][c];
                    sub.elements[2][c-skip] = elements[3][c];
                } else {
                    skip = 1;
                }
            }
            sign = (col % 2 == 0) ? 1: -1;
            det += sign * elements[0][col] * sub.getDeterminant();
        }
        return det;
    }

    public void setTranslation(float x, float y, float z) {
        elements[0][3] = x;
        elements[1][3] = y;
        elements[2][3] = z;
    }

    public void setScale(float x, float y, float z) {
        elements[0][0] = x;
        elements[1][1] = y;
        elements[2][2] = z;
    }

    public void setRotX(float angle) {
        float cos = (float) cos(angle);
        float sin = (float) sin(angle);
        identity();
        elements[1][1] = cos;
        elements[1][2] = -sin;
        elements[2][1] = sin;
        elements[2][2] = cos;
    }

    public void setRotY(float angle) {
        float cos = (float) cos(angle);
        float sin = (float) sin(angle);
        identity();
        elements[0][0] = cos;
        elements[0][2] = sin;
        elements[2][0] = -sin;
        elements[2][2] = cos;
    }

    public void setRotZ(float angle) {
        float cos = (float) cos(angle);
        float sin = (float) sin(angle);
        identity();
        elements[0][0] = cos;
        elements[0][1] = -sin;
        elements[1][0] = sin;
        elements[1][1] = cos;
    }

    public void set_all(float f) {
        for (float[] row : elements) {
            for (int i = 0; i < 4; i++) {
                row[i] = f;
            }
        }
    }

    @Override
    public String toString() {
        return "Matrix4f{\n" + Arrays.toString(elements[0]) + '\n'
                + Arrays.toString(elements[1]) + '\n'
                + Arrays.toString(elements[2]) + '\n'
                + Arrays.toString(elements[3]) + '}';
    }
}
