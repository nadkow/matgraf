package Matrices;

public class Matrix3f {
    public float elements[][] = new float[3][3];

    Matrix3f(){}

    public float getDeterminant() {
        return elements[0][0] * elements[1][1] * elements[2][2]
                + elements[0][1] * elements[1][2] * elements[2][0]
                + elements[0][2] * elements[1][0] * elements[2][1]
                - elements[2][2] * elements[1][1] * elements[2][0]
                - elements[0][1] * elements[1][0] * elements[2][2]
                - elements[0][0] * elements[1][2] * elements[2][1];
    }
}
