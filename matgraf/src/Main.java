import Vectors.*;

public class Main {
    public static void main(String[] args) {
        Vector2 v2a = new Vector2(0, 3);
        Vector2 v2b = new Vector2(-1, -4);
        System.out.println(Vectors.add(v2a, v2b));
        System.out.println(Vectors.add(v2b, v2a));

        Vector3 v3a = new Vector3(0, 3, 0);
        Vector3 v3b = new Vector3(5, 5, 0);
        System.out.println(Vectors.angleDeg(v3a, v3b));

        Vector3 v3c = new Vector3(4, 5, 1);
        Vector3 v3d = new Vector3(4, 1, 3);
        Vector3 v3 = Vectors.crossProduct(v3c, v3d);
        System.out.println(v3);
        v3.normalize();
        System.out.println(v3);
        System.out.println(v3.getLength());
    }
}