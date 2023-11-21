import Matrices.Matrices;
import Matrices.Matrix4f;
import Vectors.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dodawanie macierzy:");
        Matrix4f mat1 = new Matrix4f(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8);
        Matrix4f mat2 = new Matrix4f(0.5f, 0.99f, 0, 2, -1, -1, -1, -1, 1, 5, 0, 6, 2, -7, -9, 11);
        System.out.println(mat1);
        System.out.println(mat2);
        System.out.println("Wynik dodawania:");
        Matrix4f mat = Matrices.add(mat1, mat2);
        System.out.println(mat);

        System.out.println("Odejmowanie macierzy:");
        System.out.println(mat1);
        System.out.println(mat2);
        System.out.println("Wynik odejmowania:");
        mat = Matrices.sub(mat1, mat2);
        System.out.println(mat);

        System.out.println("Mnożenie powyższej macierzy przez skalar:");
        float f = -1.0f;
        System.out.println(f);
        System.out.println("Wynik mnożenia:");
        mat = Matrices.mult(mat, f);
        System.out.println(mat);

        System.out.println("Mnożenie macierzy:");
        System.out.println(mat1);
        System.out.println(mat2);
        System.out.println("Wynik mnozenia:");
        mat = Matrices.mult(mat1, mat2);
        System.out.println(mat);
        System.out.println("Wynik mnozenia w odwrotnej kolejności:");
        mat = Matrices.mult(mat2, mat1);
        System.out.println(mat);

        System.out.println("Obrot wektora [1, 0, 0, 1] wokol osi Y:");
        Vector4f vec = new Vector4f(1, 0, 0, 1);
        mat.setRotY( (float) Math.PI * 0.5f);
        System.out.println(mat);
        Vector4f rotated = Matrices.mult(mat, vec);
        System.out.println(rotated.elements[0]);
        System.out.println(rotated.elements[1]);
        System.out.println(rotated.elements[2]);
        System.out.println(rotated.elements[3]);
    }
}