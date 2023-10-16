import Vectors.*;

public class Main {
    public static void main(String[] args) {
        Vector2 v2a = new Vector2(0, 3);
        Vector2 v2b = new Vector2(0, 1);
        System.out.println(Vectors.add(v2a, v2b));
        System.out.println(Vectors.add(v2b, v2a));
        System.out.println(Vectors.dotProduct(v2a, v2b));
        System.out.println(Vectors.angle(v2a, v2b));
    }
}