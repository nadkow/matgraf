package Vectors;

public class Vector4f {

    public float elements[] = new float[4];

    public Vector4f(){}

    public Vector4f(float a, float b, float c, float d) {
        elements[0] = a;
        elements[1] = b;
        elements[2] = c;
        elements[3] = d;
    }

    public Vector4f(Vector3 v) {
        elements[0] = v.getX();
        elements[1] = v.getY();
        elements[2] = v.getZ();
        elements[3] = 1.0f;
    }
}
