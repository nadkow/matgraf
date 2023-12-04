import Matrices.Matrices;
import Matrices.Matrix4f;
import Quaternions.Quaternion;
import Quaternions.Quaternions;
import Vectors.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dodawanie kwaternionow:");
        Quaternion q1 = new Quaternion(2.1f, 0.f, 22, -1);
        System.out.println(q1);
        Quaternion q2 = new Quaternion(-0.1f, 1, -1, -1);
        System.out.println(q2);
        System.out.println("Wynik dodawania:");
        Quaternion mat = Quaternions.add(q1, q2);
        System.out.println(mat);

        System.out.println("Odejmowanie kwaternionow:");
        System.out.println(q1);
        System.out.println(q2);
        System.out.println("Wynik odejmowania:");
        mat = Quaternions.sub(q1, q2);
        System.out.println(mat);

        System.out.println("Dzielenie kwaternionow:");
        System.out.println(q1);
        System.out.println(q2);
        System.out.println("Wynik dzielenia:");
        mat = Quaternions.div(q1, q2);
        System.out.println(mat);

        System.out.println("Obrot wektora [-1, -1, -1] wokol osi Y:");
        Vector3 vec = new Vector3(-1, -1, -1);
        mat.rotation(new Vector3(1, 0, 0), (float) Math.PI * 1.5f);
        System.out.println(mat);
        Vector3 rotated = Quaternions.rotate(mat, vec);
        System.out.println(rotated);

        System.out.println("Mnożenie kwaternionow:");
        System.out.println(q1);
        System.out.println(q2);
        System.out.println("Wynik mnozenia:");
        mat = Quaternions.mult(q1, q2);
        System.out.println(mat);
        System.out.println("Wynik mnozenia w odwrotnej kolejności:");
        mat = Quaternions.mult(q2, q1);
        System.out.println(mat);
    }
}